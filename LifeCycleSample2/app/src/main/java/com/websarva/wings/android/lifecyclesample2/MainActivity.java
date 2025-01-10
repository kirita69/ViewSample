package com.websarva.wings.android.lifecyclesample2;

import android.os.Bundle;
import android.view.View;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample2","Main onCreate() called");
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btPrevious), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }

    @Override
    public void onStart(){
        Log.i("LifeCycleSample2","Main onStart() called");
        super.onStart();
    }

    @Override
    public void onRestart(){
        Log.i("LifeCycleSample2","Main onRestart() called");
        super.onRestart();
    }

    @Override
    public void onResume(){
        Log.i("LifeCycleSample2","Main onResume() called");
        super.onResume();
    }

    @Override
    public void onPause(){
        Log.i("LifeCycleSample2","Main onPause() called");
        super.onPause();
    }

    @Override
    public void onStop(){
        Log.i("LifeCycleSample2","Main onStop() called");
        super.onStop();
    }

    @Override
    public void onDestroy(){
        Log.i("LifeCycleSample2","Main onDestroy() called");
        super.onDestroy();
    }

    public void onButtonClick(View view){

        Intent intent = new Intent(MainActivity.this,SubActivity.class);
        startActivity(intent);
    }
}