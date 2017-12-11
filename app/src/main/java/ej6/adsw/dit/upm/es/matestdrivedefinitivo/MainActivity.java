package ej6.adsw.dit.upm.es.matestdrivedefinitivo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static final String APP_VERSION = "1.0";
    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;
    private String titulo;
    private String definicion;

    public static final String TITULO="titulo";
    public static final String DEFINICION="definicion";
    public static final String IMAGEN="imagen";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.titlista);
        tabLayout.getTabAt(1).setIcon(R.drawable.titpeligrosenal);
        tabLayout.getTabAt(2).setIcon(R.drawable.titllanta);
        tabLayout.getTabAt(3).setIcon(R.drawable.titpoliciatrafico);
        tabLayout.getTabAt(4).setIcon(R.drawable.titcamaraseguridad);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.ayuda) {
            // muestra un alert con informacion de la app y sus creadores
            mostrarInfoAyuda();
            return true;
        }else if(id == R.id.resumen){
            //TODO
            Intent i= new Intent(this, Plantilla.class);
            titulo = getString(R.string.T_Res);
            definicion = getString(R.string.Res);
            i.putExtra(IMAGEN, R.drawable.cb1_1);
            i.putExtra(TITULO,titulo);
            i.putExtra(DEFINICION,definicion);
            startActivity(i);
            return true;
        }else if (id == R.id.informacion) {
            // muestra un alert con informacion de la app y sus creadores
            mostrarInfoAlert();
            return true;
        }else if(id == R.id.salir){
            crearDialogo().show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean mostrarInfoAyuda() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                .setTitle(getString(R.string.alert_ayuda_title))
                .setIcon(android.R.drawable.ic_dialog_info)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setMessage("Para acceder al contenido primero deberás de seleccionar la opción de uno de los desplegables, " +
                        "acto seguido, pulsa en el botón que está asignado a la derecha del desplegable " +
                        "y te redirigirá a la pantalla con el contenido seleccionado. " +
                        " En el apartado de señales, segunda pestaña, encontrarás al final un texto donde al pulsarlo te redigirá " +
                        "al contenido de señales verticales de tráfico");
        builder.create().show();
        return true;
    }

    private boolean mostrarInfoAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                .setTitle(getString(R.string.alert_info_title))
                .setIcon(android.R.drawable.ic_dialog_info)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setMessage("Versión: " + APP_VERSION +
                    "\nCreado por: " +
                    "\n  -Alvaro Godino"+
                    "\n  -MiguelContreras"+
                    "\nCorreo: " +
                    "\n  -matestdrive@gmail.com");
        builder.create().show();
        return true;
    }

    private Dialog crearDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(false);
        builder.setMessage("¿Seguro que quieres salir?");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        return builder.create();
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Tab1 tab1 = new Tab1();
                    return tab1;
                case 1:
                    Tab2 tab2 = new Tab2();
                    return tab2;
                case 2:
                    Tab3 tab3 = new Tab3();
                    return tab3;
                case 3:
                    Tab4 tab4 = new Tab4();
                    return tab4;
                case 4:
                    Tab5 tab5 = new Tab5();
                    return tab5;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "";
                case 1:
                    return "";
                case 2:
                    return "";
                case 3:
                    return "";
                case 4:
                    return "";
            }
            return null;
        }
    }
}
