package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.framebase,new FragmentA()).commit();





    }
    public void mostrarA (View view){
    getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out).replace(R.id.framebase,new FragmentA()).commit();
    }
    public void mostrarB (View view){
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out).replace(R.id.framebase,new FragmentB()).commit();
    }
    public void mostrarC (View view){
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in,R.anim.fade_out).replace(R.id.framebase,new FragmentC()).commit();
    }

}