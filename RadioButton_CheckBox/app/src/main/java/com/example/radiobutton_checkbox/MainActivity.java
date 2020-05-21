package com.example.radiobutton_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private RadioGroup grupo;
    public CheckBox ch1,ch2,ch3,ch4;
    public EditText caja,c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo = (RadioGroup)findViewById(R.id.radioNumeros);

        caja = (EditText)findViewById(R.id.caja);
        c1 = (EditText)findViewById(R.id.cajab);
        c2 = (EditText)findViewById(R.id.cajad);
        c3 = (EditText)findViewById(R.id.cajao);
        c4 = (EditText)findViewById(R.id.cajah);

        ch1 = (CheckBox) findViewById(R.id.ckbinario);
        ch2 = (CheckBox) findViewById(R.id.ckdecimal);
        ch3 = (CheckBox) findViewById(R.id.ckoctal);
        ch4 = (CheckBox) findViewById(R.id.ckhexadecimal);
    }
    //int valor = Log.d("Valor ET", caja.getText().toString());

    public void Convertir(View v) {
        String valor= caja.getText().toString();
        if (grupo.getCheckedRadioButtonId() == R.id.radioBinario) {
            final String text = "Binario";
            //Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            if (ch1.isChecked()){
                c1.setText(valor);
            }if (ch2.isChecked()){
                long bad = Long.parseLong(valor, 2);
                //String bad2= bad;
                String bad2 = Long.toString(bad);
                //String str = "1234";
                c2.setText(bad2);
            }if(ch3.isChecked()){
                long bad = Long.parseLong(valor, 2);
                //String bad2= bad;
                String bad2 = Long.toString(bad);
                String bao = Integer.toOctalString(Integer.parseInt(bad2));
                c3.setText(bao);
            }if(ch4.isChecked()){
                long bad = Long.parseLong(valor, 2);
                String bad2 = Long.toString(bad);
                //String bao = Integer.toOctalString(Integer.parseInt(bad2));
                String bah =Integer.toHexString(Integer.parseInt(bad2));
                c4.setText(bah);
            }
        };
        if (grupo.getCheckedRadioButtonId() == R.id.radioDecimal) {
            final String text = "Decimal";
            //Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            String dab = Long.toBinaryString(Long.parseLong(valor));
            if (ch1.isChecked()){
                //String dab = Long.toBinaryString(Long.parseLong(valor));
                c1.setText(dab);
            }if (ch2.isChecked()){
                c2.setText(valor);
            }if(ch3.isChecked()){
                //long bad = Long.parseLong(valor, 2);
                //String bad2= bad;
                //String bad2 = Long.toString(Long.parseLong(dab));
                String bao = Integer.toOctalString(Integer.parseInt(valor));
                c3.setText(bao);
            }if(ch4.isChecked()){
                //long bad = Long.parseLong(valor, 2);
                //String bad2 = Long.toString(Long.parseLong(dab));
                //String bao = Integer.toOctalString(Integer.parseInt(bad2));
                String bah =Integer.toHexString(Integer.parseInt(valor));
                c4.setText(bah);
            }
        }
        if (grupo.getCheckedRadioButtonId() == R.id.radioOctal) {
            final String text = "Octal";
            //Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            //Integer.parseInt();
            //int oad= Integer.parseInt(valor);
            int oad =Integer.parseInt(valor, 8);
            String oad2= String.valueOf(oad);
            if (ch1.isChecked()){
                String oab = Long.toBinaryString(Long.parseLong(oad2));
                c1.setText(oab);
            }if (ch2.isChecked()){
                c2.setText(oad2);
            }if(ch3.isChecked()){
                //long bad = Long.parseLong(valor, 2);
                //String bad2= bad;
                //String bad2 = Long.toString(Long.parseLong(dab));
                String bao = Integer.toOctalString(Integer.parseInt(oad2));
                c3.setText(bao);
            }if(ch4.isChecked()){
                //long bad = Long.parseLong(valor, 2);
                //String bad2 = Long.toString(Long.parseLong(dab));
                //String bao = Integer.toOctalString(Integer.parseInt(bad2));
                String bah =Integer.toHexString(Integer.parseInt(oad2));
                c4.setText(bah);
            }
        }
        if (grupo.getCheckedRadioButtonId() == R.id.radioHexadecimal) {
            final String text = "Hexadecimal";
            //Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            int had =Integer.parseInt(valor, 16);
            String oad2= String.valueOf(had);
            if (ch1.isChecked()){
                String oab = Long.toBinaryString(Long.parseLong(oad2));
                c1.setText(oab);
            }if (ch2.isChecked()){
                c2.setText(oad2);
            }if(ch3.isChecked()){
                //long bad = Long.parseLong(valor, 2);
                //String bad2= bad;
                //String bad2 = Long.toString(Long.parseLong(dab));
                String bao = Integer.toOctalString(Integer.parseInt(oad2));
                c3.setText(bao);
            }if(ch4.isChecked()){
                //long bad = Long.parseLong(valor, 2);
                //String bad2 = Long.toString(Long.parseLong(dab));
                //String bao = Integer.toOctalString(Integer.parseInt(bad2));
                String bah =Integer.toHexString(Integer.parseInt(oad2));
                c4.setText(bah);
            }
        }
    }
}
