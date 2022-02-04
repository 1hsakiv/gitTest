package com.example.signal;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
//        ImageView imageView = findViewById(R.id.imageView);
//        Button btn1 = findViewById(R.id.button1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),WebActivity.class);
                intent.putExtra("url", "https://youtu.be/DKB32L_yB6w");
                startActivity(intent);
            }
        });

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent  = new Intent(getApplicationContext(),WebActivity.class);
////                intent.putExtra("url", "http://172.17.74.4:32400/web/index.html#!/server/967ba6c05da9df5de2afd10b6868c7753f7f2fb9/details?key=%2Flibrary%2Fmetadata%2F11&context=home%3Ahub.continueWatching~0~0");
//                intent.putExtra("url", "http://172.17.74.4:32400/web/index.html#!/server/967ba6c05da9df5de2afd10b6868c7753f7f2fb9/details?key=%2Flibrary%2Fmetadata%2F11&context=home%3Ahub.continueWatching~0~0");
//                startActivity(intent);
//            }
//        });
    }


}