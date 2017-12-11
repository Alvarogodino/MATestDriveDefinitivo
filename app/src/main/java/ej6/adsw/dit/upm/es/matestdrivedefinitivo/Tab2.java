package ej6.adsw.dit.upm.es.matestdrivedefinitivo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Tab2 extends Fragment {

    Button botonLS, botonLV, botonNGS, botonODS, botonSCM;
    String titulo;
    String definicion;

    ImageButton ImagenButtonLS, ImagenButtonLV, ImagenButtonNGS, ImagenButtonODS, ImagenButtonSCM;
    TextView textSeñales;

    private Spinner LS, LV, NGS, ODS, SCM;

    public static final String TITULO="titulo";
    public static final String DEFINICION="definicion";
    public static final String IMAGEN="imagen";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tab2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        LS = (Spinner) view.findViewById(R.id.spinnerLS);
        ArrayAdapter adapterLS = ArrayAdapter.createFromResource(getContext(), R.array.LS, android.R.layout.simple_spinner_item);
        LS.setAdapter(adapterLS);

        LV = (Spinner) view.findViewById(R.id.spinnerLV);
        ArrayAdapter adapterLV = ArrayAdapter.createFromResource(getContext(), R.array.LV, android.R.layout.simple_spinner_item);
        LV.setAdapter(adapterLV);

        NGS = (Spinner) view.findViewById(R.id.spinnerNGS);
        ArrayAdapter adapterNGS = ArrayAdapter.createFromResource(getContext(), R.array.NGS, android.R.layout.simple_spinner_item);
        NGS.setAdapter(adapterNGS);

        ODS = (Spinner) view.findViewById(R.id.spinnerODS);
        ArrayAdapter adapterODS = ArrayAdapter.createFromResource(getContext(), R.array.ODS, android.R.layout.simple_spinner_item);
        ODS.setAdapter(adapterODS);

        SCM = (Spinner) view.findViewById(R.id.spinnerSCM);
        ArrayAdapter adapterSCM = ArrayAdapter.createFromResource(getContext(), R.array.SCM, android.R.layout.simple_spinner_item);
        SCM.setAdapter(adapterSCM);

        textSeñales = (TextView) view.findViewById(R.id.textSeñales);
        textSeñales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearDialogo().show();
            }
        });

        //   PRIMER BOTON
        ImagenButtonLS = (ImageButton) view.findViewById(R.id.image_buttonLS);
        ImagenButtonLS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=LS.getSelectedItem().toString();
                if (selec.equals("Los semáforos")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LS_T1);
                    definicion = getString(R.string.LS_T1D);

                    i.putExtra(IMAGEN, R.drawable.ls1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Semáforos reservados para peatones")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LS_T2);
                    definicion = getString(R.string.LS_T2D);

                    i.putExtra(IMAGEN, R.drawable.ls1_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Semáforos circulares para vehículos")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LS_T3);
                    definicion = getString(R.string.LS_T3D);

                    i.putExtra(IMAGEN, R.drawable.ls1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Semáforos cuadrados de carril")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LS_T4);
                    definicion = getString(R.string.LS_T4D);

                    i.putExtra(IMAGEN, R.drawable.ls1_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Semáforos reservados a determinados vehículos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LS_T5);
                    definicion = getString(R.string.LS_T5D);

                    i.putExtra(IMAGEN, R.drawable.ls1_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   SEGUNDO BOTON
        ImagenButtonLV = (ImageButton) view.findViewById(R.id.image_buttonLV);
        ImagenButtonLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=LV.getSelectedItem().toString();
                if (selec.equals("Términos generales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LV_T1);
                    definicion = getString(R.string.LV_T1D);

                    i.putExtra(IMAGEN, R.drawable.lv2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Límites de velocidad en vías urbanas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LV_T2);
                    definicion = getString(R.string.LV_T2D);

                    i.putExtra(IMAGEN, R.drawable.lv2_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Señales verticales de velocidad máxima")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LV_T3);
                    definicion = getString(R.string.LV_T3D);

                    i.putExtra(IMAGEN, R.drawable.ls1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("A determinados vehículos")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LV_T4);
                    definicion = getString(R.string.LV_T4D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Velocidad adecuada")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LV_T5);
                    definicion = getString(R.string.LV_T5D);

                    i.putExtra(IMAGEN, R.drawable.lv2_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Velocidades mínimas en poblado")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LV_T6);
                    definicion = getString(R.string.LV_T6D);

                    i.putExtra(IMAGEN, R.drawable.cb1_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Otras consideraciones entorno a la velocidad")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.LV_T7);
                    definicion = getString(R.string.LV_T7D);

                    i.putExtra(IMAGEN, R.drawable.cb1_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   TERCER BOTON
        ImagenButtonNGS = (ImageButton) view.findViewById(R.id.image_buttonNGS);
        ImagenButtonNGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=NGS.getSelectedItem().toString();
                if (selec.equals("Las señales como sistema de comunicación")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NGS_T1);
                    definicion = getString(R.string.NGS_T1D);

                    i.putExtra(IMAGEN, R.drawable.ngs3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Las señales de circulación")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NGS_T2);
                    definicion = getString(R.string.NGS_T2D);

                    i.putExtra(IMAGEN, R.drawable.ngs3_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Funciones que cumplen las señales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NGS_T3);
                    definicion = getString(R.string.NGS_T3D);

                    i.putExtra(IMAGEN, R.drawable.ngs3_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Obediencia de las señales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NGS_T4);
                    definicion = getString(R.string.NGS_T4D);

                    i.putExtra(IMAGEN, R.drawable.ngs3_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Visibilidad e inscripciones")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NGS_T5);
                    definicion = getString(R.string.NGS_T5D);

                    i.putExtra(IMAGEN, R.drawable.ngs3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Idioma y alteración de las señales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NGS_T6);
                    definicion = getString(R.string.NGS_T6D);

                    i.putExtra(IMAGEN, R.drawable.ngs3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   CUARTO BOTON
        ImagenButtonODS = (ImageButton) view.findViewById(R.id.image_buttonODS);
        ImagenButtonODS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=ODS.getSelectedItem().toString();
                if (selec.equals("Señales luminosas en los vehículos prioritarios")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ODS_T1);
                    definicion = getString(R.string.ODS_T1D);

                    i.putExtra(IMAGEN, R.drawable.ods4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Señales luminosas en vehículos especiales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ODS_T2);
                    definicion = getString(R.string.ODS_T2D);

                    i.putExtra(IMAGEN, R.drawable.ods4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Vehículos para obras o servicios")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ODS_T3);
                    definicion = getString(R.string.ODS_T3D);

                    i.putExtra(IMAGEN, R.drawable.ods4_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Alumbrado indicador de “Libre”")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ODS_T4);
                    definicion = getString(R.string.ODS_T4D);

                    i.putExtra(IMAGEN, R.drawable.ods4_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Dispositivo de preseñalización de peligro")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ODS_T5);
                    definicion = getString(R.string.ODS_T5D);

                    i.putExtra(IMAGEN, R.drawable.ods4_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Señales acústicas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ODS_T6);
                    definicion = getString(R.string.ODS_T6D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   QUINTO BOTON
        ImagenButtonSCM = (ImageButton) view.findViewById(R.id.image_buttonSCM);
        ImagenButtonSCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=SCM.getSelectedItem().toString();
                if (selec.equals("Paneles de mensaje variable")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SCM_T1);
                    definicion = getString(R.string.SCM_T1D);

                    i.putExtra(IMAGEN, R.drawable.scm5_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Dispositivos de barrera")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SCM_T2);
                    definicion = getString(R.string.SCM_T2D);

                    i.putExtra(IMAGEN, R.drawable.scm5_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Dispositivos de guía")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SCM_T3);
                    definicion = getString(R.string.SCM_T3D);

                    i.putExtra(IMAGEN, R.drawable.scm5_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Señalización y balizamiento de obras")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SCM_T4);
                    definicion = getString(R.string.SCM_T4D);

                    i.putExtra(IMAGEN, R.drawable.scm5_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });
    }
    private Dialog crearDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setCancelable(false);
        builder.setMessage("Necesita conexión a internet para acceder, ¿Desea continuar?");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Uri uri = Uri.parse("https://practicatest.com/temario/permiso-B/senales-verticales/59");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
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

}
