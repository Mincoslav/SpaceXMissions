package com.example.spacexmissions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<Mission>> mMissions;

    private Repository repository;

    public LiveData<List<Mission>> getMissions(){
        return mMissions;
    }

    public MainActivityViewModel() {
        repository = Repository.getInstance();
    }

    public MutableLiveData<List<Mission>> updateMissions() {
        return repository.updateMissions();
    }

    //TODO add repository methods for access from MainActivity

}
