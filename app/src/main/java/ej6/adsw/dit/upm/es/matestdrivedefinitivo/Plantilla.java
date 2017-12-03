package ej6.adsw.dit.upm.es.matestdrivedefinitivo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Plantilla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plantilla);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(getString(R.string.app_name));

        TextView titulo1 = (TextView) findViewById(R.id.tituloP);
        TextView definicion1 = (TextView) findViewById(R.id.definicionP);

        ImageView image1 = (ImageView)  findViewById(R.id.imagenP);

        Intent i = getIntent();
        String titulo = i.getStringExtra("titulo");
        String definicion = i.getStringExtra("definicion");

        int img = i.getIntExtra(Tab1.IMAGEN, 0);
        titulo1.setText(titulo);
        definicion1.setText(definicion);

        image1.setImageResource(img);
    }
}