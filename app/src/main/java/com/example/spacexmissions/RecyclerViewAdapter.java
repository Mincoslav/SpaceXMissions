package com.example.spacexmissions;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<Mission> missions;
    final private OnListItemClickListener onListItemClickListener;
    private Context context;

    public RecyclerViewAdapter(ArrayList<Mission> missions, OnListItemClickListener onListItemClickListener, Context context) {
        this.context = context;
        this.missions = missions;
        this.onListItemClickListener = onListItemClickListener;
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        //Set the image
        RequestOptions defaultOptions = new RequestOptions()
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .asBitmap()
                .load(missions.get(position))
                .into(viewHolder.mission_patch);

        //Set the text fields
        viewHolder.mission_name.setText(missions.get(position).getName());
        viewHolder.mission_description.setText(missions.get(position).getDescription());

        
        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO add intent to go to ACTIVITY_DETAIL
                Log.d(TAG, "onClick: clicked on: " + missions.get(position));

                Toast.makeText(context, missions.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    public int getItemCount() {
        return missions.size(); //sets the recyclerView tabs
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView mission_patch;
        TextView mission_name;
        TextView mission_description;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mission_patch = itemView.findViewById(R.id.mission_patch_small);
            mission_name = itemView.findViewById(R.id.mission_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onListItemClickListener.onListItemClick(getAdapterPosition());
        }
    }

    private interface OnListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }
}
