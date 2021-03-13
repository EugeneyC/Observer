package com.skrebtsov.eugeney.observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.edit_text);

        UserData user = new UserData();
        UserDisplay userDisplay = new UserDisplay(user);
        UserFriendDisplay userFriendDisplay = new UserFriendDisplay(user);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setMeasurements(editText.getText().toString(), "Skrebtsova");
            }
        });
    }
}