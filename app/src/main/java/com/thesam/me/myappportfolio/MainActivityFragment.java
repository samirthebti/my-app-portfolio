package com.thesam.me.myappportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private Button popularMovies;
    private Button stockHawk;
    private Button buildItBigger;
    private Button makeYourAppMaterial;
    private Button goUbiquitous;
    private Button capstone;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        popularMovies = (Button) rootView.findViewById(R.id.popularmovies);
        stockHawk = (Button) rootView.findViewById(R.id.stockhawk);
        buildItBigger = (Button) rootView.findViewById(R.id.builditbiger);
        makeYourAppMaterial = (Button) rootView.findViewById(R.id.makeyourappmaterail);
        goUbiquitous = (Button) rootView.findViewById(R.id.goubiquitous);
        capstone = (Button) rootView.findViewById(R.id.capstonee);
        popularMovies.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This Button will launch my " + popularMovies.getText() + " app", Toast.LENGTH_LONG)
                        .show();
            }
        });
        stockHawk.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This Button will launch my " + stockHawk.getText() + " app", Toast.LENGTH_LONG)
                        .show();
            }
        });
        buildItBigger.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This Button will launch my " + buildItBigger.getText() + "app", Toast.LENGTH_LONG)
                        .show();
            }
        });
        makeYourAppMaterial.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This Button will launch my " + makeYourAppMaterial.getText() + " app", Toast.LENGTH_LONG)
                        .show();
            }
        });
        goUbiquitous.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This Button will launch my " + goUbiquitous.getText() + " app", Toast.LENGTH_LONG)
                        .show();
            }
        });
        capstone.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This Button will launch my " + capstone.getText() + " app", Toast.LENGTH_LONG)
                        .show();
            }
        });


        return rootView;
    }
}
