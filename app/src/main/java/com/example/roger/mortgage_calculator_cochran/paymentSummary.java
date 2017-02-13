package com.example.roger.mortgage_calculator_cochran;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class paymentSummary extends AppCompatActivity {

    public TextView paymentTV1;
    public String message1;

    public TextView paymentTV2;
    public String message2;

    public TextView paymentTV3;
    public String message3;

    public TextView paymentTV4;
    public String message4;

    public TextView paymentTV5;
    public String message5;

    public TextView paymentTV6;
    public String message6;

    public TextView paymentTV7;
    public String message7;

    public TextView paymentTV8;
    public String message8;

    public TextView paymentTV9;
    public String message9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_summary);
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
        paymentTV1 = (TextView)findViewById(R.id.sptv1);
        paymentTV1.setText( message1 );

        message2 = extras.getString("EXTRA_MESSAGE2");
        paymentTV2 = (TextView)findViewById(R.id.sptv2);
        paymentTV2.setText( message2 );

        message3 = extras.getString("EXTRA_MESSAGE3");
        paymentTV3 = (TextView)findViewById(R.id.sptv3);
        paymentTV3.setText( message3 );

        message4 = extras.getString("EXTRA_MESSAGE4");
        paymentTV4 = (TextView)findViewById(R.id.sptv4);
        paymentTV4.setText( message4 );


        message5 = extras.getString("EXTRA_MESSAGE5");
        paymentTV5 = (TextView)findViewById(R.id.sptv5);
        paymentTV5.setText( message5 );


        message6 = extras.getString("EXTRA_MESSAGE6");
        paymentTV6 = (TextView)findViewById(R.id.sptv6);
        paymentTV6.setText( message6 );



    }


}
