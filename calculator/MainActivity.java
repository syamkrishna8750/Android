package com.example.project3;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    Button button11, button12, button13, button14, button15, button16;
    EditText result;
    float mValueOne, mValueTwo;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.edit);


        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);


        View.OnClickListener numberListener = v -> {
            Button b = (Button) v;
            result.append(b.getText());
        };

        button.setOnClickListener(numberListener);
        button2.setOnClickListener(numberListener);
        button3.setOnClickListener(numberListener);
        button4.setOnClickListener(numberListener);
        button5.setOnClickListener(numberListener);
        button6.setOnClickListener(numberListener);
        button7.setOnClickListener(numberListener);
        button8.setOnClickListener(numberListener);
        button9.setOnClickListener(numberListener);
        button10.setOnClickListener(numberListener);


        button13.setOnClickListener(v -> {
            if (!result.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(result.getText().toString());
                add = true;
                result.setText("");
            }
        });


        button14.setOnClickListener(v -> {
            if (!result.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(result.getText().toString());
                sub = true;
                result.setText("");
            }
        });


        button15.setOnClickListener(v -> {
            if (!result.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(result.getText().toString());
                mul = true;
                result.setText("");
            }
        });


        button16.setOnClickListener(v -> {
            if (!result.getText().toString().isEmpty()) {
                mValueOne = Float.parseFloat(result.getText().toString());
                div = true;
                result.setText("");
            }
        });


        button11.setOnClickListener(v -> result.setText(""));


        button12.setOnClickListener(v -> {
            if (!result.getText().toString().isEmpty()) {
                mValueTwo = Float.parseFloat(result.getText().toString());

                if (add) {
                    result.setText(String.valueOf(mValueOne + mValueTwo));
                    add = false;
                } else if (sub) {
                    result.setText(String.valueOf(mValueOne - mValueTwo));
                    sub = false;
                } else if (mul) {
                    result.setText(String.valueOf(mValueOne * mValueTwo));
                    mul = false;
                } else if (div) {
                    if (mValueTwo == 0) {
                        result.setText("Error");
                    } else {
                        result.setText(String.valueOf(mValueOne / mValueTwo));
                    }
                    div = false;
                }
            }
        });
    }
}
