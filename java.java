package ru.samsung.itschool.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void run(View view) {
        // ax+b=c
        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.b)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.c)).getText().toString());
        TextView result = (TextView) findViewById(R.id.res);

        String out="";
        if(a!=0){
            double d=b*b-4*a*c;
            if(d>0){
                out=((Double)((-b-Math.sqrt(d))/(2*a))).toString()  + " "+((Double)((-b+Math.sqrt(d))/(2*a))).toString() ;
            }else{
                if(d==0){
                    out=((Double)((-b-Math.sqrt(d))/(2*a))).toString();
                }
                if(d<0){
                    out="none";
                }
            }
        }else{
            if(b==0){
                if(c==0){
                    out="any";
                }else{
                    out="none";
                }
            }else{
                out=((Double)(-1*c/b)).toString();
            }
        }

        result.setText(out);
    }

}
