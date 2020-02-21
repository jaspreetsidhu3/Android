package com.example.dell.toastwithactivitycycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    TextView textview;
    Button button;
    public static final String Tag="Test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=(TextView) findViewById(R.id.activity);
        button=(Button) findViewById(R.id.button);
                 Log.d(Tag,"oncreate");
                 button.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Toast.makeText(MainActivity.this,"jaspreet@company.com",Toast.LENGTH_SHORT).show();
                     }
                 });



    }
    protected void onStart(){
        super.onStart();
        Log.d(Tag,"Onstart");

        Toast.makeText(MainActivity.this,"Onstart",Toast.LENGTH_LONG).show();
    }
    protected void onResume(){
        super.onResume();
        Log.d(Tag,"OnResume");
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Log.d(Tag,"OnPause");
        Toast.makeText(MainActivity.this,"OnPause",Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Log.d(Tag,"Onstop");
        Toast.makeText(MainActivity.this,"onstop",Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(Tag,"ondestroy");
        Toast.makeText(MainActivity.this,"On destroy lub u",Toast.LENGTH_SHORT).show();
    }
}
