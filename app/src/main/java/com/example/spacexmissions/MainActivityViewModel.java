package com.example.spacexmissions;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<MissionResponse> mMissions;
    private Repository repository;

    public void init(){
        if (mMissions != null){
            return;
        }
        repository = Repository.getInstance();
        mMissions = repository.getMissions();
    }

    public MutableLiveData<MissionResponse> getmMissions() {
        return mMissions;
    }

    //TODO add repository methods for access from MainActivity

}
