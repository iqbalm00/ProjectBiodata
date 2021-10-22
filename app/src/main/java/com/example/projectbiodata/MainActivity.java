package com.example.projectbiodata;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellphone(View view) {
        String nomor = "0895415041765";
        Intent it = new Intent(Intent.ACTION_VIEW);
        it.setData(Uri.fromParts("tel", nomor, null));
        startActivity(it);

    }

    public void showMap(View view) {
        Uri uri = Uri.parse("-7.007451,110.489730");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);

    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"1112020125702mhs.dinus.ac.id"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}