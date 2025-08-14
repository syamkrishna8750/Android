package com.example.project1;

import static android.app.ProgressDialog.show;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText username=(EditText) findViewById(R.id.editTextText);
        EditText password=(EditText) findViewById(R.id.editTextText2);
        Button Login=(Button) findViewById(R.id.button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("syam")&&password.getText().toString().equals("12345")){
                    Toast.makeText(MainActivity.this, "Login successfully",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}