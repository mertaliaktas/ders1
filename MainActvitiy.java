package com.example.ders2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button2);

    }
    public void onClick(View v)
    {
        String x = "Merhaba";
        Intent i = new Intent(getApplicationContext(),Main2Activity.class);
        i.putExtra("gonder",x);
        startActivity(i);

    }
}
