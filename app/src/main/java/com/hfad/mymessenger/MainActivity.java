package com.hfad.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSendMessage(View view){
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
       // Intent intent = new Intent(this,RecieveMessageActivity.class); // We are calling in a new activity
        //intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE,messageText);  This is an explicit intent

        Intent intent = new Intent(Intent.ACTION_SEND); // This is for an implicit intent, it must take in an action
        intent.setType("text/plain");  // This is for an implicit intent
        intent.putExtra(Intent.EXTRA_TEXT,messageText); // This is for an implicit intent

        String chooseTitle = getString(R.string.chooser);
        Intent chooserInent = Intent.createChooser(intent,chooseTitle);  // We are choosing an intent to use
        startActivity(chooserInent);   // Start activity that has been called using the intent


    }
}