package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView workingTV;
    TextView resultTV;
    TextView resultA;
    TextView resultB;
    String working="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setContentView(R.layout.calculator);
       // setContentView(R.layout.court_counter);
        initTextViews();
    }

    private void setWorking(String givenValue){
        working = working + givenValue;
        workingTV.setText(working);
    }

    public void clearOnClick(View view) {
        workingTV.setText("");
        working = "";
        resultTV.setText("");

    }

    public void modOnClick(View view) {
        setWorking("%");
    }

    public void powerOnClick(View view) {
        setWorking("^");
    }

    public void divideOnClick(View view) {
        setWorking("/");
    }

    public void sevenOnClick(View view) {
        setWorking("7");
    }

    public void eightOnClick(View view) {
        setWorking("8");
    }

    public void nineOnClick(View view) {
        setWorking("9");
    }

    public void multiplyOnClick(View view) {
        setWorking("x");
    }

    public void fourOnClick(View view) {
        setWorking("4");
    }

    public void fiveOnClick(View view) {
        setWorking("5");
    }

    public void sixOnClick(View view) {
        setWorking("6");
    }

    public void minusOnClick(View view) {
        setWorking("-");
    }

    public void oneOnClick(View view) {
        setWorking("1");
    }

    public void twoOnClick(View view) {
        setWorking("2");
    }

    public void threeOnClick(View view) {
        setWorking("3");
    }

    public void plusOnClick(View view) {
        setWorking("+");
    }

    public void periodOnClick(View view) {
        setWorking(".");
    }

    public void zeroOnClick(View view) {
        setWorking("0");
    }
    public float sum(float num1,float num2)
    {
        return num1+num2;
    }
    public float multiply( float num1, float num2)
    {
        return num1*num2;
    }
    public float subtract( float num1, float num2)
    {
        return num1-num2;
    }
    public float divide( float num1, float num2)
    {
        return num1/num2;
    }
    public float mod( float num1, float num2)
    {
        return num1%num2;
    }
//    public float power( float num1, float num2)
//    {
//        float num=1;
//        for(int i=0;i<num2;i++)
//        {
//            num = num*num1;
//        }
//        return num;
//    }

    public void equalOnClick(View view) {
        String arg = (String) workingTV.getText();
        if(arg.isEmpty()||arg.equals(""))
        {
            resultTV.setText(0);
        }
        else
        {
            String result=" ";
            float firstNum , secondNum;
            char operator;
            int index=0;
            for(int i=0;i<=arg.length();i++)
            {
                if(arg.charAt(i)>=36 && arg.charAt(i)<= 47)
                {
                    index = i;
                    break;
                }
                else if(arg.charAt(i)=='^' || arg.charAt(i)=='x')
                {
                    index = i;
                    break;
                }
            }
            firstNum = Float.parseFloat(arg.substring(0,index));
            secondNum = Float.parseFloat(arg.substring(index+1,arg.length()));
            operator = arg.charAt(index);
            if(operator == '+')
            {
                result = String.valueOf((sum(firstNum,secondNum)));
                resultTV.setText(result);
            }
            else if (operator == '-')
            {
                result = String.valueOf(subtract(firstNum,secondNum));
                resultTV.setText(result);
            }
            else if (operator == 'x')
            {
                result = String.valueOf(multiply(firstNum,secondNum));
                resultTV.setText(result);
            }
            else if (operator == '/')
            {
                result = String.valueOf(divide(firstNum,secondNum));
                resultTV.setText(result);
            }
            else if (operator == '%')
            {
                result = String.valueOf(mod(firstNum,secondNum));
                resultTV.setText(result);
            }
            else if (operator == '^')
            {
                result = String.valueOf(Math.pow(firstNum,secondNum));
                resultTV.setText(result);
            }
        }

    }
    private void setScoreA(int givenValue) {
        int scoreA = Integer.parseInt((String) resultA.getText());
        scoreA = scoreA + givenValue;
        String score = String.valueOf(scoreA);
        resultA.setText(score);
    }
    private void setScoreB(int givenValue) {
        int scoreB = Integer.parseInt((String) resultB.getText());
        scoreB = scoreB + givenValue;
        String score = String.valueOf(scoreB);
        resultB.setText(score);
    }

    public void plus3AOnClick(View view) {
            setScoreA(3);
    }

    public void plus3BOnClick(View view) {
            setScoreB(3);
    }

    public void plus2AOnClick(View view) {
            setScoreA(2);
    }

    public void plus2BOnClick(View view) {
            setScoreB(2);
    }

    public void resetButtonOnClick(View view) {
            resultA.setText("0");
            resultB.setText("0");
    }

}