package com.example.task5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;

import com.example.task5.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private String text = "";
    private long sonuc = 0;
    private byte artıSayaci = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        Toolbar myToolbar = (Toolbar) findViewById(tasarim.toolbar.getId());
        setSupportActionBar(tasarim.toolbar);
        myToolbar.setTitle("TOPLAMATİK");
        setSupportActionBar(myToolbar);

        tasarim.button0.setOnClickListener(view -> {
            text += 0;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button1.setOnClickListener(view -> {
            text += 1;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button2.setOnClickListener(view -> {
            text += 2;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button3.setOnClickListener(view -> {
            text += 3;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button4.setOnClickListener(view -> {
            text += 4;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button5.setOnClickListener(view -> {
            text += 5;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button6.setOnClickListener(view -> {
            text += 6;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button7.setOnClickListener(view -> {
            text += 7;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button8.setOnClickListener(view -> {
            text += 8;
            tasarim.editTextYazmac.setText(text);
        });
        tasarim.button9.setOnClickListener(view -> {
            text += 9;
            tasarim.editTextYazmac.setText(text);
        });

        tasarim.buttonToplama.setOnClickListener(view -> {
            if (text.length() > 0) {
                if (text.charAt(text.length() - 1) != '+') {
                    text += "+";
                    tasarim.editTextYazmac.setText(text);
                    artıSayaci++;
                }
            } else {
                Snackbar.make(view, "Önce Sayı Girmelisiniz!", Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(Color.RED)
                        .setTextColor(Color.WHITE)
                        .show();
            }
        });

        tasarim.buttonSil.setOnClickListener(view -> {
            if (text.length() > 0) {
                text = text.substring(0, text.length() - 1);
                tasarim.editTextYazmac.setText(text);
            }
        });

        tasarim.buttonSifirlama.setOnClickListener(view -> {
            text = "";
            tasarim.editTextYazmac.setText(text);
        });

        tasarim.buttonHesapla.setOnClickListener(view -> {
            if (artıSayaci > 0 && text.charAt(text.length() - 1) != '+') {
                String array[] = text.split("[+]");
                for (int i = 0; i < array.length; i++) {
                    sonuc += Long.valueOf(array[i]);
                }
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("SONUÇ : ");
                alert.setMessage(String.valueOf(sonuc));
                alert.setNegativeButton("ÇIK", (d, i) -> {
                    Snackbar.make(view, "Yeniden Toplama İşlemi Yapabilirsiniz...", Snackbar.LENGTH_SHORT)
                            .setBackgroundTint(Color.GREEN)
                            .setTextColor(Color.RED)
                            .show();
                });
                artıSayaci = 0;
                sonuc = 0;
                text = "";
                tasarim.editTextYazmac.setText(text);
                alert.create().show();
            } else {
                Snackbar.make(view, "Lütfen Tam ve Geçerli Bir İşlem Giriniz!", Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(Color.RED)
                        .setTextColor(Color.WHITE)
                        .show();
            }
        });
    }
}