package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText subject1=findViewById(R.id.subject1);
        final EditText subject2=findViewById(R.id.subject2);
        final EditText subject3=findViewById(R.id.subject3);
        final EditText subject4=findViewById(R.id.subject4);

        final EditText score1=findViewById(R.id.score1);
        final EditText score2=findViewById(R.id.score2);
        final EditText score3=findViewById(R.id.score3);
        final EditText score4=findViewById(R.id.score4);

        final EditText grade1=findViewById(R.id.grade1);
        final EditText grade2=findViewById(R.id.grade2);
        final EditText grade3=findViewById(R.id.grade3);
        final EditText grade4=findViewById(R.id.grade4);

        Button btn1=findViewById(R.id.button_1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("subject1",subject1.getText().toString());
                intent.putExtra("subject2",subject2.getText().toString());
                intent.putExtra("subject3",subject3.getText().toString());
                intent.putExtra("subject4",subject4.getText().toString());

                intent.putExtra("score1",score1.getText().toString());
                intent.putExtra("score2",score2.getText().toString());
                intent.putExtra("score3",score3.getText().toString());
                intent.putExtra("score4",score4.getText().toString());

                intent.putExtra("grade1",grade1.getText().toString());
                intent.putExtra("grade2",grade2.getText().toString());
                intent.putExtra("grade3",grade3.getText().toString());
                intent.putExtra("grade4",grade4.getText().toString());


                startActivity(intent);


            }
        });


    }
}