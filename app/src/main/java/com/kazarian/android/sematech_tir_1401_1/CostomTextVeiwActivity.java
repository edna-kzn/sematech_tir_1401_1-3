package com.kazarian.android.sematech_tir_1401_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CostomTextVeiwActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costom_text_veiw);

        VazirTextView txtMatn1 = findViewById(R.id.txt1);
        TextView txtMatn2 = findViewById(R.id.txt2);


        txtMatn1.setText("سلام این یک متن فارسی است با وزیر");
        txtMatn2.setText("سلام این یک متن فارسی است");

    }
}