package com.example.spacexmissions;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.spacexmissions.missionModel.Mission;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<Mission> mMissions;
    private Repository repository;

    public void init(){
        if (mMissions != null){
            return;
        }
        repository = Repository.getInstance();
        mMissions = repository.getMissions();

    }

    public MutableLiveData<Mission> getMissions() {
//        System.out.println("++++++++++"+mMissions.getValue().mission_name);
        return mMissions;
    }



    //TODO add repository methods for access from MainActivity

}
