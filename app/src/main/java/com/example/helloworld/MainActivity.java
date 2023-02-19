package com.example.helloworld;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, npmEditText, majorEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        npmEditText = findViewById(R.id.npmEditText);
        majorEditText = findViewById(R.id.majorEditText);

        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveFormData();
            }
        });
    }

    private void saveFormData() {
        String name = nameEditText.getText().toString();
        String npm = npmEditText.getText().toString();
        String major = majorEditText.getText().toString();

        Resources res = getResources();
        res.getString(R.string.name, name);
        res.getString(R.string.npm, npm);
        res.getString(R.string.major, major);
    }
}
