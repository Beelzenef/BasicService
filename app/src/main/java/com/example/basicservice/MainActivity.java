package com.example.basicservice;

import android.app.IntentService;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_RunService;
    Button btn_StopService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_RunService = (Button) findViewById(R.id.btn_ArrancarService);
        btn_StopService = (Button) findViewById(R.id.btn_StopService);

        btn_RunService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MiService.class);
                startService(intent);
            }
        });

        btn_StopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MiService.class);
                stopService(intent);
            }
        });
    }
}
