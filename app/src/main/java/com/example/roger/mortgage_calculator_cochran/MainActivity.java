package com.example.roger.mortgage_calculator_cochran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public String message1 = "";
    public String message2 = "";
    public String message3 = "";
    public String message4 = "";
    public String message5 = "";
    public String message6 = "";
    public String message7 = "";
    public String message8 = "";
    public String message9 = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage1(View view) {

        Intent intent = new Intent(this, mortgageSummary.class);
        Bundle extras = new Bundle();

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        message1 = editText1.getText().toString();
        extras.putString("EXTRA_MESSAGE1", message1);

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        message2 = editText2.getText().toString();
        extras.putString("EXTRA_MESSAGE2", message2);

        EditText editText3 = (EditText) findViewById(R.id.editText3);
        message3 = editText3.getText().toString();
        extras.putString("EXTRA_MESSAGE3", message3);

        EditText editText4 = (EditText) findViewById(R.id.editText4);
        message4 = editText4.getText().toString();
        extras.putString("EXTRA_MESSAGE4", message4);

        EditText editText5 = (EditText) findViewById(R.id.editText5);
        message5 = editText5.getText().toString();
        extras.putString("EXTRA_MESSAGE5", message5);

        EditText editText6 = (EditText) findViewById(R.id.editText6);
        message6 = editText6.getText().toString();
        extras.putString("EXTRA_MESSAGE6", message6);

        EditText editText7 = (EditText) findViewById(R.id.editText7);
        message7 = editText7.getText().toString();
        extras.putString("EXTRA_MESSAGE7", message7);

        EditText editText8 = (EditText) findViewById(R.id.editText8);
        message8 = editText8.getText().toString();
        extras.putString("EXTRA_MESSAGE8", message8);

        EditText editText9 = (EditText) findViewById(R.id.editText9);
        message9 = editText9.getText().toString();
        extras.putString("EXTRA_MESSAGE9", message9);



        intent.putExtras(extras);




        startActivity(intent);

    }

    public void sendMessage2(View view) {

            Intent intent = new Intent(this, paymentSummary.class);
            Bundle extras = new Bundle();

            EditText editText1 = (EditText) findViewById(R.id.editText1);
            message1 = editText1.getText().toString();
            extras.putString("EXTRA_MESSAGE1", message1);

            EditText editText2 = (EditText) findViewById(R.id.editText2);
            message2 = editText2.getText().toString();
            extras.putString("EXTRA_MESSAGE2", message2);

            EditText editText3 = (EditText) findViewById(R.id.editText3);
            message3 = editText3.getText().toString();
            extras.putString("EXTRA_MESSAGE3", message3);

            EditText editText4 = (EditText) findViewById(R.id.editText4);
            message4 = editText4.getText().toString();
            extras.putString("EXTRA_MESSAGE4", message4);

            EditText editText5 = (EditText) findViewById(R.id.editText5);
            message5 = editText5.getText().toString();
            extras.putString("EXTRA_MESSAGE5", message5);

            EditText editText6 = (EditText) findViewById(R.id.editText6);
            message6 = editText6.getText().toString();
            extras.putString("EXTRA_MESSAGE6", message6);

            EditText editText7 = (EditText) findViewById(R.id.editText7);
            message7 = editText7.getText().toString();
            extras.putString("EXTRA_MESSAGE7", message7);

            EditText editText8 = (EditText) findViewById(R.id.editText8);
            message8 = editText8.getText().toString();
            extras.putString("EXTRA_MESSAGE8", message8);

            EditText editText9 = (EditText) findViewById(R.id.editText9);
            message9 = editText9.getText().toString();
            extras.putString("EXTRA_MESSAGE9", message9);



            intent.putExtras(extras);




            startActivity(intent);

    }

}