package com.example.fragmentdesigndemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {


    TextView textView;
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentlose,container,false);
        textView=view.findViewById(R.id.txtviewlos);
        imageView=view.findViewById(R.id.restartlos1);
        String n=getArguments().getString("data");
        textView.setText(n);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDetach();
            }
        });


        return view;
    }
    public void setText(String n){
        textView.setText(n);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        getFragmentManager().beginTransaction().remove(FragmentTwo.this).commitAllowingStateLoss();

    }
}
