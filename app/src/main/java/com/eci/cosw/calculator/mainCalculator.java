package com.eci.cosw.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class mainCalculator extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonpoint , buttonsum , buttonsub , buttondivide ,
            buttonmultiply , buttonenter , buttonac , buttonchangesign , buttonsin , buttoncos,
            buttontan , buttonsqrt , buttonlnatural , buttoncosineh;

    TextView stack , result;

    boolean noMorePoint= false, operationPushed=true;

    String CurrentAction;

    ArrayList<String> numberStack = new ArrayList() , allOperation = new ArrayList() ;

    Double numOne , numTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonpoint = (Button) findViewById(R.id.buttonpoint);
        buttonsum = (Button) findViewById(R.id.buttonsum);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmultiply = (Button) findViewById(R.id.buttonmultiply);
        buttondivide = (Button) findViewById(R.id.buttondivide);
        buttonenter = (Button) findViewById(R.id.buttonenter);
        stack = (TextView) findViewById(R.id.stack);
        result = (TextView) findViewById(R.id.result);
        buttonac = (Button) findViewById(R.id.buttonac);
        buttonchangesign = (Button) findViewById(R.id.changesign);
        buttonsin = (Button) findViewById(R.id.sine);
        buttoncos = (Button) findViewById(R.id.cosine);
        buttoncosineh = (Button) findViewById(R.id.cosineh);
        buttontan = (Button) findViewById(R.id.tangent);
        buttonsqrt = (Button) findViewById(R.id.sqrt);
        buttonlnatural =(Button) findViewById(R.id.lnatural);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        buttonpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numericButtonClicked(v);
            }
        });

        buttonenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterButtonClicked(v);
            }
        });

        buttonsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationButtonClicked(v);
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationButtonClicked(v);
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationButtonClicked(v);
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationButtonClicked(v);
            }
        });

        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                functionalButtonClicked(v);
            }
        });

        buttonchangesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                functionalButtonClicked(v);
            }
        });

        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trigonometryButtonClicked(v);
            }
        });

        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trigonometryButtonClicked(v);
            }
        });

        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trigonometryButtonClicked(v);
            }
        });

        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                additionalFButtonClicked(v);
            }
        });

        buttonlnatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                additionalFButtonClicked(v);
            }
        });
        buttoncosineh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                additionalFButtonClicked(v);
            }
        });


    }

    private void additionalFButtonClicked(View v) {
        if(numberStack.size()>=1) {
            String res = "";
            if (v.getId() == R.id.sqrt) {CurrentAction = "SQRT";allOperation.add("sqrt");
            } else if (v.getId() == R.id.lnatural) {CurrentAction = "LN";allOperation.add("ln");
            }else if (v.getId() == R.id.cosineh) {CurrentAction = "COSH";allOperation.add("cosh");}
            res=trigonometryOperation();
            allOperation.add(res);
            stack.setText(allOperation.toString());
            result.setText(res);
        }
    }

    private void trigonometryButtonClicked(View v) {
        if(numberStack.size()>=1) {
            String res = "";
            if (v.getId() == R.id.sine) {CurrentAction = "SIN";allOperation.add("sin");
            } else if (v.getId() == R.id.cosine) {CurrentAction = "COS";allOperation.add("cos");
            } else if (v.getId() == R.id.tangent) {CurrentAction = "TAN";allOperation.add("tan");}
            res=trigonometryOperation();
            allOperation.add(res);
            stack.setText(allOperation.toString());
            result.setText(res);
        }
    }

    private void functionalButtonClicked(View v) {
        if (v.getId() == R.id.buttonac) {
            numberStack.clear();allOperation.clear();
            stack.setText("");result.setText("");
        }else if (v.getId() == R.id.changesign) {
            Double change=Double.parseDouble(numberStack.remove(numberStack.size()-1));
            allOperation.remove(allOperation.size()-1);
            numberStack.add(String.valueOf((-1)*change));
            allOperation.add(String.valueOf((-1)*change));
            stack.setText(allOperation.toString());
            result.setText(String.valueOf((-1)*change));
            operationPushed=true;

        }
    }

    private void operationButtonClicked(View v) {

        if(numberStack.size()>=2) {
            String res="";
            if (v.getId() == R.id.buttonsum) {CurrentAction = "SUM";allOperation.add("+");
            }else if (v.getId() == R.id.buttonsub) {CurrentAction="SUBTRACT";allOperation.add("-");
            }else if (v.getId() == R.id.buttonmultiply) {CurrentAction="MULTIPLY";allOperation.add("*");
            }else if (v.getId() == R.id.buttondivide) {CurrentAction="DIVIDE";allOperation.add("/");}
            res=makeOperation();
            if(!res.equals("Invalid operation.")) {
                allOperation.add(res);
                stack.setText(allOperation.toString());
            }
            result.setText(res);
        }

    }

    private void enterButtonClicked(View v) {
        if (v.getId() == R.id.buttonenter) {
            if(!result.getText().toString().equals("")) {
                numberStack.add(result.getText().toString());
                noMorePoint = false;
                allOperation.add(result.getText().toString());
                stack.setText(allOperation.toString());
                result.setText("");
            }
        }
    }

    private void numericButtonClicked(View v) {
        if (v.getId() == R.id.button0) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"0");
        }else if (v.getId() == R.id.button1) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"1");
        }else if (v.getId() == R.id.button2) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"2");
        }else if (v.getId() == R.id.button3) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"3");
        }else if (v.getId() == R.id.button4) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"4");
        }else if (v.getId() == R.id.button5) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"5");
        }else if (v.getId() == R.id.button6) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"6");
        }else if (v.getId() == R.id.button7) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"7");
        }else if (v.getId() == R.id.button8) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"8");
        }else if (v.getId() == R.id.button9) {
            if(operationPushed){result.setText("");operationPushed=false;}result.setText(result.getText()+"9");
        }else if (v.getId() == R.id.buttonpoint) {
            if (!noMorePoint) {result.setText(result.getText() + ".");noMorePoint=true;}
        }
    }

    private String trigonometryOperation(){
        Double num=Double.parseDouble(numberStack.remove(numberStack.size()-1));
        String res="";
        if(CurrentAction.equals("SIN")){
            res= String.valueOf(Math.sin(num));
        }else if(CurrentAction.equals("COS")){
            res= String.valueOf(Math.cos(num));
        }else if(CurrentAction.equals("TAN")){
            res= String.valueOf(Math.tan(num));
        }else if(CurrentAction.equals("SQRT")){
            res= String.valueOf(Math.sqrt(num));
        }else if(CurrentAction.equals("LN")){
            res= String.valueOf(Math.log(num));
        }else if(CurrentAction.equals("COSH")){
            res= String.valueOf(Math.cosh(num));
        }
        numberStack.add(res);
        operationPushed=true;
        return res;
    }

    private String makeOperation() {
        numTwo=Double.parseDouble(numberStack.remove(numberStack.size()-1));
        numOne=Double.parseDouble(numberStack.remove(numberStack.size()-1));
        String res="";
        if(CurrentAction.equals("SUM")){
            res= String.valueOf(numOne+numTwo);
        }else if(CurrentAction.equals("SUBTRACT")){
            res= String.valueOf(numOne-numTwo);
        }else if(CurrentAction.equals("DIVIDE")){
            if(numTwo==0){
                res="Invalid operation.";
            }else{
                res= String.valueOf(numOne/numTwo);
            }

        }else if(CurrentAction.equals("MULTIPLY")){
            res= String.valueOf(numOne*numTwo);
        }else if(CurrentAction.equals("SIN")){
            res= String.valueOf(numOne*numTwo);
        }else if(CurrentAction.equals("COS")){
            res= String.valueOf(numOne*numTwo);
        }else if(CurrentAction.equals("TAN")){
            res= String.valueOf(numOne*numTwo);
        }
        numberStack.add(res);
        operationPushed=true;
        return res;
    }


}
