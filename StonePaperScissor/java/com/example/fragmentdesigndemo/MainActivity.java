package com.example.fragmentdesigndemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button buttonstone;
    Button buttonpaper;
    Button buttonscissor;
    static int i=0;
    private RelativeLayout linearLayout;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonstone = findViewById(R.id.buttonstone);
        buttonpaper = findViewById(R.id.buttonpaper);
        buttonscissor = findViewById(R.id.buttonscissor);
        linearLayout = findViewById(R.id.fragmentview);
        if(i==0){
            buttonscissor.setVisibility(View.GONE);
            buttonpaper.setVisibility(View.GONE);
            buttonstone.setVisibility(View.GONE);
            i++;
        }

        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Stone");
        arrayList.add("Paper");
        arrayList.add("Scissors");

        final int i = random.nextInt(3);
        buttonstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrayList.get(i).equals("Stone")) {
                    FragmentOne fragmentOne = new FragmentOne();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    //fragmentOne.setText("Stone");
                    fragmentTransaction.replace(R.id.fragmentview, fragmentOne);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                    buttonstone.setVisibility(View.GONE);
                    buttonscissor.setVisibility(View.GONE);
                    buttonpaper.setVisibility(View.GONE);
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select stone and Cpu select "+arrayList.get(i));
                    fragmentOne.setArguments(bundle);
                   // Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();
                    fragmentTransaction.commit();
                }
                if (arrayList.get(i).equals("Scissors")) {
                    FragmentOne fragmentOne = new FragmentOne();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    //fragmentOne.setText("Stone");
                    fragmentTransaction.replace(R.id.fragmentview, fragmentOne);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                    buttonstone.setVisibility(View.GONE);
                    buttonscissor.setVisibility(View.GONE);
                    buttonpaper.setVisibility(View.GONE);
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select stone and Cpu select "+arrayList.get(i));
                    fragmentOne.setArguments(bundle);
                  //  Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();
                    fragmentTransaction.commit();
                }
                else{
                    FragmentTwo fragmentTwo = new FragmentTwo();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    //fragmentOne.setText("Stone");
                    fragmentTransaction.replace(R.id.fragmentview, fragmentTwo);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                    buttonstone.setVisibility(View.GONE);
                    buttonscissor.setVisibility(View.GONE);
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select stone and Cpu select "+arrayList.get(i));
                    fragmentTwo.setArguments(bundle);
                    buttonpaper.setVisibility(View.GONE);
                    //Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();

                    fragmentTransaction.commit();
                }

            }
        });
        buttonpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrayList.get(i).equals("Paper")) {
                    FragmentOne fragmentOne = new FragmentOne();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentview, fragmentOne);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                    buttonstone.setVisibility(View.GONE);
                    buttonscissor.setVisibility(View.GONE);
                   // Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select Paper and Cpu select "+arrayList.get(i));
                    fragmentOne.setArguments(bundle);
                    buttonpaper.setVisibility(View.GONE);
                    fragmentTransaction.commit();
                }
                if (arrayList.get(i).equals("Stone")) {

                    FragmentOne fragmentOne = new FragmentOne();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentview, fragmentOne);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                    buttonstone.setVisibility(View.GONE);
                    buttonscissor.setVisibility(View.GONE);
                   // Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select Paper and Cpu select "+arrayList.get(i));
                    fragmentOne.setArguments(bundle);
                    buttonpaper.setVisibility(View.GONE);
                    fragmentTransaction.commit();
                }
                    else{
                    FragmentTwo fragmentTwo = new FragmentTwo();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentview, fragmentTwo);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                    buttonstone.setVisibility(View.GONE);
                    buttonscissor.setVisibility(View.GONE);
                   // Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select Paper and Cpu select "+arrayList.get(i));
                    fragmentTwo.setArguments(bundle);
                    buttonpaper.setVisibility(View.GONE);
                    fragmentTransaction.commit();
                }
            }
        });
        buttonscissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (arrayList.get(i).equals("Scissors")) {
                    FragmentOne fragmentOne = new FragmentOne();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentview, fragmentOne);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                   // Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select Scissor and Cpu select "+arrayList.get(i));
                    fragmentOne.setArguments(bundle);
                    buttonscissor.setVisibility(View.GONE);
                    buttonpaper.setVisibility(View.GONE);
                    fragmentTransaction.commit();
                }
                else{
                    FragmentTwo fragmentTwo = new FragmentTwo();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentview, fragmentTwo);
                    fragmentTransaction.addToBackStack(null);
                    buttonstone.setVisibility(View.GONE);
                    buttonstone.setVisibility(View.GONE);
                   // Toast.makeText(getApplicationContext(), "CPU guess"+arrayList.get(i), Toast.LENGTH_SHORT).show();
                    Bundle bundle=new Bundle();
                    bundle.putString("data","User select Scissor and Cpu select "+arrayList.get(i));
                    fragmentTwo.setArguments(bundle);
                    buttonscissor.setVisibility(View.GONE);
                    buttonpaper.setVisibility(View.GONE);
                    fragmentTransaction.commit();
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        buttonstone.setVisibility(View.VISIBLE);
        buttonpaper.setVisibility(View.VISIBLE);buttonscissor.setVisibility(View.VISIBLE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.playAgain:

                Toast.makeText(getApplicationContext(),"Lets Play",Toast.LENGTH_SHORT).show();


                buttonpaper.setVisibility(View.VISIBLE);
                buttonstone.setVisibility(View.VISIBLE);
                buttonscissor.setVisibility(View.VISIBLE);


                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
