package com.example.fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentB#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentB extends Fragment  {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentB() {
        // Required empty public constructor
LayoutInflater inflater=null;
RecyclerView Recycler;

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentB.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentB newInstance(String param1, String param2) {
        FragmentB fragment = new FragmentB();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }



    }
    Random random = new Random();
    RecyclerView recyclerView;
    int a = random3();
    String titulo[] = new String[a];
    String descripcion[] = new String[a];
    int avatar[] = new int[a] ;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment


        for (int i = 0; i < a; i++) {
            titulo[i] = "titulo " + i;
        }
        for (int i = 0; i < a; i++) {
            descripcion[i] = "descipcion " + i;
        }
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                avatar[i] = R.drawable.a;
            } else {
                avatar[i] = R.drawable.c;
            }
        }


        View view = inflater.inflate(R.layout.fragment_b, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.Recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new datos(getContext(), titulo, descripcion, avatar));
        recyclerView.setClickable(true);




return view;



    }

    public  int  random3(){
        random.setSeed(System.currentTimeMillis());
        int random4 =100+ random.nextInt(500);

        return random4;

    }

}