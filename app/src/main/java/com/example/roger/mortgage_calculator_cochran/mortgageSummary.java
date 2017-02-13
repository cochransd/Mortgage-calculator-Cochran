package com.example.roger.mortgage_calculator_cochran;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class mortgageSummary extends AppCompatActivity {

    public TextView mortgageTV;
    public String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mortgage_summary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        message = (String)(extras.getString(MainActivity.EXTRA_MESSAGE));

        mortgageTV = (TextView)findViewById(R.id.smtv1);

        mortgageTV.setText( message );

        //ViewGroup layout = (ViewGroup) findViewById(R.id.activity_mortgage_summary);


    }

    public void test(View view){

        mortgageTV.setText(message);


    }

}

