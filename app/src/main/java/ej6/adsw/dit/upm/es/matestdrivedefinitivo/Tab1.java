package ej6.adsw.dit.upm.es.matestdrivedefinitivo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;


public class Tab1 extends Fragment {

    Button botonCB, botonRA, botonCU, botonPS, botonPSD, botonCEC, botonPDV;
    String titulo;
    String definicion;

    ImageButton ImagenButtonCB, ImagenButtonRA, ImagenButtonCU, ImagenButtonPS, ImagenButtonPSD, ImagenButtonCEC, ImagenButtonPDV;

    private Spinner CB, RA, CU, PS, PSD, CEC, PDV;

    public static final String TITULO="titulo";
    public static final String DEFINICION="definicion";
    public static final String IMAGEN="imagen";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        CB = (Spinner) view.findViewById(R.id.spinnerCB);
        ArrayAdapter adapterCB = ArrayAdapter.createFromResource(getContext(), R.array.CB, android.R.layout.simple_spinner_item);
        CB.setAdapter(adapterCB);

        RA = (Spinner) view.findViewById(R.id.spinnerRA);
        ArrayAdapter adapterRA = ArrayAdapter.createFromResource(getContext(), R.array.RA, android.R.layout.simple_spinner_item);
        RA.setAdapter(adapterRA);

        CU = (Spinner) view.findViewById(R.id.spinnerCU);
        ArrayAdapter adapterCU = ArrayAdapter.createFromResource(getContext(), R.array.CU, android.R.layout.simple_spinner_item);
        CU.setAdapter(adapterCU);

        PS = (Spinner) view.findViewById(R.id.spinnerPS);
        ArrayAdapter adapterPS = ArrayAdapter.createFromResource(getContext(), R.array.PS, android.R.layout.simple_spinner_item);
        PS.setAdapter(adapterPS);

        PSD = (Spinner) view.findViewById(R.id.spinnerPSD);
        ArrayAdapter adapterPSD = ArrayAdapter.createFromResource(getContext(), R.array.PSD, android.R.layout.simple_spinner_item);
        PSD.setAdapter(adapterPSD);

        CEC = (Spinner) view.findViewById(R.id.spinnerCEC);
        ArrayAdapter adapterCEC = ArrayAdapter.createFromResource(getContext(), R.array.CEC, android.R.layout.simple_spinner_item);
        CEC.setAdapter(adapterCEC);

        PDV = (Spinner) view.findViewById(R.id.spinnerPDV);
        ArrayAdapter adapterPDV = ArrayAdapter.createFromResource(getContext(), R.array.PDV, android.R.layout.simple_spinner_item);
        PDV.setAdapter(adapterPDV);

        //   PRIMER BOTON
        ImagenButtonCB = (ImageButton) view.findViewById(R.id.image_buttonCB);
        ImagenButtonCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=CB.getSelectedItem().toString();
                if (selec.equals("Conceptos referidos al factor humano")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T1);
                    definicion = getString(R.string.CB_T1D);

                    i.putExtra(IMAGEN, R.drawable.cb1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);

                } else if (selec.equals("Conceptos referidos al vehículo")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T2);
                    definicion = getString(R.string.CB_T2D);

                    i.putExtra(IMAGEN, R.drawable.cb1_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);

                } else if (selec.equals("Clasificación de vehículos sin motor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T3);
                    definicion = getString(R.string.CB_T3D);

                    i.putExtra(IMAGEN, R.drawable.cb1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Clasificación de vehículos con motor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T4);
                    definicion = getString(R.string.CB_T4D);

                    i.putExtra(IMAGEN, R.drawable.cb1_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Vehículos especiales agrícolas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T5);
                    definicion = getString(R.string.CB_T5D);

                    i.putExtra(IMAGEN, R.drawable.cb1_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Vehículos especiales para obras y servicios")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T6);
                    definicion = getString(R.string.CB_T6D);

                    i.putExtra(IMAGEN, R.drawable.cb1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Partes de la vía")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T7);
                    definicion = getString(R.string.CB_T7D);

                    i.putExtra(IMAGEN, R.drawable.cb1_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Otros conceptos referidos a la vía")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T8);
                    definicion = getString(R.string.CB_T8D);

                    i.putExtra(IMAGEN, R.drawable.cb1_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Vías interurbanas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CB_T9);
                    definicion = getString(R.string.CB_T9D);

                    i.putExtra(IMAGEN, R.drawable.cb1_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   SEGUNDO BOTON
        ImagenButtonRA = (ImageButton) view.findViewById(R.id.image_buttonRA);
        ImagenButtonRA .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=RA.getSelectedItem().toString();

                if (selec.equals("Permiso de conducción como requisito")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t1);
                    definicion = getString(R.string.ra_t1d);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Clases de permisos de conducción")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t2);
                    definicion = getString(R.string.ra_t2d);

                    i.putExtra(IMAGEN, R.drawable.ra2_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Consideraciones a tener en cuenta")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t3);
                    definicion = getString(R.string.ra_t3d);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("La Licencia de Conducción")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t4);
                    definicion = getString(R.string.ra_t4d);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Limitaciones para los conductores noveles")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t5);
                    definicion = getString(R.string.ra_t5d);

                    i.putExtra(IMAGEN, R.drawable.ra2_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Permiso por puntos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t6);
                    definicion = getString(R.string.ra_t6d);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Pérdida de puntos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t7);
                    definicion = getString(R.string.ra_t7d);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Suspensión del permiso de conducción")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t8);
                    definicion = getString(R.string.ra_t8d);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Documentos necesarios para circular")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t9);
                    definicion = getString(R.string.ra_t9d);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Tarjeta I.T.V")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ra_t10);
                    definicion = getString(R.string.ra_t10d);

                    i.putExtra(IMAGEN, R.drawable.ra2_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   TERCER BOTON
        ImagenButtonCU = (ImageButton) view.findViewById(R.id.image_buttonCU);
        ImagenButtonCU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String selec=CU.getSelectedItem().toString();

                if (selec.equals("El conductor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CU_T1);
                    definicion = getString(R.string.CU_T1D);

                    i.putExtra(IMAGEN, R.drawable.cu3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Necesidad entre usuarios")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CU_T2);
                    definicion = getString(R.string.CU_D2T);

                    i.putExtra(IMAGEN, R.drawable.cu3_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Zona de incertidumbre")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CU_T3);
                    definicion = getString(R.string.CU_T3D);

                    i.putExtra(IMAGEN, R.drawable.cu3_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Los peatones")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CU_T4);
                    definicion = getString(R.string.CU_T4D);

                    i.putExtra(IMAGEN, R.drawable.cu3_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Dificultades por vehículos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CU_T5);
                    definicion = getString(R.string.CU_T5D);

                    i.putExtra(IMAGEN, R.drawable.cu3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Vehículos de 2 ruedas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CU_T6);
                    definicion = getString(R.string.CU_T6D);

                    i.putExtra(IMAGEN, R.drawable.cb1_2); //misma imagen del tema CB
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Animales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CU_T7);
                    definicion = getString(R.string.CU_T7D);

                    i.putExtra(IMAGEN, R.drawable.cu3_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   CUARTO BOTON
        ImagenButtonPS = (ImageButton) view.findViewById(R.id.image_buttonPS);
        ImagenButtonPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String selec=PS.getSelectedItem().toString();
                if (selec.equals("Sentido de la circulación")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T1);
                    definicion = getString(R.string.PS_T1D);

                    i.putExtra(IMAGEN, R.drawable.ps4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Posición en la calzada")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T2);
                    definicion = getString(R.string.PS_T2D);

                    i.putExtra(IMAGEN, R.drawable.ps4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Utilización de carriles")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T3);
                    definicion = getString(R.string.PS_T3D);

                    i.putExtra(IMAGEN, R.drawable.ps4_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Vías fuera de poblado")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T4);
                    definicion = getString(R.string.PS_T4D);

                    i.putExtra(IMAGEN, R.drawable.ps4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Utilización de carriles en poblado")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T5);
                    definicion = getString(R.string.PS_T5D);

                    i.putExtra(IMAGEN, R.drawable.ps4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Circulación por el arcén")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T6);
                    definicion = getString(R.string.PS_T6D);

                    i.putExtra(IMAGEN, R.drawable.ps4_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Carriles reservados")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T7);
                    definicion = getString(R.string.PS_T7D);

                    i.putExtra(IMAGEN, R.drawable.ps4_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Carril cerrado la circulación")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T8);
                    definicion = getString(R.string.PS_T8D);

                    i.putExtra(IMAGEN, R.drawable.ps4_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Vías y carriles para ciclistas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T9);
                    definicion = getString(R.string.PS_T9D);

                    i.putExtra(IMAGEN, R.drawable.ps4_9);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Carriles reversibles")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PS_T10);
                    definicion = getString(R.string.PS_T10D);

                    i.putExtra(IMAGEN, R.drawable.ps4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        //   QUINTO BOTON
        ImagenButtonPSD = (ImageButton) view.findViewById(R.id.image_buttonPSD);
        ImagenButtonPSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String selec = PSD.getSelectedItem().toString();

                if (selec.equals("Placas de matrícula")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PSD_T1);
                    definicion = getString(R.string.PSD_T1D);

                    i.putExtra(IMAGEN, R.drawable.psd5_1);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);

                } else if (selec.equals("Placas de automóviles")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PSD_T2);
                    definicion = getString(R.string.PSD_T2D);

                    i.putExtra(IMAGEN, R.drawable.psd5_1);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Vehículos especiales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PSD_T3);
                    definicion = getString(R.string.PSD_T3D);

                    i.putExtra(IMAGEN, R.drawable.psd5_3);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Remolques y Semirremolques")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PSD_T4);
                    definicion = getString(R.string.PSD_T4D);

                    i.putExtra(IMAGEN, R.drawable.psd5_3);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Placas de ensayo")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PSD_T5);
                    definicion = getString(R.string.PSD_T5D);

                    i.putExtra(IMAGEN, R.drawable.psd5_5);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                }
            }
        });

        //   SEXTO BOTON
        ImagenButtonCEC = (ImageButton) view.findViewById(R.id.image_buttonCEC);
        ImagenButtonCEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=CEC.getSelectedItem().toString();
                if (selec.equals("Conducción, económica y medio ambiente")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.cec_t1);
                    definicion = getString(R.string.cec_d1);

                    i.putExtra(IMAGEN, R.drawable.cec6_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);

                } else if (selec.equals("Consumo de carburante")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.cec_t2);
                    definicion = getString(R.string.cec_d2);

                    i.putExtra(IMAGEN, R.drawable.cec6_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("La forma de conducir")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.cec_t3);
                    definicion = getString(R.string.cec_d3);

                    i.putExtra(IMAGEN, R.drawable.cec6_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El mantenimiento del vehículo")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.cec_t4);
                    definicion = getString(R.string.cec_d4);

                    i.putExtra(IMAGEN, R.drawable.cec6_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La aerodinámica")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.cec_t5);
                    definicion = getString(R.string.cec_d5);

                    i.putExtra(IMAGEN, R.drawable.cec6_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Contaminación del medio ambiente")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.cec_t6);
                    definicion = getString(R.string.cec_d6);

                    i.putExtra(IMAGEN, R.drawable.cec6_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });


        //   SEPTIMO BOTON
        ImagenButtonPDV = (ImageButton) view.findViewById(R.id.image_buttonPDV);
        ImagenButtonPDV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=PDV.getSelectedItem().toString();
                if (selec.equals("El estado del vehículo")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T1);
                    definicion = getString(R.string.PDV_T1D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);

                } else if (selec.equals("El estado del conductor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T2);
                    definicion = getString(R.string.PDV_T2D);

                    i.putExtra(IMAGEN, R.drawable.cec6_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Elección del itinerario")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T3);
                    definicion = getString(R.string.PDV_T3D);

                    i.putExtra(IMAGEN, R.drawable.cu3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Elección de los días y horas de salida")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T4);
                    definicion = getString(R.string.PDV_T4D);

                    i.putExtra(IMAGEN, R.drawable.cec6_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La instalación de los viajeros")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T5);
                    definicion = getString(R.string.PDV_T5D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La carga y el equipaje")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T6);
                    definicion = getString(R.string.PDV_T6D);

                    i.putExtra(IMAGEN, R.drawable.cec6_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Documentación del conductor y del vehículo")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T7);
                    definicion = getString(R.string.PDV_T7D);

                    i.putExtra(IMAGEN, R.drawable.ra2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Comportamiento en la circulación")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T8);
                    definicion = getString(R.string.PDV_T8D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Paradas, descansos y comidas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T9);
                    definicion = getString(R.string.PDV_T9D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_9);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Viajes al extranjero")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PDV_T10);
                    definicion = getString(R.string.PDV_T10D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });
    }
}
