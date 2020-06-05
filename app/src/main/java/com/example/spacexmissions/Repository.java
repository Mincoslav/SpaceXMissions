package com.example.spacexmissions;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private static Repository instance;
    private MutableLiveData<List<Mission>> missions;

    private Repository(){
        missions = new MutableLiveData<>();
    }

    public static synchronized Repository getInstance(){
        if (instance == null){
            instance = new Repository();
        }
        return instance;
    }

    public LiveData<List<Mission>> getMissions() {
        return missions;
    }

    public MutableLiveData<List<Mission>> updateMissions(){

        MissionApi missionApi = ServiceGenerator.getMissionApi();
        Call<MissionResponse> call = missionApi.getMissions();
        call.enqueue(new Callback<MissionResponse>() {
            @Override
            public void onResponse(Call<MissionResponse> call, Response<MissionResponse> response) {
                if (response.code() == 200){
                    missions.setValue(response.body().getMission());
                    System.out.println(response.body().getMission().toString());
                }
            }

            @Override
            public void onFailure(Call<MissionResponse> call, Throwable t) {
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
