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

    private ArrayList<Mission> missionArrayList = new ArrayList<>();

    public static Repository getInstance(){
        if (instance == null){
            instance = new Repository();
        }
        return instance;
    }

    public MutableLiveData<List<Mission>> getMissions(){

        final MutableLiveData<List<Mission>> missions = new MutableLiveData<>();

        ServiceGenerator.getMissionApi().getMissions().enqueue(new Callback<MissionResponse>() {
            @Override
            public void onResponse(Call<MissionResponse> call, Response<MissionResponse> response) {
                if (response.code() == 200){
                    missions.setValue(response.body().getMission());
                }
            }

            @Override
            public void onFailure(Call<MissionResponse> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong :(");
                //TODO Load it from the room database
            }
        });
        return missions;
    }
}
