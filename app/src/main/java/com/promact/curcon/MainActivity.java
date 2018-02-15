package com.promact.curcon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edittext1;
    TextView textView9;
    TextView textView10;
    TextView textView11;
    TextView textView12;
    TextView textView13;
    TextView textView14;
    TextView textView15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        try {


            edittext1 = (EditText) findViewById(R.id.edittext1);
            textView9 = (TextView) findViewById(R.id.textView9);
            textView10 = (TextView) findViewById(R.id.textView10);
            textView11 = (TextView) findViewById(R.id.textView11);
            textView12 = (TextView) findViewById(R.id.textView12);
            textView13 = (TextView) findViewById(R.id.textView13);
            textView14 = (TextView) findViewById(R.id.textView14);
            textView15 = (TextView) findViewById(R.id.textView15);
            Double valueHungarianForint = Double.parseDouble(edittext1.getText().toString());
            Double valueIndianRupee = valueHungarianForint * 0.2561;
            textView12.setText(Double.toString(valueIndianRupee));
            Double valueBahrainiDinar = valueHungarianForint * 0.0014;
            textView9.setText(" " + valueBahrainiDinar);
            Double valueJapaneseYen = valueHungarianForint * 0.4344;
            textView13.setText(" " + valueJapaneseYen);
            Double valueMalaysianRinggit = valueHungarianForint * 0.0156;
            textView10.setText(" " + valueMalaysianRinggit);
            Double valueRussianRuble = valueHungarianForint * 0.2288;
            textView11.setText(" " + valueRussianRuble);
            Double valueSwissFranc = valueHungarianForint * 0.0037;
            textView14.setText(" " + valueSwissFranc);
            Double valueUSDollar = valueHungarianForint * 0.0032;
            textView15.setText(" " + valueUSDollar);
        }
        catch(Exception e)
        {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        if(id==R.id.clear)
        {
            edittext1.setText("");
            textView9.setText("");
            textView10.setText("");
            textView11.setText("");
            textView12.setText("");
            textView13.setText("");
            textView14.setText("");
            textView15.setText("");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}
