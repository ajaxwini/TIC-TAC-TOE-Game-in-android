package com.prjapati.ttt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn=1;
    TextView tvsetView;
    private static String  Message="Click here to restart again";
    private static String  Message1="TIC TAC TOE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvsetView=(TextView)findViewById(R.id.setView);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);

        tvsetView.setEnabled(false);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
            switch(view.getId()){
            case R.id.b1:
                if(b1.getText().toString()=="")
                {
                    if(turn==1){
                        b1.setText("X");
                        turn=2;
                    }
                    else if(turn==2)
                    {
                        b1.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b2:
                if(b2.getText().toString()=="")
                {
                    if(turn==1){
                        b2.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b2.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b3:
                if(b3.getText().toString()=="")
                {
                    if(turn==1){
                        b3.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b3.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b4:
                if(b4.getText().toString()=="")
                {
                    if(turn==1){
                        b4.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b4.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b5:
                if(b5.getText().toString()=="")
                {
                    if(turn==1){
                        b5.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b5.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b6:
                if(b6.getText().toString()=="")
                {
                    if(turn==1){
                        b6.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b6.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b7:
                if(b7.getText().toString()=="")
                {
                    if(turn==1){
                        b7.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b7.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b8:
                if(b8.getText().toString()=="")
                {
                    if(turn==1){
                        b8.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b8.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
            case R.id.b9:
                if(b9.getText().toString()=="")
                {
                    if(turn==1){
                        b9.setText("X");
                        turn=2;
                    }
                    else if(turn==2){
                        b9.setText("O");
                        turn=1;
                    }
                    endgame();
                }
                break;
        }

    }
    public void endgame(){
        String a=b1.getText().toString();
        String b=b2.getText().toString();
        String c=b3.getText().toString();

        String d=b4.getText().toString();
        String e=b5.getText().toString();
        String f=b6.getText().toString();

        String g=b7.getText().toString();
        String h=b8.getText().toString();
        String i=b9.getText().toString();

        if(a.equals("X")&& b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(a.equals("X")&& d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(a.equals("X")&& e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(b.equals("X")&& e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(c.equals("X")&& f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(d.equals("X")&& e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(g.equals("X")&& h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(g.equals("X")&& e.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }


        if(a.equals("O")&& b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this,"Player O you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(a.equals("O")&& d.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this,"Player O you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(a.equals("O")&& e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(b.equals("O")&& e.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this,"Player O you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(c.equals("O")&& f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Player O you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(d.equals("O")&& e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this,"Player O you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(g.equals("O")&& h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Player O you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(g.equals("O")&& e.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this,"Player X you r d boss",Toast.LENGTH_LONG).show();
            stop();
        }
        if(!a.equals("")&&!b.equals("")&&!c.equals("")&&!d.equals("")&&!e.equals("")&&!f.equals("")&&!g.equals("")&&!h.equals("")&&!i.equals(""))
        {
            Toast.makeText(MainActivity.this,"Draw",Toast.LENGTH_LONG).show();
            stop();
        }



    }
    public void stop(){

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

        tvsetView.setText(Message);
        tvsetView.setEnabled(true);
        tvsetView.setTextSize(18);
        tvsetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                tvsetView.setText(Message1);
                tvsetView.setTextSize(36);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                turn=1;
            }
        });
    }
}
