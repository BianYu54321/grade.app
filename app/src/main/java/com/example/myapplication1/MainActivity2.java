package com.example.myapplication1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_main2);

        Button btn2=findViewById(R.id.button_2);
        Button back1=findViewById(R.id.back1);

        final String subject1=getIntent().getStringExtra("subject1");
       TextView subject11=findViewById(R.id.subject11);
       subject11.setText(subject1);
        final String subject2=getIntent().getStringExtra("subject2");
        TextView subject12=findViewById(R.id.subject12);
        subject12.setText(subject2);
        final String subject3=getIntent().getStringExtra("subject3");
        TextView subject13=findViewById(R.id.subject13);
        subject13.setText(subject3);
        final String subject4=getIntent().getStringExtra("subject4");
        TextView subject14=findViewById(R.id.subject14);
        subject14.setText(subject4);

        final String grade1=getIntent().getStringExtra("grade1");
        TextView grade11=findViewById(R.id.grade11);
        grade11.setText(grade1);
        assert grade1 != null;
        final float grade_1=Float.parseFloat(grade1);
        final String grade2=getIntent().getStringExtra("grade2");
        TextView grade12=findViewById(R.id.grade12);
        grade12.setText(grade2);
        assert grade2 != null;
        final float grade_2=Float.parseFloat(grade2);
        final String grade3=getIntent().getStringExtra("grade3");
        TextView grade13=findViewById(R.id.grade13);
        grade13.setText(grade3);
        assert grade3 != null;
        final float grade_3=Float.parseFloat(grade3);
        final String grade4=getIntent().getStringExtra("grade4");
        TextView grade14=findViewById(R.id.grade14);
        grade14.setText(grade4);
        assert grade4 != null;
        final float grade_4=Float.parseFloat(grade4);


        String score1=getIntent().getStringExtra("score1");
        TextView score11=findViewById(R.id.score11);
        assert score1 != null;
        float score_1=Float.parseFloat(score1);
        String score2=getIntent().getStringExtra("score2");
        TextView score12=findViewById(R.id.score12);
        assert score2 != null;
        float score_2=Float.parseFloat(score2);
        String score3=getIntent().getStringExtra("score3");
        TextView score13=findViewById(R.id.score13);
        assert score3 != null;
        float score_3=Float.parseFloat(score3);
        String score4=getIntent().getStringExtra("score4");
        TextView score14=findViewById(R.id.score14);
        assert score4 != null;
        float score_4=Float.parseFloat(score4);


        final float averageGrade;
        float sumScore=score_1+score_2+score_3+score_4;
        averageGrade=(score_1*grade_1+score_2*grade_2+score_3*grade_3+score_4*grade_4)/sumScore;
        BigDecimal bj=new BigDecimal(averageGrade);
        float average=bj.setScale(2,BigDecimal.ROUND_HALF_UP).floatValue();



        float aver=(grade_1+grade_2+grade_3+grade_4)/4;
        float sumVariance;
        sumVariance=(grade_1-aver)*(grade_1-aver)+(grade_2-aver)*(grade_2-aver)+(grade_3-aver)*(grade_3-aver)+(grade_4-aver)*(grade_4-aver);
        float variance;
        variance=sumVariance/4;
        String result="0";
        if (variance>=10){result="差";}
        else if(variance>=4&&variance<10){result="较差";}
        else if(variance>=1&&variance<4){result="良好";}
        else if(variance>=0&&variance<1){result="优秀";}

        TextView stability=findViewById(R.id.stability);
        stability.setText(result);

        float[] p=new float[5];
        final float[] g=new float[5];
        String[] d =new String[5];
        g[0]=grade_1;
        g[1]=grade_2;
        g[2]=grade_3;
        g[3]=grade_4;
        g[4]=averageGrade;
        for(int i=0;i<5;i++) {
            if (g[i] >= 90 && g[i] <= 100) {
                p[i] = 4.0f;
                d[i]="A";
            } else if (g[i] >= 86 && g[i] < 90) {
                p[i] = 3.7f;
                d[i]="A-";
            } else if (g[i] >= 83 && g[i] < 86) {
                p[i] = 3.3f;
                d[i]="B+";
            } else if (g[i] >= 80 && g[i] < 83) {
                p[i] = 3.0f;
                d[i]="B";
            } else if (g[i] >= 76 && g[i] < 80) {
                p[i] = 2.7f;
                d[i]="B+";
            } else if (g[i] >= 73 && g[i] < 76) {
                p[i] = 2.3f;
                d[i]="C+";
            } else if (g[i] >= 70 && g[i] < 73) {
                p[i] = 2.0f;
                d[i]="C";
            } else if (g[i] >= 66 && g[i] < 70) {
                p[i] = 1.7f;
                d[i]="C-";
            } else if (g[i] >= 63 && g[i] < 66) {
                p[i] = 1.3f;
                d[i]="D+";
            } else if (g[i] >= 60 && g[i] < 63) {
                p[i] = 1.0f;
                d[i]="D";
            } else if (g[i] < 60) {
                p[i] = 0.0f;
                d[i]="F";
            }
        }



        String point_1=String.valueOf(p[0]);
        score11.setText(point_1);


        String point_2=String.valueOf(p[1]);
        score12.setText(point_2);

        String point_3=String.valueOf(p[2]);
        score13.setText(point_3);

        String point_4=String.valueOf(p[3]);
        score14.setText(point_4);




        TextView Grade1=findViewById(R.id.grade_1);
        Grade1.setText(d[0]);
        TextView Grade2=findViewById(R.id.grade_2);
        Grade2.setText(d[1]);
        TextView Grade3=findViewById(R.id.grade_3);
        Grade3.setText(d[2]);
        TextView Grade4=findViewById(R.id.grade_4);
        Grade4.setText(d[3]);
        TextView sumGrade=findViewById(R.id.sumGrade);
        sumGrade.setText(d[4]);





        float sumPoint=(p[0]*score_1+p[1]*score_2+p[2]*score_3+p[3]*score_4)/sumScore;
        BigDecimal bj1=new BigDecimal(sumPoint);
        float sumPoint11=bj1.setScale(2,BigDecimal.ROUND_HALF_UP).floatValue();


        final String averageGrade1=String.valueOf(average);
        TextView averageGrade_1=findViewById(R.id.averageGrade);

        averageGrade_1.setText(averageGrade1);
        String sumPoint1=String.valueOf(sumPoint11);
        TextView sumPoint_1=findViewById(R.id.sumPoint);
        sumPoint_1.setText(sumPoint1);
        String sumScore1=String.valueOf(sumScore);
        TextView sumScore_1=findViewById(R.id.sumScore);
        sumScore_1.setText(sumScore1);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
                intent.putExtra("key1",subject1);
                intent.putExtra("key2",subject2);
                intent.putExtra("key3",subject3);
                intent.putExtra("key4",subject4);
                intent.putExtra("sum",averageGrade1);
                intent.putExtra("grade11",grade1);
                intent.putExtra("grade22",grade2);
                intent.putExtra("grade33",grade3);
                intent.putExtra("grade44",grade4);
                startActivity(intent);


            }
        });
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}