package com.example.petdatingapp.Chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petdatingapp.R;

//import android.view.View.OnClickListener;
//import com.google.firebase.database.core.view.View;

public class ChatViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
    }
}
