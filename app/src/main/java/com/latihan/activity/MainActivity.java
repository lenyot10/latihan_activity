package com.latihan.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnStar, btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStar = (Button) findViewById(R.id.btn_start_activity);
        btnClose = (Button) findViewById(R.id.btn_close);

        btnStar.setOnClickListener(this);
        btnClose.setOnClickListener(this);

        Toast.makeText(this, "activity create", Toast.LENGTH_SHORT).show();
    }

    protected void onStar() {
        super.onStart();

        Toast.makeText(this, "Activity: onStart()", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show();
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start_activity:
                // buka activity browser
                Intent pencintaanime = new Intent(Intent.ACTION_VIEW);
                pencintaanime.setData(Uri.parse("http://animeindo.co"));
                startActivity(pencintaanime);
                break;
            case R.id.btn_close:
                finish();
                break;
        }
    }
}
