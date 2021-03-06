package com.gunglaksman.sekar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    Button btnCamera, btnUpdates, btnContents;
    String newUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnCamera = (Button) findViewById(R.id.btnScan);
        btnContents = (Button) findViewById(R.id.btnMenu);
        btnUpdates = (Button) findViewById(R.id.btnUpdates);



        //Intent intent = getIntent();
        //Bundle bundle = intent.getExtras();
        //if(bundle != null){
            //newUsername = bundle.getString("newUsername");
        //}

        newUsername = getIntent().getStringExtra("newUsername");

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camera = new Intent(MainMenuActivity.this, SubActivity.class);
                camera.putExtra("finalUsername", newUsername);
                startActivity(camera);
            }
        });

        btnContents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contents = new Intent(MainMenuActivity.this, MenuActivity.class);
                startActivity(contents);
            }
        });

        btnUpdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent updates = new Intent(MainMenuActivity.this, UpdatesActivity.class);
                startActivity(updates);
            }
        });
    }

}
