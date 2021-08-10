package com.example.actualcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;

import static java.lang.Math.sin;

public class MainActivity extends AppCompatActivity {
    int ts;
    Double d;
    TextView textView;

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button decimal;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button result;
    Button lf;
    Button rf;
    Button delete;
    Button AC;
    Button sin;
    Button cos;
    Button tan;
    Button log;
    String txt;
    int s;
    char op;
    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textview);

        one=findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("1");
            }
        });

        two=findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("2");
            }
        });

        three=findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("3");
            }
        });

        four=findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("4");
            }
        });

        five=findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("5");
            }
        });

        six=findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("6");
            }
        });

        seven=findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("7");
            }
        });

        eight=findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("8");;
            }
        });

        nine=findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("9");
            }
        });

        zero=findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("0");
            }
        });

        decimal=findViewById(R.id.decimal);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*txt=textView.getText().toString();
                ts=txt.length();
                for(int i=0;i<ts;i++){

                }
                    if(txt[i].equals(".")){
                }*/
                equation(".");
            }
        });

        add=findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("+");
            }
        });

        subtract=findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("-");
            }
        });

        multiply=findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("*");
            }
        });

        divide=findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("/");
            }
        });

        lf=findViewById(R.id.lf);
        lf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("(");
            }
        });

        rf=findViewById(R.id.rf);
        rf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation(")");
            }
        });

        delete=findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=textView.getText().toString();
                ts=txt.length();
                txt=txt.substring(0,ts-1);
                textView.setText(txt);
            }
        });

        AC=findViewById(R.id.AC);
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

        sin=findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("sin(");
            }
        });

        cos=findViewById(R.id.cos);
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("cos(");
            }
        });

        tan=findViewById(R.id.tan);
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("tan(");
            }
        });
        log=findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation("log(");
            }
        });

        result=findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt=textView.getText().toString();

                if(txt.substring(0,3).equals("sin")){
                    txt=txt.substring(4);
                    d=Double.parseDouble(txt);
                    d=Math.toRadians(d);
                    d=Math.sin(d);
                    textView.setText(d.toString());
                }

                else if(txt.substring(0,3).equals("cos")){
                    txt=txt.substring(4);
                    d=Double.parseDouble(txt);
                    d=Math.toRadians(d);
                    d=Math.cos(d);
                    textView.setText(d.toString());
                }

                else if(txt.substring(0,3).equals("tan")){
                    txt=txt.substring(4);
                    d=Double.parseDouble(txt);
                    d=Math.toRadians(d);
                    d=Math.tan(d);
                    textView.setText(d.toString());
                }

                else if(txt.substring(0,3).equals("log")){
                    txt=txt.substring(4);
                    d=Double.parseDouble(txt);
                    d=Math.log(d);
                    textView.setText(d.toString());
                }

                else {
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("rhino");
                    //String foo = "40+2";
                    try {
                        d = (Double) engine.eval(txt);
                        textView.setText(d.toString());
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }


            }
        });

    }

    private void equation(String s) {
        txt=textView.getText().toString();
        textView.setText(txt+s);
    }
}