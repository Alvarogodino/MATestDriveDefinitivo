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

public class Tab3 extends Fragment {

    Button botonMRA, botonVET, botonNA, botonFU, botonFMA, botonARH;

    String titulo;
    String definicion;

    ImageButton ImagenButtonMRA, ImagenButtonVET, ImagenButtonNA, ImagenButtonFU, ImagenButtonFMA, ImagenButtonARH;

    private Spinner MRA, VET, NA, FU, FMA, ARH;

    public static final String TITULO="titulo";
    public static final String DEFINICION="definicion";
    public static final String IMAGEN="imagen";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tab3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        FMA = (Spinner) view.findViewById(R.id.spinnerFMA);
        ArrayAdapter adapterFMA = ArrayAdapter.createFromResource(getContext(), R.array.FMA, android.R.layout.simple_spinner_item);
        FMA.setAdapter(adapterFMA);
        FU = (Spinner) view.findViewById(R.id.spinnerFU);
        ArrayAdapter adapterFU = ArrayAdapter.createFromResource(getContext(), R.array.FU, android.R.layout.simple_spinner_item);
        FU.setAdapter(adapterFU);
        MRA = (Spinner) view.findViewById(R.id.spinnerMRA);
        ArrayAdapter adapterMRA = ArrayAdapter.createFromResource(getContext(), R.array.MRA, android.R.layout.simple_spinner_item);
        MRA.setAdapter(adapterMRA);
        NA = (Spinner) view.findViewById(R.id.spinnerNA);
        ArrayAdapter adapterNA = ArrayAdapter.createFromResource(getContext(), R.array.NA, android.R.layout.simple_spinner_item);
        NA.setAdapter(adapterNA);
        VET = (Spinner) view.findViewById(R.id.spinnerVET);
        ArrayAdapter adapterVET = ArrayAdapter.createFromResource(getContext(), R.array.VET, android.R.layout.simple_spinner_item);
        VET.setAdapter(adapterVET);
        ARH = (Spinner) view.findViewById(R.id.spinnerARH);
        ArrayAdapter adapterARH = ArrayAdapter.createFromResource(getContext(), R.array.ARH, android.R.layout.simple_spinner_item);
        ARH.setAdapter(adapterARH);

        ImagenButtonMRA = (ImageButton) view.findViewById(R.id.image_buttonMRA);
        ImagenButtonMRA .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=MRA.getSelectedItem().toString();
                if (selec.equals("Reglaje del asiento")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T1);
                    definicion = getString(R.string.MRA_T1D);

                    i.putExtra(IMAGEN, R.drawable.mra1_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Los mandos del pie")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T2);
                    definicion = getString(R.string.MRA_T2D);

                    i.putExtra(IMAGEN, R.drawable.mra1_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El volante")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T3);
                    definicion = getString(R.string.MRA_T3D);

                    i.putExtra(IMAGEN, R.drawable.mra1_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El freno de estacionamiento")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T4);
                    definicion = getString(R.string.MRA_T4D);

                    i.putExtra(IMAGEN, R.drawable.mra1_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La palanca de cambio")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T5);
                    definicion = getString(R.string.MRA_T5D);

                    i.putExtra(IMAGEN, R.drawable.mra1_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Indicadores de dirección")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T6);
                    definicion = getString(R.string.MRA_T6D);

                    i.putExtra(IMAGEN, R.drawable.mra1_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Luces")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T7);
                    definicion = getString(R.string.MRA_T7D);

                    i.putExtra(IMAGEN, R.drawable.mra1_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Limpiaparabrisas")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T8);
                    definicion = getString(R.string.MRA_T8D);

                    i.putExtra(IMAGEN, R.drawable.mra1_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Tablero de instrumentos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T9);
                    definicion = getString(R.string.MRA_T9D);

                    i.putExtra(IMAGEN, R.drawable.mra1_9);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El habitáculo del automóvil")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MRA_T10);
                    definicion = getString(R.string.MRA_T10D);

                    i.putExtra(IMAGEN, R.drawable.mra1_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonVET = (ImageButton) view.findViewById(R.id.image_buttonVET);
        ImagenButtonVET .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=VET.getSelectedItem().toString();
                if (selec.equals("La visibilidad")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T1);
                    definicion = getString(R.string.VET_T1D);

                    i.putExtra(IMAGEN, R.drawable.vet2_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El parabrisas y la luneta")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T2);
                    definicion = getString(R.string.VET_T2D);

                    i.putExtra(IMAGEN, R.drawable.vet2_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Limpiaparabrisas y lavaparabrisas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T3);
                    definicion = getString(R.string.VET_T3D);

                    i.putExtra(IMAGEN, R.drawable.vet2_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Limpialuneta y lavaluneta")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T4);
                    definicion = getString(R.string.VET_T4D);

                    i.putExtra(IMAGEN, R.drawable.vet2_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Limpiafaros y lavafaros")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T5);
                    definicion = getString(R.string.VET_T5D);

                    i.putExtra(IMAGEN, R.drawable.vet2_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Dispositivos antihielo y antivaho")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T6);
                    definicion = getString(R.string.VET_T6D);

                    i.putExtra(IMAGEN, R.drawable.vet2_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El quitasol")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T7);
                    definicion = getString(R.string.VET_T7D);

                    i.putExtra(IMAGEN, R.drawable.vet2_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Los espejos retrovisores")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T8);
                    definicion = getString(R.string.VET_T8D);

                    i.putExtra(IMAGEN, R.drawable.vet2_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Clases de espejos retrovisores")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T9);
                    definicion = getString(R.string.VET_T9D);

                    i.putExtra(IMAGEN, R.drawable.vet2_8);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Regulación de los espejos retrovisores")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.VET_T10);
                    definicion = getString(R.string.VET_T10D);

                    i.putExtra(IMAGEN, R.drawable.vet2_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonNA = (ImageButton) view.findViewById(R.id.image_buttonNA);
        ImagenButtonNA .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=NA.getSelectedItem().toString();
                if (selec.equals("Las ruedas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T1);
                    definicion = getString(R.string.NA_T1D);

                    i.putExtra(IMAGEN, R.drawable.na3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Funciones de las ruedas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T2);
                    definicion = getString(R.string.NA_T2D);

                    i.putExtra(IMAGEN, R.drawable.na3_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("La llanta")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T3);
                    definicion = getString(R.string.NA_T3D);

                    i.putExtra(IMAGEN, R.drawable.na3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El neumático")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T4);
                    definicion = getString(R.string.NA_T4D);

                    i.putExtra(IMAGEN, R.drawable.na3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Funciones de los neumáticos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T5);
                    definicion = getString(R.string.NA_T5D);

                    i.putExtra(IMAGEN, R.drawable.na3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Neumáticos radiales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T6);
                    definicion = getString(R.string.NA_T6D);

                    i.putExtra(IMAGEN, R.drawable.na3_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Neumáticos con ó sin cámara")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T7);
                    definicion = getString(R.string.NA_T7D);

                    i.putExtra(IMAGEN, R.drawable.na3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La adherencia")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T8);
                    definicion = getString(R.string.NA_T8D);

                    i.putExtra(IMAGEN, R.drawable.na3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Influencia del pavimento")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T9);
                    definicion = getString(R.string.NA_T9D);

                    i.putExtra(IMAGEN, R.drawable.na3_9);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Presión de inflado")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.NA_T10);
                    definicion = getString(R.string.NA_T10D);

                    i.putExtra(IMAGEN, R.drawable.na3_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonFU = (ImageButton) view.findViewById(R.id.image_buttonFU);
        ImagenButtonFU .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=FU.getSelectedItem().toString();
                if (selec.equals("Los frenos y su utilización")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T1);
                    definicion = getString(R.string.FU_T1D);

                    i.putExtra(IMAGEN, R.drawable.fu4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Clases de Frenos")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T2);
                    definicion = getString(R.string.FU_T2D);

                    i.putExtra(IMAGEN, R.drawable.fu4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El frenado")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T3);
                    definicion = getString(R.string.FU_T3D);

                    i.putExtra(IMAGEN, R.drawable.fu4_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Eficacia del frenado")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T4);
                    definicion = getString(R.string.FU_T4D);

                    i.putExtra(IMAGEN, R.drawable.fu4_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Utilización de los frenos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T5);
                    definicion = getString(R.string.FU_T5D);

                    i.putExtra(IMAGEN, R.drawable.fu4_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("frenos en condiciones normales")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T6);
                    definicion = getString(R.string.FU_T6D);

                    i.putExtra(IMAGEN, R.drawable.fu4_6);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("frenos en detención de emergencia")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T7);
                    definicion = getString(R.string.FU_T7D);

                    i.putExtra(IMAGEN, R.drawable.fu4_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Fallo de los frenos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T8);
                    definicion = getString(R.string.FU_T8D);

                    i.putExtra(IMAGEN, R.drawable.fu4_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Pérdida de líquido")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T9);
                    definicion = getString(R.string.FU_T8D);

                    i.putExtra(IMAGEN, R.drawable.fu4_9);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("El derrape")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FU_T10);
                    definicion = getString(R.string.FU_T10D);

                    i.putExtra(IMAGEN, R.drawable.fu4_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }

            }
        });

        ImagenButtonFMA = (ImageButton) view.findViewById(R.id.image_buttonFMA);
        ImagenButtonFMA .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=FMA.getSelectedItem().toString();
                if (selec.equals("Constitución de un automóvil")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T1);
                    definicion = getString(R.string.FMA_T1D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("El Motor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T2);
                    definicion = getString(R.string.FMA_T2D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Mantenimiento del motor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T3);
                    definicion = getString(R.string.FMA_T3D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Alimentación del motor")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T4);
                    definicion = getString(R.string.FMA_T4D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Sistema de escape")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T5);
                    definicion = getString(R.string.FMA_T5D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Silenciador")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T6);
                    definicion = getString(R.string.FMA_T6D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Catalizador")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T7);
                    definicion = getString(R.string.FMA_T7D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Sistema de lubricación")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T8);
                    definicion = getString(R.string.FMA_T8D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Sistema de refrigeración")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T9);
                    definicion = getString(R.string.FMA_T9D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("La Batería")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.FMA_T10);
                    definicion = getString(R.string.FMA_T10D);

                    i.putExtra(IMAGEN, R.drawable.fma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonARH = (ImageButton) view.findViewById(R.id.image_buttonARH);
        ImagenButtonARH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=ARH.getSelectedItem().toString();
                if (selec.equals("Accesorios que deben llevar los vehículos")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ARH_T1);
                    definicion = getString(R.string.ARH_T1D);

                    i.putExtra(IMAGEN, R.drawable.arh7_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Inspecciones técnicas periódicas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ARH_T2);
                    definicion = getString(R.string.ARH_T2D);

                    i.putExtra(IMAGEN, R.drawable.arh7_2);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Resultado de la inspección favorable")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ARH_T3);
                    definicion = getString(R.string.ARH_T3D);

                    i.putExtra(IMAGEN, R.drawable.ra2_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Resultado de la inspección desfavorable")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ARH_T4);
                    definicion = getString(R.string.ARH_T4D);

                    i.putExtra(IMAGEN, R.drawable.arh7_4);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Incumplimiento de normas sobre inspecciones")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.ARH_T5);
                    definicion = getString(R.string.ARH_T5D);

                    i.putExtra(IMAGEN, R.drawable.arh7_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });
    }
}
