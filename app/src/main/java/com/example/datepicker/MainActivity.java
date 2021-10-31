 package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

 public class MainActivity extends AppCompatActivity {

    EditText editText;
    int y,m,d;
    String DOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.etdate);
        Calendar calendar= Calendar.getInstance();//to show the current date first

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y = calendar.get(Calendar.YEAR);
                m = calendar.get(Calendar.MONTH);
                d = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        DOB = i2+"/"+(i1+1)+"/"+i;
                        editText.setText(DOB);

                    }
                },y,m,d);
                datePickerDialog.show();

            }
        });

    }
}