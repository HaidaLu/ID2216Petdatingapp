package com.example.petdatingapp;
import androidx.annotation.NonNull;
//import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
//import com.google.firebase.database.core.view.View;

public class MatchesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView mMatchId;

    public MatchesViewHolder(@NonNull android.view.View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        mMatchId = (TextView) itemView.findViewById(R.id.Matchid);

    }


    @Override
    public void onClick(View v) {

    }
}
