package com.arkaadhya.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator_activity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bpi, bequal, bplus, bmin, bmul, bdiv, binv, bsqrt, bper, bfact, bln, blog, btan, bcos, bsin, bb1, bb2, bac, bc, bpow;
    TextView tvmain, tvsec;
    String pi = "3.14159265";
    int lastOpt = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bdot = findViewById(R.id.bdot);
        bpi = findViewById(R.id.bpi);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bper = findViewById(R.id.bper);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bcos = findViewById(R.id.bcos);
        bsin = findViewById(R.id.bsin);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bpow = findViewById(R.id.bpow);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
//
                } else {
                    String curr = tvmain.getText().toString();
                    curr = curr.substring(0, curr.length() - 1);
                    tvmain.setText(curr);
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    int len = tvmain.getText().toString().length();
                    if (lastOpt == len - 1) {
                        tvmain.setText(tvmain.getText().toString().substring(0, len - 1) + "+");
                    } else {
                        tvmain.setText(tvmain.getText() + "+");
                        lastOpt = tvmain.getText().toString().length() - 1;
                    }
                }
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    int len = tvmain.getText().toString().length();
                    if (lastOpt == len - 1) {
                        tvmain.setText(tvmain.getText().toString().substring(0, len - 1) + "-");
                    } else {
                        tvmain.setText(tvmain.getText() + "-");
                        lastOpt = tvmain.getText().toString().length() - 1;
                    }
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    int len = tvmain.getText().toString().length();
                    if (lastOpt == len - 1) {
                        tvmain.setText(tvmain.getText().toString().substring(0, len - 1) + "÷");
                    } else {
                        tvmain.setText(tvmain.getText() + "÷");
                        lastOpt = tvmain.getText().toString().length() - 1;
                    }
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    int len = tvmain.getText().toString().length();
                    if (lastOpt == len - 1) {
                        tvmain.setText(tvmain.getText().toString().substring(0, len - 1) + "×");
                    } else {
                        tvmain.setText(tvmain.getText() + "×");
                        lastOpt = tvmain.getText().toString().length() - 1;
                    }
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    if (lastOpt == -1) {
                        String num = tvmain.getText().toString();
                        double k = getSqrt(Double.parseDouble(num));
                        tvsec.setText("√" + tvmain.getText());
                        tvmain.setText(String.valueOf(k));
                    } else {
                        String exp = tvmain.getText().toString();
                        String num = exp.substring(lastOpt + 1, exp.length());
                        double k = getSqrt(Double.parseDouble(num));
                        tvmain.setText(exp.substring(0, lastOpt + 1) + String.valueOf(k));
                    }
                }
            }
        });
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    int len = tvmain.getText().toString().length();
                    if (lastOpt == len - 1) {
                        tvmain.setText(tvmain.getText().toString().substring(0, len - 1) + "^");
                    } else {
                        tvmain.setText(tvmain.getText() + "^");
                    }
                }
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "(");
                lastOpt = tvmain.getText().toString().length() - 1;
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ")");
                lastOpt = tvmain.getText().toString().length() - 1;
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(tvmain.getText() + "π");
                tvmain.setText(tvmain.getText() + pi);
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    tvmain.setText(tvmain.getText() + "^" + (-1));
                }
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "tan");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    if (lastOpt == -1) {
                        String num = tvmain.getText().toString();
                        tvsec.setText(num + "!");
                        double k = fact(Double.parseDouble(num));
                        tvmain.setText(String.valueOf(k));
                    } else {
                        String exp = tvmain.getText().toString();
                        String num = exp.substring(lastOpt + 1, exp.length());
                        double k = fact(Double.parseDouble(num));
                        tvmain.setText(exp.substring(0, lastOpt + 1) + String.valueOf(k));
                    }
                }
            }
        });
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
//
                    if (lastOpt == -1) {
                        String num = tvmain.getText().toString();
                        double k = getPercentage(Double.parseDouble(num));
                        tvmain.setText(String.valueOf(k));
                    } else {
                        String exp = tvmain.getText().toString();
                        String num = exp.substring(lastOpt + 1, exp.length());
                        double k = getPercentage(Double.parseDouble(num));
                        tvmain.setText(exp.substring(0, lastOpt + 1) + String.valueOf(k));
                    }
                }
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "log");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_LONG).show();
                } else {
                    String exp = tvmain.getText().toString();
                    int currlen = exp.length();
                    if (exp.charAt(currlen - 1) == '+' || exp.charAt(currlen - 1) == '-' || exp.charAt(currlen - 1) == '^' || exp.charAt(currlen - 1) == '÷' || exp.charAt(currlen - 1) == '×') {
                        Toast.makeText(getApplicationContext(), "Invalid Expression", Toast.LENGTH_LONG).show();
                    } else {
                        lastOpt = -1;
                        String val = tvmain.getText().toString();
                        String replacedstr = val.replace('÷', '/').replace('×', '*');
                        double res = eval(replacedstr);
                        tvmain.setText(String.valueOf(res));
                        tvsec.setText(val);
                    }
                }
            }
        });
    }

    double getPercentage(double n) {
        if (n == 0) return n;
        else return n / 100;
    }

    double getSqrt(double n) {
        if (n == 0) return n;
        else return Math.sqrt(n);
    }

    double fact(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}