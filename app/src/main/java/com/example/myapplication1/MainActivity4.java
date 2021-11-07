package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btn3=findViewById(R.id.btn_3);
        Button back2=findViewById(R.id.back2);

        final String subject1=getIntent().getStringExtra("key1");
        TextView subject_1=findViewById(R.id.sub1);
        subject_1.setText(subject1);
        final String subject2=getIntent().getStringExtra("key2");
        TextView subject_2=findViewById(R.id.sub2);
        subject_2.setText(subject2);
        final String subject3=getIntent().getStringExtra("key3");
        TextView subject_3=findViewById(R.id.sub3);
        subject_3.setText(subject3);
        final String subject4=getIntent().getStringExtra("key4");
        TextView subject_4=findViewById(R.id.sub4);
        subject_4.setText(subject4);



         String grade1=getIntent().getStringExtra("grade11");
         assert grade1 != null;
         String grade2=getIntent().getStringExtra("grade22");
         assert grade2 != null;
         String grade3=getIntent().getStringExtra("grade33");
        assert grade3 != null;
         String grade4=getIntent().getStringExtra("grade44");
        assert grade4 != null;
        String averageGrade=getIntent().getStringExtra("sum");
         assert averageGrade!= null;


        final float grade_1=Float.parseFloat(grade1);
        final float grade_2=Float.parseFloat(grade2);
        final float grade_3=Float.parseFloat(grade3);
        final float grade_4=Float.parseFloat(grade4);
        final float averageG=Float.parseFloat(averageGrade);




        final float[] g=new float[4];
        String[] advice =new String[4];
        g[0]=grade_1;
        g[1]=grade_2;
        g[2]=grade_3;
        g[3]=grade_4;
        for(int i=0; i<4;i++)
        {
            if(g[i]>=90&&g[i]<=100)
            {advice[i]="建议：成绩表现优异，继续保持！";

            }
            else if(g[i]>=85&&g[i]<90) {
                advice[i] = "建议：成绩表现良好，继续努力！";

            }
            else if(g[i]>=75&&g[i]<85){
                advice[i]="建议：成绩表现一般，要努力了哦！";

            }
            else if(g[i]>=60&&g[i]<75){
                advice[i]="建议：你已经处在挂科的边缘了，请注意！";

            }
            else {
                advice[i]="建议：很遗憾，你挂科了！请端正学习态度！";

            }
        }
        String advice1="0";
        if(averageG>=90&&averageG<=100) {
            advice1="综合成绩优秀，望继续努力！";
        }
        else if(averageG>=85&&averageG<90) {
            advice1 = "综合成绩良好，望继续努力！";

        }
        else if(averageG>=75&&averageG<85){
            advice1="综合成绩一般，要努力了哦！";

        }
        else if(averageG>=60&&averageG<75){
            advice1="你已经落后于他人了，请注意！";

        }
        else {
            advice1="综合成绩不及格，请反思并端正学习态度！";}
        TextView summary1=findViewById(R.id.summary1) ;
        summary1.setText(advice[0]);
        TextView summary2=findViewById(R.id.summary2) ;
        summary2.setText(advice[1]);
        TextView summary3=findViewById(R.id.summary3) ;
        summary3.setText(advice[2]);
        TextView summary4=findViewById(R.id.summary4) ;
        summary4.setText(advice[3]);
        TextView sum=findViewById(R.id.sum);
        sum.setText(advice1);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(intent1);
            }
        });


}
}