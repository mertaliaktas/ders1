package com.example.ders2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bnd = getIntent().getExtras();
        String alinan = bnd.getString("gonder");
        Toast.makeText(this, alinan, Toast.LENGTH_SHORT).show();

    }
}
