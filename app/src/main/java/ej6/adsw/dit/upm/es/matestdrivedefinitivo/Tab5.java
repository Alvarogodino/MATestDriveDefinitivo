package ej6.adsw.dit.upm.es.matestdrivedefinitivo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Tab5 extends Fragment {

    Button botonCAA, botonCNC, botonEIA, botonFDA, botonPCV, botonSP, botonVE;
    String titulo;
    String definicion;

    ImageButton ImagenButtonCAA, ImagenButtonCNC, ImagenButtonEIA, ImagenButtonFDA, ImagenButtonPCV, ImagenButtonSP, ImagenButtonVE;

    private Spinner CAA, CNC, EIA, FDA, PCV, SP, VE;

    public static final String TITULO = "titulo";
    public static final String DEFINICION = "definicion";
    public static final String IMAGEN = "imagen";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab5, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        CAA = (Spinner) view.findViewById(R.id.spinnerCAA);
        ArrayAdapter adapterCAA = ArrayAdapter.createFromResource(getContext(), R.array.CAA, android.R.layout.simple_spinner_item);
        CAA.setAdapter(adapterCAA);

        CNC = (Spinner) view.findViewById(R.id.spinnerCNC);
        ArrayAdapter adapterCNC = ArrayAdapter.createFromResource(getContext(), R.array.CNC, android.R.layout.simple_spinner_item);
        CNC.setAdapter(adapterCNC);

        EIA = (Spinner) view.findViewById(R.id.spinnerEIA);
        ArrayAdapter adapterEIA = ArrayAdapter.createFromResource(getContext(), R.array.EIA, android.R.layout.simple_spinner_item);
        EIA.setAdapter(adapterEIA);

        FDA = (Spinner) view.findViewById(R.id.spinnerFDA);
        ArrayAdapter adapterFDA = ArrayAdapter.createFromResource(getContext(), R.array.FDA, android.R.layout.simple_spinner_item);
        FDA.setAdapter(adapterFDA);

        PCV = (Spinner) view.findViewById(R.id.spinnerPCV);
        ArrayAdapter adapterPCV = ArrayAdapter.createFromResource(getContext(), R.array.PCV, android.R.layout.simple_spinner_item);
        PCV.setAdapter(adapterPCV);

        SP = (Spinner) view.findViewById(R.id.spinnerSP);
        ArrayAdapter adapterSP = ArrayAdapter.createFromResource(getContext(), R.array.SP, android.R.layout.simple_spinner_item);
        SP.setAdapter(adapterSP);

        VE = (Spinner) view.findViewById(R.id.spinnerVE);
        ArrayAdapter adapterVE = ArrayAdapter.createFromResource(getContext(), R.array.VE, android.R.layout.simple_spinner_item);
        VE.setAdapter(adapterVE);

        //   PRIMER BOTON
        ImagenButtonVE = (ImageButton) view.findViewById(R.id.image_buttonVE);
        ImagenButtonVE .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=VE.getSelectedItem().toString();
                if (selec.equals("Vehículos especiales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T1);
                    definicion = getString(R.string.VE_T1D);

                    i.putExtra(IMAGEN, R.drawable.ve1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Masas y dimensiones en vehículos especiales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T2);
                    definicion = getString(R.string.VE_T2D);

                    i.putExtra(IMAGEN, R.drawable.ve1_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Matriculación de vehículos especiales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T3);
                    definicion = getString(R.string.VE_T3D);

                    i.putExtra(IMAGEN, R.drawable.ve1_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Permisos para conducir vehículos especiales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T4);
                    definicion = getString(R.string.VE_T4D);

                    i.putExtra(IMAGEN, R.drawable.ve1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Condiciones técnicas para vehículos especiales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T5);
                    definicion = getString(R.string.VE_T5D);

                    i.putExtra(IMAGEN, R.drawable.ve1_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Accesorios, placas de matrícula y espejos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T6);
                    definicion = getString(R.string.VE_T6D);

                    i.putExtra(IMAGEN, R.drawable.ve1_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Posición en la calzada de vehículos especiales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T7);
                    definicion = getString(R.string.VE_T7D);

                    i.putExtra(IMAGEN, R.drawable.ve1_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Velocidad de los vehículos especiales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T8);
                    definicion = getString(R.string.VE_T8D);

                    i.putExtra(IMAGEN, R.drawable.ve1_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Normas y condiciones de circulación")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T9);
                    definicion = getString(R.string.VE_T9D);

                    i.putExtra(IMAGEN, R.drawable.ve1_9);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Condiciones para vehículos especiales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VE_T10);
                    definicion = getString(R.string.VE_T10D);

                    i.putExtra(IMAGEN, R.drawable.ve1_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }

        });

        ImagenButtonPCV = (ImageButton) view.findViewById(R.id.image_buttonPCV);
        ImagenButtonPCV .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=PCV.getSelectedItem().toString();
                if (selec.equals("Las curvas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T1);
                    definicion = getString(R.string.PCV_T1D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Curvas de reducida visibilidad")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T2);
                    definicion = getString(R.string.PCV_T2D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Proyección de gravilla")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T3);
                    definicion = getString(R.string.PCV_T3D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Animales")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T4);
                    definicion = getString(R.string.PCV_T4D);

                    i.putExtra(IMAGEN, R.drawable.cu3_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Puente móvil y muelle")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T5);
                    definicion = getString(R.string.PCV_T5D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Túneles y pasos inferiores")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T6);
                    definicion = getString(R.string.PCV_T6D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Estrechamiento de la calzada")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T7);
                    definicion = getString(R.string.PCV_T7D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Pendientes")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T8);
                    definicion = getString(R.string.PCV_T8D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Obras")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T9);
                    definicion = getString(R.string.PCV_T9D);

                    i.putExtra(IMAGEN, R.drawable.scm5_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Otros peligros de la vía")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.PCV_T10);
                    definicion = getString(R.string.PCV_T10D);

                    i.putExtra(IMAGEN, R.drawable.pcv2_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }

        });

        ImagenButtonFDA = (ImageButton) view.findViewById(R.id.image_buttonFDA);
        ImagenButtonFDA .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=FDA.getSelectedItem().toString();
                if (selec.equals("El conductor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T1);
                    definicion = getString(R.string.FDA_T1D);

                    i.putExtra(IMAGEN, R.drawable.cec6_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("La fatiga")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T2);
                    definicion = getString(R.string.FDA_T2D);

                    i.putExtra(IMAGEN, R.drawable.fda3_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Disminución de la vigilancia o atención")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T3);
                    definicion = getString(R.string.FDA_T3D);

                    i.putExtra(IMAGEN, R.drawable.fda3_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El sueño o somnolencia")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T4);
                    definicion = getString(R.string.FDA_T4D);

                    i.putExtra(IMAGEN, R.drawable.fda3_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El sentido de la vista")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T5);
                    definicion = getString(R.string.FDA_T5D);

                    i.putExtra(IMAGEN, R.drawable.fda3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El sentido del oído")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T6);
                    definicion = getString(R.string.FDA_T6D);

                    i.putExtra(IMAGEN, R.drawable.fda3_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El tiempo de reacción")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T7);
                    definicion = getString(R.string.FDA_T7D);

                    i.putExtra(IMAGEN, R.drawable.fda3_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Las drogas, cafeína y medicamentos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T8);
                    definicion = getString(R.string.FDA_T8D);

                    i.putExtra(IMAGEN, R.drawable.fda3_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La intoxicación alcohólica")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T9);
                    definicion = getString(R.string.FDA_T9D);

                    i.putExtra(IMAGEN, R.drawable.fda3_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El vestuario del conductor")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FDA_T10);
                    definicion = getString(R.string.FDA_T10D);

                    i.putExtra(IMAGEN, R.drawable.fda3_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }


        });

        ImagenButtonSP = (ImageButton) view.findViewById(R.id.image_buttonSP);
        ImagenButtonSP .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=SP.getSelectedItem().toString();
                if (selec.equals("La seguridad pasiva")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T1);
                    definicion = getString(R.string.SP_T1D);

                    i.putExtra(IMAGEN, R.drawable.sp4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Dispositivos de protección trasera")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T2);
                    definicion = getString(R.string.SP_T2D);

                    i.putExtra(IMAGEN, R.drawable.sp4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Guardabarros")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T3);
                    definicion = getString(R.string.SP_T3D);

                    i.putExtra(IMAGEN, R.drawable.sp4_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Apoyacabezas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T4);
                    definicion = getString(R.string.SP_T4D);

                    i.putExtra(IMAGEN, R.drawable.sp4_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El airbag")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T5);
                    definicion = getString(R.string.SP_T5D);

                    i.putExtra(IMAGEN, R.drawable.sp4_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Cinturón de seguridad")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T6);
                    definicion = getString(R.string.SP_T6D);

                    i.putExtra(IMAGEN, R.drawable.sp4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Eficacia del cinturón de seguridad")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T7);
                    definicion = getString(R.string.SP_T7D);

                    i.putExtra(IMAGEN, R.drawable.sp4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Obligaciones relativas al cinturón")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T8);
                    definicion = getString(R.string.SP_T8D);

                    i.putExtra(IMAGEN, R.drawable.sp4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Sistemas de sujeción para niños")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T9);
                    definicion = getString(R.string.SP_T9D);

                    i.putExtra(IMAGEN, R.drawable.pdv7_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El casco")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SP_T10);
                    definicion = getString(R.string.SP_T10D);

                    i.putExtra(IMAGEN, R.drawable.sp4_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }

        });

        ImagenButtonCNC = (ImageButton) view.findViewById(R.id.image_buttonCNC);
        ImagenButtonCNC .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=CNC.getSelectedItem().toString();
                if (selec.equals("El deslumbramiento")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T1);
                    definicion = getString(R.string.CNC_T1D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Adelantamientos en la conducción nocturna")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T2);
                    definicion = getString(R.string.CNC_T2D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Alumbrado en curvas y otras precauciones")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T3);
                    definicion = getString(R.string.CNC_T3D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("La conducción con lluvia")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T4);
                    definicion = getString(R.string.CNC_T4D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El aquaplaning")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T5);
                    definicion = getString(R.string.CNC_T5D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Mejorar la visibilidad con lluvia")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T6);
                    definicion = getString(R.string.CNC_T6D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La conducción con nieve")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T7);
                    definicion = getString(R.string.CNC_T7D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Mejorar la adherencia con nieve")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T8);
                    definicion = getString(R.string.CNC_T8D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La conducción con hielo")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T9);
                    definicion = getString(R.string.CNC_T9D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_9);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Niebla-humo")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CNC_T10);
                    definicion = getString(R.string.CNC_T10D);

                    i.putExtra(IMAGEN, R.drawable.cnc5_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }


        });

        ImagenButtonCAA = (ImageButton) view.findViewById(R.id.image_buttonCAA);
        ImagenButtonCAA .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=CAA.getSelectedItem().toString();
                if (selec.equals("La conducción en autopistas y autovías")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T1);
                    definicion = getString(R.string.CAA_T1D);

                    i.putExtra(IMAGEN, R.drawable.caa6_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Entrada en autopistas y autovías")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T2);
                    definicion = getString(R.string.CAA_T2D);

                    i.putExtra(IMAGEN, R.drawable.caa6_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Puestos de control o de peaje")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T3);
                    definicion = getString(R.string.CAA_T3D);

                    i.putExtra(IMAGEN, R.drawable.caa6_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Utilización del carril de aceleración")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T4);
                    definicion = getString(R.string.CAA_T4D);

                    i.putExtra(IMAGEN, R.drawable.caa6_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Utilización de carriles")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T5);
                    definicion = getString(R.string.CAA_T5D);

                    i.putExtra(IMAGEN, R.drawable.caa6_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Utilización del arcén")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T6);
                    definicion = getString(R.string.CAA_T6D);

                    i.putExtra(IMAGEN, R.drawable.caa6_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Velocidad máxima: autovías y autopistas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T7);
                    definicion = getString(R.string.CAA_T7D);

                    i.putExtra(IMAGEN, R.drawable.caa6_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Velocidad anormalmente reducida")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T8);
                    definicion = getString(R.string.CAA_T8D);

                    i.putExtra(IMAGEN, R.drawable.caa6_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Disminución de velocidad")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T9);
                    definicion = getString(R.string.CAA_T9D);

                    i.putExtra(IMAGEN, R.drawable.caa6_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El adelantamiento")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CAA_T10);
                    definicion = getString(R.string.CAA_T10D);

                    i.putExtra(IMAGEN, R.drawable.caa6_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }


        });

        ImagenButtonEIA = (ImageButton) view.findViewById(R.id.image_buttonEIA);
        ImagenButtonEIA .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=EIA.getSelectedItem().toString();
                if (selec.equals("La vía y su entorno")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T1);
                    definicion = getString(R.string.EIA_T1D);

                    i.putExtra(IMAGEN, R.drawable.eia7_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El conductor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T2);
                    definicion = getString(R.string.EIA_T2D);

                    i.putExtra(IMAGEN, R.drawable.eia7_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El vehículo y su carga")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T3);
                    definicion = getString(R.string.EIA_T3D);

                    i.putExtra(IMAGEN, R.drawable.cec6_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El accidente de circulación")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T4);
                    definicion = getString(R.string.EIA_T4D);

                    i.putExtra(IMAGEN, R.drawable.eia7_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Causas imputables al factor humano")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T5);
                    definicion = getString(R.string.EIA_T5D);

                    i.putExtra(IMAGEN, R.drawable.eia7_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Comportamientos incorrectos de los peatones")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T6);
                    definicion = getString(R.string.EIA_T6D);

                    i.putExtra(IMAGEN, R.drawable.eia7_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La distancia de reacción")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T7);
                    definicion = getString(R.string.EIA_T7D);

                    i.putExtra(IMAGEN, R.drawable.eia7_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La distancia de detención")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T8);
                    definicion = getString(R.string.EIA_T8D);

                    i.putExtra(IMAGEN, R.drawable.eia7_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La distancia de seguridad")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T9);
                    definicion = getString(R.string.EIA_T9D);

                    i.putExtra(IMAGEN, R.drawable.caa6_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El estado psicofísico del conductor")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.EIA_T10);
                    definicion = getString(R.string.EIA_T10D);

                    i.putExtra(IMAGEN, R.drawable.eia7_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });
    }
}
