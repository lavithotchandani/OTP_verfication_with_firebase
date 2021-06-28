package com.example.otp_verfication_with_firebase;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class get_number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_number);

        final Button btn = findViewById(R.id.get_otp_btn);
        final EditText input_number = findViewById(R.id.input_number);
        final ProgressBar progressBar = findViewById(R.id.progressbar);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input_number.getText().toString().trim().isEmpty()) {
                    Toast.makeText(get_number.this, "Please enter a mobile number", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), verify_otp.class);
                intent.putExtra("mobile", input_number.getText().toString());
                startActivity(intent);

            }
        });
    }
}