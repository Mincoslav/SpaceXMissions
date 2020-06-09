package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;
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

    private MainActivityViewModel mainActivityViewModel;

    public static final String TAG = "MainActivity";

    private ArrayList<Mission> missions = new ArrayList<>();
    RecyclerView rvMissions;
    MainActivityViewModel viewModel;
    RecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: started.");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMissions = findViewById(R.id.recyclerView);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.init();



        ArrayList<Mission> missions = new ArrayList<>();


        /*mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        mainActivityViewModel.getMissions().observe(this, new Observer<List<Mission>>() {
            @Override
            public void onChanged(List<Mission> missions) {

            }
        });*/

        //setupRecyclerView();
        initRecyclerView();
    }

    private void setupRecyclerView(){
        if (adapter == null) {
            adapter = new RecyclerViewAdapter(missions,this,MainActivity.this);
            rvMissions.setAdapter(adapter);
            rvMissions.setLayoutManager(new LinearLayoutManager(this));
            rvMissions.setItemAnimator(new DefaultItemAnimator());
            rvMissions.setNestedScrollingEnabled(true);
        }
        else {
            adapter.notifyDataSetChanged();
        }

    }
    
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(missions,this,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
      //  String missionName = viewModel.getmMissions().getValue().get(clickedItemIndex).getMissionName();
      //  Toast.makeText(this, "Mission you clicked" + missionName, Toast.LENGTH_SHORT).show();
    }
}
