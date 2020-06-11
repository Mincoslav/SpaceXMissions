package com.example.spacexmissions;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.spacexmissions.missionModel.Mission;

import java.util.List;
import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private LiveData<List<MissionResponse>> mMissions;
    private Repository repository;
    Random random = new Random();

    public int getFlightNumber(){

        return random.nextInt(100);
    }

    public void init(){
        if (mMissions != null){
            return;
        }
        repository = Repository.getInstance();
        mMissions = repository.getMissions(random.nextInt(100));

    }

    public LiveData<List<MissionResponse>> getMissions() {
//        Log.i("ViewModel", "getMissions: " + mMissions.getValue().getMission_name());
        return mMissions;
    }



    //TODO add repository methods for access from MainActivity

}
