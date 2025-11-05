package com.example.registration;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,email,pass1,pass2;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         username= (EditText) findViewById(R.id.u);
         email = (EditText) findViewById(R.id.e);
         pass1= (EditText) findViewById(R.id.p);
         pass2 = (EditText)findViewById(R.id.p1);
         loginbtn = (Button)findViewById(R.id.loginbtn);
         loginbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (pass1.getText().toString().equals("123456"))
                {
                    Toast.makeText(MainActivity.this, "username is "  + username.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
