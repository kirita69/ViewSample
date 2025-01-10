package com.websarva.wings.android.lifecyclesample2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;


public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample2","Sub onCreate() called");
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btPrevious), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

    @Override
    public void onStart(){
        Log.i("LifeCycleSample2","Sub onStart() called");
        super.onStart();
    }

    @Override
    public void onRestart(){
        Log.i("LifeCycleSample2","Sub onRestart() called");
        super.onRestart();
    }

    @Override
    public void onResume(){
        Log.i("LifeCycleSample2","Sub onResume() called");
        super.onResume();
    }

    @Override
    public void onPause(){
        Log.i("LifeCycleSample2","Sub onPause() called");
        super.onPause();
    }

    @Override
    public void onStop(){
        Log.i("LifeCycleSample2","Sub onStop() called");
        super.onStop();
    }

    @Override
    public void onDestroy(){
        Log.i("LifeCycleSample2","Sub onDestroy() called");
        super.onDestroy();
    }

    public void onButtonClick(View view){

        finish();
    }
}