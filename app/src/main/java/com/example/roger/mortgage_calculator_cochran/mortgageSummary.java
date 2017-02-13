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

    public TextView mortgageTV1;
    public String message1;

    public TextView mortgageTV2;
    public String message2;

    public TextView mortgageTV3;
    public String message3;

    public TextView mortgageTV4;
    public String message4;

    public TextView mortgageTV5;
    public String message5;

    public TextView mortgageTV6;
    public String message6;

    public TextView mortgageTV7;
    public String message7;

    public TextView mortgageTV8;
    public String message8;

    public TextView mortgageTV9;
    public String message9;

    public TextView mortgageTV10;
    public String message10;

    public TextView mortgageTV11;
    public String message11;

    public TextView mortgageTV12;
    public String message12;

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

        message1 = extras.getString("EXTRA_MESSAGE1");
        mortgageTV1 = (TextView)findViewById(R.id.smtv1);
        mortgageTV1.setText( message1 );

        message2 = extras.getString("EXTRA_MESSAGE2");
        mortgageTV2 = (TextView)findViewById(R.id.smtv2);
        mortgageTV2.setText( message2 );

        message3 = extras.getString("EXTRA_MESSAGE3");
        mortgageTV3 = (TextView)findViewById(R.id.smtv3);
        mortgageTV3.setText( message3 );

        message4 = extras.getString("EXTRA_MESSAGE1");
        mortgageTV4 = (TextView)findViewById(R.id.smtv4);
        mortgageTV4.setText( message4 );

        message5 = extras.getString("EXTRA_MESSAGE1");
        mortgageTV5 = (TextView)findViewById(R.id.smtv5);
        mortgageTV5.setText( message5 );

        message6 = extras.getString("EXTRA_MESSAGE6");
        mortgageTV6 = (TextView)findViewById(R.id.smtv6);
        mortgageTV6.setText( message6 );

        message7 = extras.getString("EXTRA_MESSAGE7");
        mortgageTV7 = (TextView)findViewById(R.id.smtv7);
        mortgageTV7.setText( message7 );

        message8 = extras.getString("EXTRA_MESSAGE8");
        mortgageTV8 = (TextView)findViewById(R.id.smtv8);
        mortgageTV8.setText( message8 );

        message9 = extras.getString("EXTRA_MESSAGE9");
        mortgageTV9 = (TextView)findViewById(R.id.smtv9);
        mortgageTV9.setText( message9 );

        message10 = extras.getString("EXTRA_MESSAGE1");
        mortgageTV10 = (TextView)findViewById(R.id.smtv10);
        mortgageTV10.setText( message10 );

        message11 = extras.getString("EXTRA_MESSAGE2");
        mortgageTV11 = (TextView)findViewById(R.id.smtv11);
        mortgageTV11.setText( message11 );

        message12 = extras.getString("EXTRA_MESSAGE3");
        mortgageTV12 = (TextView)findViewById(R.id.smtv12);
        mortgageTV12.setText( message12 );


        //ViewGroup layout = (ViewGroup) findViewById(R.id.activity_mortgage_summary);


    }



}