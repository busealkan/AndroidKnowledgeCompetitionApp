package com.h5190059_buse_alkan.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.h5190059_buse_alkan.R;
import com.h5190059_buse_alkan.utils.Constants;
import com.h5190059_buse_alkan.utils.PrefUtil;

public class KategoriActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtOyuncuAdi;
    Button btnTeknoloji, btnMuzik, btnSpor, btnFilm, btnCikis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        init();

        cikisYap();

    }
    private void init() {
        txtOyuncuAdi = findViewById(R.id.txtOyuncuAd);
        btnTeknoloji = findViewById(R.id.btnKtgTeknoloji);
        btnMuzik = findViewById(R.id.btnKtgYemek);
        btnSpor = findViewById(R.id.btnKtgSpor);
        btnFilm = findViewById(R.id.btnKtgFilm);
        btnCikis = findViewById(R.id.btnCikis);

        txtOyuncuAdi.setText(PrefUtil.getStringPref(getApplicationContext(), Constants.PREF_OYUNCU_ADI_PARAMETRE));

        btnTeknoloji.setOnClickListener(this);
        btnMuzik.setOnClickListener(this);
        btnSpor.setOnClickListener(this);
        btnFilm.setOnClickListener(this);

    }

    private void cikisYap() {
        btnCikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cikisAlertDialog();
            }
        });
    }

    private void cikisAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.AlertDialogTheme);
        builder.setIcon(R.drawable.exiticon);
        builder.setTitle(getResources().getString(R.string.alertCikisTitle));
        builder.setMessage(getResources().getString(R.string.alertCikisMessage));
        builder.setNegativeButton(getResources().getString(R.string.alertCikisNegativeButon), null);
        builder.setPositiveButton(getResources().getString(R.string.alertCikisPozitifButon), new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                        finish();
                    }
                });
        builder.show();

    }

    public void kategoriIsmiGonder(Button kategori){
        PrefUtil.setStringPref(getApplicationContext(), Constants.PREF_KATEGORI_ADI_PARAMETRE,kategori.getText().toString());
        Intent kategoriAdIntent = new Intent(KategoriActivity.this,OyunActivity.class);
        startActivity(kategoriAdIntent);
        finish();

    }
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btnKtgTeknoloji:
                kategoriIsmiGonder(btnTeknoloji);
                break;

            case R.id.btnKtgYemek:
                kategoriIsmiGonder(btnMuzik);
                break;

            case R.id.btnKtgSpor:
                kategoriIsmiGonder(btnSpor);
                break;

            case R.id.btnKtgFilm:
                kategoriIsmiGonder(btnFilm);
                break;

            case R.id.btnCikis:
                cikisYap();
                break;
        }
    }






}