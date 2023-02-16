package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.editTextTextPersonName);
        username.setText("nama pengguna");
        String nama_pengguna = username.getText().toString();

        EditText password = (EditText) findViewById(R.id.editTextTextPassword);
        password.setText("password pengguna");
        String kata_sandi = password.getText().toString();

        Button submit = (Button) findViewById(R.id.button);
        submit.setText("tombol submit");

        TextView output1 = (TextView) findViewById(R.id.textView2);
        output1.setText("output pertama");

        TextView output2 = (TextView) findViewById(R.id.textView3);
        output2.setText("output kedua");
    }

    public void submit(View view){
        EditText username = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText password = (EditText) findViewById(R.id.editTextTextPassword);

        TextView output1 = (TextView) findViewById(R.id.textView2);
        TextView output2 = (TextView) findViewById(R.id.textView3);

        output1.setText(username.getText());
        output2.setText(password.getText());
    }
}