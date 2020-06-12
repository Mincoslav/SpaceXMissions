package com.example.spacexmissions;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private List<MissionResponse> missions = new ArrayList<>();
    final private OnListItemClickListener onListItemClickListener;
    private Context context;
    private MainActivityViewModel viewModel;

    public RecyclerViewAdapter(OnListItemClickListener onListItemClickListener, Context context) {
        this.context = context;
        this.onListItemClickListener = onListItemClickListener;
//        Log.i(TAG, "RecyclerViewAdapter: " + missions.get(0).mission_name);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_item, parent, false);

        return new ViewHolder(view);
    }

    public void setMissions(List<MissionResponse> missions) {
        this.missions = missions;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        try {

            viewHolder.mission_name.setText(missions.get(position).getMission_name());
            viewHolder.mission_description.setText(missions.get(position).getDetails());

            Glide.with(viewHolder.mission_patch)
                    .asDrawable()
                    .load(missions.get(position).getLinks().getMissionPatchSmall())
                    .into(viewHolder.mission_patch);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return missions.size(); //sets the recyclerView tabs
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView mission_patch;
        TextView mission_name;
        TextView mission_description;
        LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            mission_patch = itemView.findViewById(R.id.mission_patch_small);
            mission_name = itemView.findViewById(R.id.mission_name);
            mission_description = itemView.findViewById(R.id.mission_description);
            //parentLayout = itemView.findViewById(R.id.parent_layout);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onListItemClickListener.onListItemClick(getAdapterPosition());
        }
    }

    public interface OnListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }
}
