package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnListItemClickListener{

    private MainActivityViewModel mainActivityViewModel;

    public static final String TAG = "MainActivity";

    RecyclerView missionsList;
    RecyclerView.Adapter missionsAdapter;

    //vars
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> imageURLs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        missionsList = findViewById(R.id.recyclerView);
        missionsList.hasFixedSize();
        missionsList.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Mission> missions = new ArrayList<>();

        initImageBitmaps();
        /*mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        mainActivityViewModel.getMissions().observe(this, new Observer<List<Mission>>() {
            @Override
            public void onChanged(List<Mission> missions) {

            }
        });*/
        initRecyclerView();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        imageURLs.addAll(mainActivityViewModel.getMissions().getValue().get(0).)

        imageURLs.add("https://images2.imgbox.com/9a/96/nLppz9HW_o.png");
        names.add("Startlink mission");

        initRecyclerView();
    }
    
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(names,imageURLs, missions, onListItemClickListener, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {

    }
}
