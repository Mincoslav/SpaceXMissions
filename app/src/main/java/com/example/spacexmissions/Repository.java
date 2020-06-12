package com.example.spacexmissions;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private static Repository instance;
    List<MissionResponse> missionResponseList;

    public static synchronized Repository getInstance(){
        if (instance == null){
            instance = new Repository();
        }
        return instance;
    }

    private MissionApi missionApi;

    public Repository(){
        missionApi = ServiceGenerator.getMissionApi();
        missionResponseList = new ArrayList<>();
    }

    public MutableLiveData<List<MissionResponse>> getMissions(int flightNumber){

        MutableLiveData<MissionResponse> missions = new MutableLiveData<>();
        MissionApi missionApi = ServiceGenerator.getMissionApi();
        Call<MissionResponse> call = missionApi.MISSION_RESPONSE_CALL(flightNumber);
//        Log.i("Retrofit", "getMissions: " + call.toString());
        call.enqueue(new Callback<MissionResponse>() {
            @Override
            public void onResponse(Call<MissionResponse> call,
                                   Response<MissionResponse> response) {
//                Log.i("Retrofit", "onResponse: Response: " + response.code());
//                Log.i("Retrofit", "onResponse: Response: " + response.toString());
                if (response.code() == 200){
                    missions.setValue(response.body());

//                    Log.i("Retrofit", "onResponse: " + missions.getValue().getMission_name());
//                    Log.i("Retrofit", "onResponse: " + missions.getValue().getLaunchSite().getSiteNameLong());
//                    Log.i("Retrofit", "onResponse: IMAGE " + missions.getValue().getLinks().getMissionPatchSmall());
//                    Log.i("Retrofit", "onResponse:getting the body " + response.body().flight_number);
//                    Log.i("Retrofit", "onResponse: "+ missions.getValue().getMission_name());

                    missionResponseList.add(response.body());
                    System.out.println(missionResponseList.get(0).mission_name);
                    System.out.println(missionResponseList.get(0).details);
                    System.out.println(missionResponseList.get(0).launch_site.getSiteName());
                    System.out.println(missionResponseList.get(0).links.getMissionPatchSmall());
                }
            }

            @Override
            public void onFailure(Call<MissionResponse> call, Throwable t) {
                Log.i("Retrofit", "onFailure: " + call.toString());
                Log.i("Retrofit", "onFailure: Response: " + t.getMessage());
                Log.i("Retrofit", "onFailure: Response: " + t.toString());
                //TODO something with the database maybe?
            }
        });

        MutableLiveData<List<MissionResponse>> listMutableLiveData = new MutableLiveData<>();
        listMutableLiveData.setValue(missionResponseList);

        return listMutableLiveData;
    }
}
