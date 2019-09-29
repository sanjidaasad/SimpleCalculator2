package com.example.user.simplecalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Bpoint,Bequ,Badd,Bsub,Bmul,Bdiv,Bmod,BAC,BDEL,Broot;
    boolean add,sub,mul,div,mod;
    double var1,var2;
    TextView ans,ans2;
    String del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        B3 = findViewById(R.id.b3);
        B4 = findViewById(R.id.b4);
        B5 = findViewById(R.id.b5);
        B6 = findViewById(R.id.b6);
        B7 = findViewById(R.id.b7);
        B8 = findViewById(R.id.b8);
        B9 = findViewById(R.id.b9);
        B0 = findViewById(R.id.bzero);
        Bpoint = findViewById(R.id.bpoint);
        Bequ = findViewById(R.id.bequ);
        Badd = findViewById(R.id.badd);
        Bsub = findViewById(R.id.bsub);
        Bmul = findViewById(R.id.bmul);
        Bdiv = findViewById(R.id.bdiv);
        Bmod = findViewById(R.id.bmod);
        Broot = findViewById(R.id.broot);
        BAC = findViewById(R.id.bAC);
        BDEL = findViewById(R.id.bDEL);
        ans = findViewById(R.id.bcontent);
        ans2 = findViewById(R.id.bresult);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        });
        Bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");
            }
        });
        Badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else {
                    var1=Double.parseDouble(ans.getText()+"");
                    add=true;
                    ans.setText(null);
                }

            }
        });
        Bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    sub=true;
                    ans.setText(null);
                }

            }
        });
        Bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    mul=true;
                    ans.setText(null);
                }

            }
        });
        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    div=true;
                    ans.setText(null);
                }

            }
        });
        Bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    mod=true;
                    ans.setText(null);
                }

            }
        });
        BAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(null);
                ans2 .setText(null);
            }
        });
        BDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                del=ans.getText().toString();
                del=del.substring(0,del.length()-1);
                ans.setText(del+"");

            }
        });
        Broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    var2=sqrt(var1);
                    ans2.setText(var2+"");
                }

            }
        });

        Bequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var2=Double.parseDouble(ans.getText()+"");
                if(add==true){
                    ans2.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true){
                    ans2.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true){
                    ans2.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true){
                    ans2.setText(var1/var2+"");
                    div=false;
                }
                if(mod==true){
                    if(var2==0){
                        ans2.setText("error");

                    }
                    else{
                        ans2.setText(var1%var2+"");
                        mod=false;
                    }
                }
            }

        });
    }
}
