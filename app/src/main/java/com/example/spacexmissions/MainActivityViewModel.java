package com.example.spacexmissions;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;
import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<MissionResponse>> mMissions;
    private Repository repository;
    Random random = new Random();

    public int getRandomFlightNumber(){

        return random.nextInt(100);
    }

    public void init(){
//        if (mMissions != null){
//            return;
//        }
        repository = Repository.getInstance();
        mMissions = repository.getMissions(getRandomFlightNumber());

    }

    public MutableLiveData<List<MissionResponse>> getMissions() {
//        Log.i("ViewModel", "getMissions: " + mMissions.getValue().getMission_name());
        return mMissions;
    }



    //TODO add repository methods for access from MainActivity

}
