package com.h5190059_buse_alkan.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.snackbar.Snackbar;
import com.h5190059_buse_alkan.R;
import com.h5190059_buse_alkan.utils.Constants;
import com.h5190059_buse_alkan.utils.PrefUtil;

public class OyuncuIsimActivity extends AppCompatActivity {

    EditText txtAdi;
    Button btnIleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyuncu_isim_giris);

        init();

        oyuncuAdiKontrolEt();


    }

    private void init() {
        txtAdi = findViewById(R.id.txtOyuncuAdiGir);
        btnIleri = findViewById(R.id.btnIleriE2);
    }

    private void oyuncuAdiKontrolEt() {
        btnIleri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(txtAdi.getText().toString().trim().equals(""))
                {
                    Snackbar.make(v, getResources().getString(R.string.snackbarYazi), Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).setDuration(1000)
                            .setBackgroundTint(getResources().getColor(R.color.logoRengi))
                            .setTextColor(getResources().getColor(R.color.logoYaziRengi))
                            .show();
                }
                else{
                    PrefUtil.setStringPref(getApplicationContext(), Constants.PREF_OYUNCU_ADI_PARAMETRE, getResources().getString(R.string.hosgeldin)+txtAdi.getText().toString());
                    Intent kategoriIntent = new Intent(OyuncuIsimActivity.this, KategoriActivity.class);
                    startActivity(kategoriIntent);
                    finish();

                }
            }
        });
    }
}