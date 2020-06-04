package com.example.spacexmissions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<Mission>> mMissions;

    public LiveData<List<Mission>> getMissions(){
        return mMissions;
    }
}
