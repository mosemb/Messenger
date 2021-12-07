package com.hfad.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecieveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message"; // This is the name of the extra message passed to the inent

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);

        Intent intent = getIntent();
        String textMessage = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.message);
        textView.setText(textMessage);


    }
}