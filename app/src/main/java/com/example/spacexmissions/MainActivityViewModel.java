package com.example.spacexmissions;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.spacexmissions.missionModel.Mission;

public class MainActivityViewModel extends ViewModel {

    private LiveData<MissionResponse> mMissions;
    private Repository repository;

    public void init(){
        if (mMissions != null){
            return;
        }
        repository = Repository.getInstance();
        mMissions = repository.getMissions();

    }

    public LiveData<MissionResponse> getMissions() {
//        Log.i("ViewModel", "getMissions: " + mMissions.getValue().getMission_name());
        return mMissions;
    }



    //TODO add repository methods for access from MainActivity

}
