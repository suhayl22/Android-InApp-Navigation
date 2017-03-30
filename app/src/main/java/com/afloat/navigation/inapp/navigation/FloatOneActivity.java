package com.afloat.navigation.inapp.navigation;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class FloatOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

                createDialog();
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
            createDialog();

    }

    public void createDialog(){

        //Custom Dialog
        final AlertDialog.Builder builder = new AlertDialog.Builder(FloatOneActivity.this);
        LayoutInflater inflater = LayoutInflater.from(FloatOneActivity.this);
        final View content = inflater.inflate(R.layout.customdialog, null);
        builder.setView(content);
        builder.setCancelable(true);

        ImageButton imageButtonHome, imageButtonExit, imageButtonSettings, imageButtonNexus;

        imageButtonHome = (ImageButton) content.findViewById(R.id.btnHome);
        imageButtonNexus = (ImageButton) content.findViewById(R.id.btnNexus);
        imageButtonSettings = (ImageButton) content.findViewById(R.id.btnSettings);
        imageButtonExit = (ImageButton) content.findViewById(R.id.btnExit);

        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FloatOneActivity.this, MainActivity.class);
//                startActivity(new Intent(FloatOneActivity.this, MainActivity.class));
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        imageButtonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK );
                startActivity(intent);
            }
        });

        AlertDialog customDialog = builder.create();
        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        customDialog.show();
    }
}
