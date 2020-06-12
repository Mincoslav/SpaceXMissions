package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.spacexmissions.missionModel.Mission;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnListItemClickListener {

    private static final String TAG = "MAIN ACTIVITY";
    private List<MissionResponse> missions = new ArrayList<>();
    RecyclerView rvMissions;
    MainActivityViewModel viewModel;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Log.d("MainActivity ", "onCreate: started.");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMissions = findViewById(R.id.recyclerView);
        rvMissions.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RecyclerViewAdapter( this, getApplicationContext());
        rvMissions.setAdapter(adapter);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.init();
        viewModel.getMissions().observe(this, new Observer<List<MissionResponse>>() {
            @Override
            public void onChanged(List<MissionResponse> missionResponses) {
                missions.addAll(missionResponses);
                adapter.setMissions(missions);
            }
        });
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
//        Log.i(TAG, "onListItemClick: clickedItemIndex" + clickedItemIndex);
        String missionName = viewModel.getMissions().getValue().get(clickedItemIndex).getMission_name();
        String missionDescription = viewModel.getMissions().getValue().get(clickedItemIndex).getDetails();
        String missionPatchURL = viewModel.getMissions().getValue().get(clickedItemIndex).getLinks().getMissionPatch();
        String launchSiteName = viewModel.getMissions().getValue().get(clickedItemIndex).getLaunch_site().getSiteNameLong();
        int missionID = viewModel.getMissions().getValue().get(clickedItemIndex).getFlight_number();

//        Log.i(TAG, "onListItemClick: " + viewModel.getMissions().getValue().get(clickedItemIndex).getMission_name());
//        Toast.makeText(this, "Mission you clicked" + missionName, Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "Mission id you clicked" + missionDescription, Toast.LENGTH_SHORT).show();
        Intent detailsIntent = new Intent(MainActivity.this, ActivityDetail.class);
        detailsIntent.putExtra("mission_name", missionName);
        detailsIntent.putExtra("mission_description", missionDescription);
        detailsIntent.putExtra("mission_patch_URL", missionPatchURL);
        detailsIntent.putExtra("launch_site", launchSiteName);
        detailsIntent.putExtra("mission_id", missionID);
        System.out.println(missionID);

        startActivity(detailsIntent);
    }

    public void updateButton(View view) {
        viewModel.init();

        viewModel.getMissions().observe(this, new Observer<List<MissionResponse>>() {
            @Override
            public void onChanged(List<MissionResponse> missionResponses) {

                for (int i = 0; i < missionResponses.size(); i++) {

                    if (!missions.contains(missionResponses.get(i))){
                        missions.add(missionResponses.get(i));
                    }
                }
                adapter.setMissions(missions);
            }
        });
    }
}
