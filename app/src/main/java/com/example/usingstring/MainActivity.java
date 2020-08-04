package com.example.usingstring;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtvMsg2 = findViewById(R.id.tvMsg2);
        txtvMsg2.setText(R.string.Msg2);

        Log.i("lifecycle","On create called...");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("lifecycle","On start called...");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("lifecycle","On resume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("lifecycle","On pause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("lifecycle","On stop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("lifecycle","On Destroy called...");
    }
}