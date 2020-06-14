package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class ActivityDetail extends AppCompatActivity {

    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView missionNameView = findViewById(R.id.mission_name);
        TextView missionDescriptionView = findViewById(R.id.mission_description);
        ImageView missionPatchLarge = findViewById(R.id.mission_patch_large);
        TextView launchSite = findViewById(R.id.launch_site);
        TextView missionIdView = findViewById(R.id.mission_ID);


        bundle = getIntent().getExtras();
        String missionName = bundle.getString("mission_name");
        String missionDescription = bundle.getString("mission_description");
        String missionPatchURL = bundle.getString("mission_patch_URL");
        String launchSiteName = bundle.getString("launch_site");
        int missionID = bundle.getInt("mission_id");

        getSupportActionBar().setTitle(missionName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        try {
            Glide.with(this)
                    .asDrawable()
                    .load(missionPatchURL)
                    .into(missionPatchLarge);

            missionNameView.setText(missionName);
            missionDescriptionView.setText(missionDescription);
            launchSite.setText(launchSiteName);
            missionIdView.setText(missionID+"");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void launchSite(View view) {
        Intent mapsIntent = new Intent(ActivityDetail.this, MapsActivity.class);
        bundle = getIntent().getExtras();
        try {
            String launchSite = bundle.getString("launch_site");
            Geocoder gc = new Geocoder(this);
            List<Address> addresses = gc.getFromLocationName(launchSite, 1);

            List<LatLng> latLng = new ArrayList<LatLng>();
            for (Address a: addresses) {
                if (a.hasLatitude() && a.hasLongitude()) {
                    latLng.add(new LatLng(a.getLatitude(), a.getLongitude()));
                }
            }

            mapsIntent.putExtra("launch_site_location", latLng.get(0));
            mapsIntent.putExtra("launch_site_name", launchSite);

            startActivity(mapsIntent);

        }
        catch (Exception e) {
            Toast.makeText(this, "No location available", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
