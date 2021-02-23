package com.example.petdatingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
    }

    public void goToPost(View view) {
        Intent intent = new Intent(CommunityActivity.this,PostActivity.class);
        startActivity(intent);
        return;
    }
}