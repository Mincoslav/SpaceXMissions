package com.example.spacexmissions;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> imageNames = new ArrayList<>();
    private ArrayList<String> images = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> imageNames, ArrayList<String> images, Context context) {
        this.imageNames = imageNames;
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(context)
                .asBitmap()
                .load(images.get(position))
                .into(holder.mission_patch);

        holder.mission_name.setText(imageNames.get(position));
        
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO add intent to go to ACTIVITY_DETAIL
                Log.d(TAG, "onClick: clicked on: " + imageNames.get(position));

                Toast.makeText(context, imageNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageNames.size(); //sets the recyclerView tabs
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView mission_patch;
        TextView mission_name;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mission_patch = itemView.findViewById(R.id.mission_patch_small);
            mission_name = itemView.findViewById(R.id.mission_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
