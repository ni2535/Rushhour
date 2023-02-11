package com.example.rushhour;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;

public class LevelsAdapter extends RecyclerView.Adapter<LevelsAdapter.ViewHolder> {

    private final String[] mDataSet;
    private final Context mContext;

    public LevelsAdapter(String[] dataSet,Context context) {
        mDataSet = dataSet;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_level_button, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getButton().setText("Level" + " " + mDataSet[position]);
        viewHolder.getButton().setOnClickListener(view -> {
            Intent intent = new Intent(mContext,GameActivity.class);
            intent.putExtra("position",position);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Button btnLevel;

        public ViewHolder(View v) {
            super(v);
            btnLevel = v.findViewById(R.id.btnLevel);
        }

        public Button getButton() {
            return btnLevel;
        }
    }
}
