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
    EditText edittext2;
    EditText edittext3;
    EditText edittext4;
    EditText edittext5;
    EditText edittext6;
    EditText edittext7;
    EditText edittext8;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void onClick (View v) {
        try {
            edittext1 = findViewById(R.id.edittext1);
            edittext2 = findViewById(R.id.edittext2);
            edittext3 = findViewById(R.id.edittext3);
            edittext4 = findViewById(R.id.edittext4);
            edittext5 = findViewById(R.id.edittext5);
            edittext6 = findViewById(R.id.edittext6);
            edittext7 = findViewById(R.id.edittext7);
            edittext8 = findViewById(R.id.edittext8);
            Double valueHungarianForint = Double.parseDouble(edittext1.getText().toString());
            Double valueIndianRupee = valueHungarianForint * 0.2561;
            edittext5.setText(Double.toString(valueIndianRupee));
            Double valueBahrainiDinar = valueHungarianForint * 0.0014;
            edittext2.setText(" " + valueBahrainiDinar);
            Double valueJapaneseYen = valueHungarianForint * 0.4344;
            edittext6.setText(" " + valueJapaneseYen);
            Double valueMalaysianRinggit = valueHungarianForint * 0.0156;
            edittext3.setText(" " + valueMalaysianRinggit);
            Double valueRussianRuble = valueHungarianForint * 0.2288;
            edittext4.setText(" " + valueRussianRuble);
            Double valueSwissFranc = valueHungarianForint * 0.0037;
            edittext7.setText(" " + valueSwissFranc);
            Double valueUSDollar = valueHungarianForint * 0.0032;
            edittext8.setText(" " + valueUSDollar);
        } catch (Exception e) {


            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

        }
    }
    public void onClick1 (View v){
        try {
            edittext1 =  findViewById(R.id.edittext1);
            edittext2 =  findViewById(R.id.edittext2);
            edittext3 =  findViewById(R.id.edittext3);
            edittext4 =  findViewById(R.id.edittext4);
            edittext5 =  findViewById(R.id.edittext5);
            edittext6 =  findViewById(R.id.edittext6);
            edittext7 =  findViewById(R.id.edittext7);
            edittext8 =  findViewById(R.id.edittext8);
            Double valueBahrainiDinar = Double.parseDouble(edittext2.getText().toString());
            Double valueIndianRupee = valueBahrainiDinar * 170.895;
            edittext5.setText(Double.toString(valueIndianRupee));
            Double valueHungarianForint = valueBahrainiDinar * 666.9613;
            edittext1.setText(" " + valueHungarianForint);
            Double valueJapaneseYen = valueBahrainiDinar * 289.5963;
            edittext6.setText(" " + valueJapaneseYen);
            Double valueMalaysianRinggit = valueBahrainiDinar * 10.4095;
            edittext3.setText(" " + valueMalaysianRinggit);
            Double valueRussianRuble = valueBahrainiDinar * 152.6186;
            edittext4.setText(" " + valueRussianRuble);
            Double valueSwissFranc = valueBahrainiDinar * 0.0037;
            edittext7.setText(" " + valueSwissFranc);
            Double valueUSDollar = valueBahrainiDinar * 2.6595;
            edittext8.setText(" " + valueUSDollar);
        }
        catch (Exception e) {

            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

        }
    }
    //malaysian
    public void onClick2 (View v){
        try {
            edittext1 =  findViewById(R.id.edittext1);
            edittext2 =  findViewById(R.id.edittext2);
            edittext3 =  findViewById(R.id.edittext3);
            edittext4 =  findViewById(R.id.edittext4);
            edittext5 =  findViewById(R.id.edittext5);
            edittext6 =  findViewById(R.id.edittext6);
            edittext7 =  findViewById(R.id.edittext7);
            edittext8 =  findViewById(R.id.edittext8);
            Double valueMalaysianRinggit = Double.parseDouble(edittext3.getText().toString());
            Double valueIndianRupee = valueMalaysianRinggit * 16.4344;
            edittext5.setText(Double.toString(valueIndianRupee));
            Double valueHungarianForint = valueMalaysianRinggit * 64.1226;
            edittext1.setText(" " + valueHungarianForint);
            Double valueJapaneseYen = valueMalaysianRinggit * 27.8328;
            edittext6.setText(" " + valueJapaneseYen);
            Double valueBahrainiDinar = valueMalaysianRinggit * 0.0961;
            edittext2.setText(" " + valueBahrainiDinar);
            Double valueRussianRuble = valueMalaysianRinggit * 14.6633;
            edittext4.setText(" " + valueRussianRuble);
            Double valueSwissFranc = valueMalaysianRinggit * 0.2388;
            edittext7.setText(" " + valueSwissFranc);
            Double valueUSDollar = valueMalaysianRinggit * 0.2555;
            edittext8.setText(" " + valueUSDollar);
        }
        catch (Exception e) {

            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

        }
    }

//russian
public void onClick3 (View v){
    try {
        edittext1 =  findViewById(R.id.edittext1);
        edittext2 =  findViewById(R.id.edittext2);
        edittext3 =  findViewById(R.id.edittext3);
        edittext4 =  findViewById(R.id.edittext4);
        edittext5 =  findViewById(R.id.edittext5);
        edittext6 =  findViewById(R.id.edittext6);
        edittext7 =  findViewById(R.id.edittext7);
        edittext8 =  findViewById(R.id.edittext8);

        Double valueRussianRuble = Double.parseDouble(edittext4.getText().toString());
        Double valueIndianRupee = valueRussianRuble * 1.1197;
        edittext5.setText(Double.toString(valueIndianRupee));
        Double valueHungarianForint = valueRussianRuble * 4.3702;
        edittext1.setText(" " + valueHungarianForint);
        Double valueJapaneseYen = valueRussianRuble * 1.8977;
        edittext6.setText(" " + valueJapaneseYen);
        Double valueMalaysianRinggit = valueRussianRuble * 10.4095;
        edittext3.setText(" " + valueMalaysianRinggit);
        Double valueBahrainiDinar = valueRussianRuble * 0.0682;
        edittext2.setText(" " + valueBahrainiDinar);
        Double valueSwissFranc = valueRussianRuble * 0.0163;
        edittext7.setText(" " + valueSwissFranc);
        Double valueUSDollar = valueRussianRuble * 0.01742;
        edittext8.setText(" " + valueUSDollar);
    }
    catch (Exception e) {

        Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

    }
}
    //indianrupee
    public void onClick4 (View v){
        try {
            edittext1 =  findViewById(R.id.edittext1);
            edittext2 =  findViewById(R.id.edittext2);
            edittext3 =  findViewById(R.id.edittext3);
            edittext4 =  findViewById(R.id.edittext4);
            edittext5 =  findViewById(R.id.edittext5);
            edittext6 =  findViewById(R.id.edittext6);
            edittext7 =  findViewById(R.id.edittext7);
            edittext8 =  findViewById(R.id.edittext8);


            Double valueIndianRupee = Double.parseDouble(edittext5.getText().toString());
            Double valueBahrainiDinar = valueIndianRupee * 0.0058;
            edittext2.setText(" " +valueBahrainiDinar);
            Double valueHungarianForint = valueIndianRupee * 3.9019;
            edittext1.setText(" " + valueHungarianForint);
            Double valueJapaneseYen = valueIndianRupee * 1.6932;
            edittext6.setText(" " + valueJapaneseYen);
            Double valueMalaysianRinggit = valueIndianRupee * 1.6932;
            edittext3.setText(" " + valueMalaysianRinggit);
            Double valueRussianRuble = valueIndianRupee * 0.8941;
            edittext4.setText(" " + valueRussianRuble);
            Double valueSwissFranc = valueIndianRupee * 0.0145;
            edittext7.setText(" " + valueSwissFranc);
            Double valueUSDollar = valueIndianRupee * 0.0155;
            edittext8.setText(" " + valueUSDollar);
        }
        catch (Exception e) {

            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

        }
    }
    //japanese yen
    public void onClick5 (View v){
        try {
            edittext1 =  findViewById(R.id.edittext1);
            edittext2 =  findViewById(R.id.edittext2);
            edittext3 =  findViewById(R.id.edittext3);
            edittext4 =  findViewById(R.id.edittext4);
            edittext5 =  findViewById(R.id.edittext5);
            edittext6 =  findViewById(R.id.edittext6);
            edittext7 =  findViewById(R.id.edittext7);
            edittext8 =  findViewById(R.id.edittext8);

            Double valueJapaneseYen = Double.parseDouble(edittext6.getText().toString());
            Double valueIndianRupee = valueJapaneseYen * 170.895;
            edittext5.setText(Double.toString(valueIndianRupee));
            Double valueHungarianForint = valueJapaneseYen * 666.9613;
            edittext1.setText(" " + valueHungarianForint);
            Double valueBahrainiDinar = valueJapaneseYen * 289.5963;
            edittext2.setText(" " + valueBahrainiDinar);
            Double valueMalaysianRinggit = valueJapaneseYen * 10.4095;
            edittext3.setText(" " + valueMalaysianRinggit);
            Double valueRussianRuble = valueJapaneseYen * 152.6186;
            edittext4.setText(" " + valueRussianRuble);
            Double valueSwissFranc = valueJapaneseYen * 0.0037;
            edittext7.setText(" " + valueSwissFranc);
            Double valueUSDollar = valueJapaneseYen * 2.6595;
            edittext8.setText(" " + valueUSDollar);
        }
        catch (Exception e) {

            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

        }
    }
    //swiss franc
    public void onClick6 (View v){
        try {
            edittext1 =  findViewById(R.id.edittext1);
            edittext2 =  findViewById(R.id.edittext2);
            edittext3 =  findViewById(R.id.edittext3);
            edittext4 =  findViewById(R.id.edittext4);
            edittext5 =  findViewById(R.id.edittext5);
            edittext6 =  findViewById(R.id.edittext6);
            edittext7 =  findViewById(R.id.edittext7);
            edittext8 =  findViewById(R.id.edittext8);

            Double valueSwissFranc = Double.parseDouble(edittext7.getText().toString());
            Double valueIndianRupee = valueSwissFranc * 170.895;
            edittext5.setText(Double.toString(valueIndianRupee));
            Double valueHungarianForint = valueSwissFranc * 666.9613;
            edittext1.setText(" " + valueHungarianForint);
            Double valueJapaneseYen = valueSwissFranc * 289.5963;
            edittext6.setText(" " + valueJapaneseYen);
            Double valueMalaysianRinggit = valueSwissFranc * 10.4095;
            edittext3.setText(" " + valueMalaysianRinggit);
            Double valueRussianRuble = valueSwissFranc * 152.6186;
            edittext4.setText(" " + valueRussianRuble);
            Double valueBahrainiDinar = valueSwissFranc * 0.0037;
            edittext2.setText(" " + valueBahrainiDinar);
            Double valueUSDollar = valueSwissFranc * 2.6595;
            edittext8.setText(" " + valueUSDollar);
        }
        catch (Exception e) {

            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();

        }
    }
    //us dollar
    public void onClick7 (View v){
        try {
            edittext1 =  findViewById(R.id.edittext1);
            edittext2 =  findViewById(R.id.edittext2);
            edittext3 =  findViewById(R.id.edittext3);
            edittext4 =  findViewById(R.id.edittext4);
            edittext5 =  findViewById(R.id.edittext5);
            edittext6 =  findViewById(R.id.edittext6);
            edittext7 =  findViewById(R.id.edittext7);
            edittext8 =  findViewById(R.id.edittext8);

            Double valueUSDollar = Double.parseDouble(edittext8.getText().toString());
            Double valueIndianRupee = valueUSDollar * 64.2903;
            edittext5.setText(Double.toString(valueIndianRupee));
            Double valueHungarianForint = valueUSDollar * 250.8708;
            edittext1.setText(" " + valueHungarianForint);
            Double valueJapaneseYen = valueUSDollar * 108.9071;
            edittext6.setText(" " + valueJapaneseYen);
            Double valueMalaysianRinggit = valueUSDollar * 3.9126;
            edittext3.setText(" " + valueMalaysianRinggit);
            Double valueRussianRuble = valueUSDollar * 57.4481;
            edittext4.setText(" " + valueRussianRuble);
            Double valueSwissFranc = valueUSDollar * 0.9339;
            edittext7.setText(" " + valueSwissFranc);
            Double valueBahrainiDinar = valueUSDollar * 0.376;
            edittext2.setText(" " + valueBahrainiDinar);
        }
        catch (Exception e) {

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
            edittext2.setText("");
            edittext3.setText("");
            edittext4.setText("");
            edittext5.setText("");
            edittext6.setText("");
            edittext7.setText("");
            edittext8.setText("");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}

