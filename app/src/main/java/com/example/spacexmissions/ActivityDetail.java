package com.example.spacexmissions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView missionNameView = findViewById(R.id.mission_name);
        TextView missionDescriptionView = findViewById(R.id.mission_description);
        ImageView missionPatchLarge = findViewById(R.id.mission_patch_large);

        Bundle bundle = getIntent().getExtras();
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
}
