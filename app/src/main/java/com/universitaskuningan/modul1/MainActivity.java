package com.universitaskuningan.modul1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int gajiStatus, gajiGolongan;

    String CekStatus, CekGolongan;
    RadioGroup golongan;
    CheckBox status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung (View v){
//        Mnemapilkan Nama anda
        EditText nama = (EditText) findViewById (R.id.nama);
        TextView outputNama = (TextView) findViewById (R.id.outputNama);
        String name = nama.getText().toString();
        outputNama.setText("Nama : "+name);

//        Menampilkan Status anda
        TextView outputStatus = (TextView) findViewById (R.id.outputStatus);
        status = (CheckBox) findViewById (R.id.menikah);
        if (status.isChecked())
        { gajiStatus = 500000;
            CekStatus = "sudah menikah";
        } else {
            gajiStatus = 0;
            CekStatus = "belum menikah";
        }
        outputStatus.setText("Status anda "+CekStatus);

//      Menampilkan Golongan
        golongan = (RadioGroup) findViewById (R.id.rgGolongan);
        int gol = golongan.getCheckedRadioButtonId();
        if (gol == R.id.rbGolongan1){
            gajiGolongan = 1000000;
            CekGolongan = "1";
        }else if (gol == R.id.rbGolongan2)
        {
            gajiGolongan = 2000000;
            CekGolongan = "2";
        }
        TextView outputGolongan = (TextView) findViewById(R.id.outputGolongan);
        outputGolongan.setText("Anda Golongan "+CekGolongan);

//      Total Gaji
        int totalGaji = gajiStatus+gajiGolongan;
        TextView total = (TextView) findViewById (R.id.outputGaji);
        total.setText("Gaji anda "+totalGaji);

    }
}