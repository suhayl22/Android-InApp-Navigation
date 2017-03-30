package com.afloat.navigation.inapp.navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnDialog = (Button) findViewById(R.id.btnDialog);
        mBtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MainActivity.this, FloatOneActivity.class));

//
//                //Custom Dialog
//                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
//                final View content = inflater.inflate(R.layout.customdialog, null);
//                builder.setView(content);
//
//
//                builder.setCancelable(true);
//                builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int id) {
//
//                    }
//                })
//                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                //cancel();
//                            }
//                        });
//                AlertDialog cusDialog = builder.create();
//                cusDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//                cusDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                cusDialog.show();

            }
        });
    }
}
