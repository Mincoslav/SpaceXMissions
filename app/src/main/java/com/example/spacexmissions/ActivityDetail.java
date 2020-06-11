package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

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

        bundle = getIntent().getExtras();
        String missionName = bundle.getString("mission_name");
        String missionDescription = bundle.getString("mission_description");
        String missionPatchURL = bundle.getString("mission_patch_URL");

        try {
            Glide.with(this)
                    .asDrawable()
                    .load(missionPatchURL)
                    .into(missionPatchLarge);

            missionNameView.setText(missionName);
            missionDescriptionView.setText(missionDescription);
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

            startActivity(mapsIntent);

        }
        catch (Exception e) {
            e.printStackTrace();
        }




    }
}
