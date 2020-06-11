package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
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
    private ArrayList<List<MissionResponse>> missions = new ArrayList<>();
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

        mAdapter.notifyDataSetChanged();
//        try {
//          //  String missionName = viewModel.getMissions().
//           // Log.i(TAG, "onCreate: " + missionName);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//        mainActivityViewModel.getMissions().observe(this, new Observer<MissionResponse>() {
//            @Override
//            public void onChanged(MissionResponse missions) {
//
//            }
//        });


    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        String missionName = viewModel.getMissions().getValue().get(clickedItemIndex).getMission_name();
        String missionDescription = viewModel.getMissions().getValue().get(clickedItemIndex).getDetails();
        String missionPatchURL = viewModel.getMissions().getValue().get(clickedItemIndex).getLinks().getMissionPatch();
        String launchSiteName = viewModel.getMissions().getValue().get(clickedItemIndex).getLaunch_site().getSiteNameLong();

        Log.i(TAG, "onListItemClick: " + viewModel.getMissions().getValue().get(clickedItemIndex).getMission_name());
        Toast.makeText(this, "Mission you clicked" + missionName, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Mission id you clicked" + missionDescription, Toast.LENGTH_SHORT).show();
        Intent detailsIntent = new Intent(MainActivity.this, ActivityDetail.class);
        detailsIntent.putExtra("mission_name", missionName);
        detailsIntent.putExtra("mission_description", missionDescription);
        detailsIntent.putExtra("mission_patch_URL", missionPatchURL);
        detailsIntent.putExtra("launch_site", launchSiteName);

        startActivity(detailsIntent);
    }

    public void updateButton(View view) {
        viewModel.getMissions().observe(this, new Observer<List<MissionResponse>>() {
            @Override
            public void onChanged(List<MissionResponse> missionResponses) {
                mAdapter.notifyDataSetChanged();
            }
        });
    }
}
