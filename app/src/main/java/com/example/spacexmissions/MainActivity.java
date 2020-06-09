package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.spacexmissions.missionModel.Mission;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnListItemClickListener{


    private ArrayList<Mission> missions = new ArrayList<>();
    RecyclerView rvMissions;
    MainActivityViewModel viewModel;
    RecyclerViewAdapter adapter;
    RecyclerView.Adapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity ", "onCreate: started.");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMissions = findViewById(R.id.recyclerView);
        rvMissions.hasFixedSize();
        rvMissions.setLayoutManager(new LinearLayoutManager(this));
        viewModel = new MainActivityViewModel();

        viewModel.init();
        missions.add(viewModel.getMissions().getValue());

        mAdapter = new RecyclerViewAdapter(missions, this, getApplicationContext());
        rvMissions.setAdapter(mAdapter);





//        mainActivityViewModel.getMissions().observe(this, new Observer<MissionResponse>() {
//            @Override
//            public void onChanged(MissionResponse missions) {
//
//            }
//        });



    }




    @Override
    public void onListItemClick(int clickedItemIndex) {
        String missionName = viewModel.getMissions().getValue().getMissionName();
        Toast.makeText(this, "Mission you clicked" + missionName, Toast.LENGTH_SHORT).show();
    }
}
