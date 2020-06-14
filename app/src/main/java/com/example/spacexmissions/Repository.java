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
        call.enqueue(new Callback<MissionResponse>() {
            @Override
            public void onResponse(Call<MissionResponse> call,
                                   Response<MissionResponse> response) {
                if (response.code() == 200){
                    missions.setValue(response.body());
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
