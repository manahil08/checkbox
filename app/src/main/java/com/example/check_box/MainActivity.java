package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity  implements
        View.OnClickListener{

    CheckBox checkBoxDone, checkBoxPending, checkBoxRead;
    Button simpleButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxDone = findViewById(R.id.checkBoxDone);
        checkBoxDone.setOnClickListener(this);
        checkBoxPending = findViewById(R.id.checkBoxPending);
        checkBoxPending.setOnClickListener(this);
        checkBoxRead = findViewById(R.id.checkBoxRead);
        checkBoxRead.setOnClickListener(this);
        simpleButton2 = findViewById(R.id.simpleButton2);


    }
    public void onClick(View v) {
        switch (v.getId( )) {
            case R.id.checkBoxDone:
                if (checkBoxDone.isChecked())
                    simpleButton2.setText("Check Box Done");
                break;
            case R.id.checkBoxPending:
                if (checkBoxPending.isChecked())
                    simpleButton2.setText("Check Box Pending");
                break;
            case R.id.checkBoxRead:
                if (checkBoxRead.isChecked())
                    simpleButton2.setText("Check Box Read");
                break;


                
        }
    }
}