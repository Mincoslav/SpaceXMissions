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
        repository = Repository.getInstance();
        mMissions = repository.getMissions(getRandomFlightNumber());
    }

    public MutableLiveData<List<MissionResponse>> getMissions() {
        return mMissions;
    }
}
