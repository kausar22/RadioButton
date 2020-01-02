package com.myapp.radiobuttonandgradient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioButton rbMale,rbFemale,rbOthers;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rbMale=findViewById(R.id.rb_male);
        rbFemale=findViewById(R.id.rb_female);
        rbOthers=findViewById(R.id.rb_others);

        btnSubmit=findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gender="";
                if (rbMale.isChecked())
                {
                  gender="Male";
                }

                else if(rbFemale.isChecked())
                {
                    gender="Female";
                }

                else  if (rbOthers.isChecked())
                {
                    gender="Others";
                }

                Toast.makeText(MainActivity.this, "Selected Gender:"+gender, Toast.LENGTH_SHORT).show();
            }
        });





    }
}
