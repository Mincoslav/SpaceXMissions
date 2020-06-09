package com.example.spacexmissions;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.spacexmissions.missionModel.Mission;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class Repository {

    private static Repository instance;

    public static synchronized Repository getInstance(){
        if (instance == null){
            instance = new Repository();
        }
        return instance;
    }

    private MissionApi missionApi;

    public Repository(){
        missionApi = ServiceGenerator.getMissionApi();
    }

    public MutableLiveData<Mission> getMissions(){

        MutableLiveData<Mission> missions = new MutableLiveData<>();
        MissionApi missionApi = ServiceGenerator.getMissionApi();
        Call<MissionResponse> call = missionApi.MISSION_RESPONSE_CALL();
        Log.i("Retrofit", "getMissions: " + call.toString());
        call.enqueue(new Callback<MissionResponse>() {
            @Override
            public void onResponse(Call<MissionResponse> call,
                                   Response<MissionResponse> response) {
                Log.i("Retrofit", "onResponse: Response: " + response.code());
                Log.i("Retrofit", "onResponse: Response: " + response.toString());
                if (response.code() == 200){
                  //  Gson gson = new Gson();
                  //  Mission[] missions1 = gson.fromJson(String.valueOf(response.body()), Mission[].class);
                  //  System.out.println(Arrays.toString(missions1));
                  //  Log.i("Retrofit", "onResponse: " + response.body().get(10).getMissions().getMissionName());
                    missions.setValue(response.body().getMissions());
                    Log.i("Retrofit", "onResponse: " + missions.getValue().getMissionName());
//                    Log.i("Retrofit", "onResponse: " + missions.getValue().getLaunchSite().getSiteNameLong());
//                    Log.i("Retrofit", "onResponse: IMAGE " + missions.getValue().getLinks().getMissionPatchSmall());

                    Log.i("Retrofit", "onResponse:getting the body " + response.body().flight_number);
                    Log.i("Retrofit", "onResponse: "+ missions.getValue().getFlightNumber());
                }
            }

            @Override
            public void onFailure(Call<MissionResponse> call, Throwable t) {
                Log.i("Retrofit", "onFailure: " + call.toString());
                Log.i("Retrofit", "onFailure: Response: " + t.getMessage());
                Log.i("Retrofit", "onFailure: Response: " + t.toString());
                Log.i("Retrofit", "onFailure: Something fucked up and you should switch to database");
                //TODO implement using local database cache
            }
        });


        /*final MutableLiveData<List<Mission>> missions = new MutableLiveData<>();

        ServiceGenerator.getMissionApi().getMissions().enqueue(new Callback<MissionResponse>() {
            @Override
            public void onResponse(Call<MissionResponse> call, Response<MissionResponse> response) {
                if (response.code() == 200){
                    System.out.println("PRINTING MISSION: " + response.body().getMission().get(0));
                    missions.setValue(response.body().getMission());
                }
            }

            @Override
            public void onFailure(Call<MissionResponse> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong :(");
                //TODO Load it from the room database
            }
        });*/
        return missions;
    }
}
