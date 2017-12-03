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

public class Tab4 extends Fragment {

    Button botonA, botonCSMA, botonDPE, botonIPN, botonMI, botonSOC, botonIVA;
    String titulo;
    String definicion;

    ImageButton ImagenButtonA, ImagenButtonCSMA, ImagenButtonDPE, ImagenButtonIPN, ImagenButtonMI, ImagenButtonSOC, ImagenButtonIVA;

    private Spinner A, CSMA, DPE, IPN, IVA, MI, SOC;

    public static final String TITULO = "titulo";
    public static final String DEFINICION = "definicion";
    public static final String IMAGEN = "imagen";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tab4, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        A = (Spinner) view.findViewById(R.id.spinnerA);
        ArrayAdapter adapterA = ArrayAdapter.createFromResource(getContext(), R.array.A, android.R.layout.simple_spinner_item);
        A.setAdapter(adapterA);

        CSMA = (Spinner) view.findViewById(R.id.spinnerCSMA);
        ArrayAdapter adapterCSMA = ArrayAdapter.createFromResource(getContext(), R.array.CSMA, android.R.layout.simple_spinner_item);
        CSMA.setAdapter(adapterCSMA);

        DPE = (Spinner) view.findViewById(R.id.spinnerDPE);
        ArrayAdapter adapterDPE = ArrayAdapter.createFromResource(getContext(), R.array.DPE, android.R.layout.simple_spinner_item);
        DPE.setAdapter(adapterDPE);

        IPN = (Spinner) view.findViewById(R.id.spinnerIPN);
        ArrayAdapter adapterIPN = ArrayAdapter.createFromResource(getContext(), R.array.IPN, android.R.layout.simple_spinner_item);
        IPN.setAdapter(adapterIPN);

        IVA = (Spinner) view.findViewById(R.id.spinnerIVA);
        ArrayAdapter adapterIVA = ArrayAdapter.createFromResource(getContext(), R.array.IVA, android.R.layout.simple_spinner_item);
        IVA.setAdapter(adapterIVA);

        MI = (Spinner) view.findViewById(R.id.spinnerMI);
        ArrayAdapter adapterMI = ArrayAdapter.createFromResource(getContext(), R.array.MI, android.R.layout.simple_spinner_item);
        MI.setAdapter(adapterMI);

        SOC = (Spinner) view.findViewById(R.id.spinnerSOC);
        ArrayAdapter adapterSOC = ArrayAdapter.createFromResource(getContext(), R.array.SOC, android.R.layout.simple_spinner_item);
        SOC.setAdapter(adapterSOC);

        ImagenButtonA = (ImageButton) view.findViewById(R.id.image_buttonA);
        ImagenButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=A.getSelectedItem().toString();
                if (selec.equals("Los Adelantamientos")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T1);
                    definicion = getString(R.string.A_T1D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Realización del adelantamiento")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T2);
                    definicion = getString(R.string.A_T2D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Prohibido adelantar")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T3);
                    definicion = getString(R.string.A_T3D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("No adelantar por falta de visibilidad")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T4);
                    definicion = getString(R.string.A_T4D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Señalización de la maniobra")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T6);
                    definicion = getString(R.string.A_T6D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Comportamiento durante el adelantamiento")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T7);
                    definicion = getString(R.string.A_T7D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Conductor del vehículo adelantado")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T8);
                    definicion = getString(R.string.A_T8D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Otros adelantamientos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T9);
                    definicion = getString(R.string.A_T9D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Adelantamiento en vías de tres carriles")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T10);
                    definicion = getString(R.string.A_T10D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Maniobras que no son adelantamientos")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.A_T5);
                    definicion = getString(R.string.A_T5D);

                    i.putExtra(IMAGEN, R.drawable.a);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonCSMA = (ImageButton) view.findViewById(R.id.image_buttonCSMA);
        ImagenButtonCSMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=CSMA.getSelectedItem().toString();
                if (selec.equals("Cambio de sentido")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CSMA_T1);
                    definicion = getString(R.string.CSMA_T1D);

                    i.putExtra(IMAGEN, R.drawable.csma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Maniobra de marcha hacia atrás")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.CSMA_T2);
                    definicion = getString(R.string.CSMA_T2D);

                    i.putExtra(IMAGEN, R.drawable.csma);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonDPE = (ImageButton) view.findViewById(R.id.image_buttonDPE);
        ImagenButtonDPE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=DPE.getSelectedItem().toString();
                if (selec.equals("La Detención")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T1);
                    definicion = getString(R.string.DPE_T1D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Detención por emergencia")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T2);
                    definicion = getString(R.string.DPE_T2D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_1);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Parada y estacionamiento")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T3);
                    definicion = getString(R.string.DPE_T3D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Maniobras de parada")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T4);
                    definicion = getString(R.string.DPE_T4D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Lugares prohibidos para parar")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T5);
                    definicion = getString(R.string.DPE_T5D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Señales de parada y estacionamiento")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T6);
                    definicion = getString(R.string.DPE_T6D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_5);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Zonas con horario limitado")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T7);
                    definicion = getString(R.string.DPE_T7D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_7);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Lugares de estacionamiento")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T8);
                    definicion = getString(R.string.DPE_T8D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Formas de estacionar")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T9);
                    definicion = getString(R.string.DPE_T9D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_3);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Apertura de puertas del vehiculo")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.DPE_T10);
                    definicion = getString(R.string.DPE_T10D);

                    i.putExtra(IMAGEN, R.drawable.dpe3_10);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonIPN = (ImageButton) view.findViewById(R.id.image_buttonIPN);
        ImagenButtonIPN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selec=IPN.getSelectedItem().toString();
                if (selec.equals("Fase de aproximación a intersección")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T1);
                    definicion = getString(R.string.IPN_T1D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Posición a ocupar en la calzada")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T2);
                    definicion = getString(R.string.IPN_T2D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Adecuación de la velocidad")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T3);
                    definicion = getString(R.string.IPN_T3D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                } else if (selec.equals("Intersecciones señalizadas")) {
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T4);
                    definicion = getString(R.string.IPN_T4D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Intersecciones sin preferencia señalizada")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T5);
                    definicion = getString(R.string.IPN_T5D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Fase de posición de entrada")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T6);
                    definicion = getString(R.string.IPN_T6D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Entrada en intersecciones sin preferencia")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T7);
                    definicion = getString(R.string.IPN_T7D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Fase de franqueo")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T8);
                    definicion = getString(R.string.IPN_T8D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Pasos a nivel, puentes móviles y túneles")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T9);
                    definicion = getString(R.string.IPN_T9D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }else if(selec.equals("Circulación por túneles y pasos inferiores")){
                    Intent i= new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IPN_T10);
                    definicion = getString(R.string.IPN_T10D);

                    i.putExtra(IMAGEN, R.drawable.ipn);
                    i.putExtra(TITULO,titulo);
                    i.putExtra(DEFINICION,definicion);
                    startActivity(i);
                }
            }

        });

        ImagenButtonIVA = (ImageButton) view.findViewById(R.id.image_buttonIVA);
        ImagenButtonIVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String selec = IVA.getSelectedItem().toString();
                if (selec.equals("Inmovilización del vehículo por agentes")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IVA_T1);
                    definicion = getString(R.string.IVA_T1D);

                    i.putExtra(IMAGEN, R.drawable.iva);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Inmovilización por causas imputables al conductor")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IVA_T2);
                    definicion = getString(R.string.IVA_T2D);

                    i.putExtra(IMAGEN, R.drawable.iva);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Inmovilización por causas imputables al vehículo")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.IVA_T3);
                    definicion = getString(R.string.IVA_T3D);

                    i.putExtra(IMAGEN, R.drawable.iva);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                }
            }
        });


        ImagenButtonMI = (ImageButton) view.findViewById(R.id.image_buttonMI);
        ImagenButtonMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String selec = MI.getSelectedItem().toString();
                if (selec.equals("Maniobras básicas de la circulación")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MI_T1);
                    definicion = getString(R.string.MI_T1D);

                    i.putExtra(IMAGEN, R.drawable.mi);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Normas generales para las maniobras")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MI_T2);
                    definicion = getString(R.string.A_T2D);

                    i.putExtra(IMAGEN, R.drawable.mi);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Incorporación a la circulación")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MI_T3);
                    definicion = getString(R.string.A_T3D);

                    i.putExtra(IMAGEN, R.drawable.mi);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Desplazamientos laterales y cambios de carril")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.MI_T4);
                    definicion = getString(R.string.MI_T4D);

                    i.putExtra(IMAGEN, R.drawable.mi);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                }
            }
        });

        ImagenButtonSOC = (ImageButton) view.findViewById(R.id.image_buttonSOC);
        ImagenButtonSOC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String selec = SOC.getSelectedItem().toString();
                if (selec.equals("Señales y órdenes de los agentes")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SOC_T1);
                    definicion = getString(R.string.SOC_T1D);

                    i.putExtra(IMAGEN, R.drawable.soc7_1);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Clases de señales y características")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SOC_T2);
                    definicion = getString(R.string.SOC_T2D);

                    i.putExtra(IMAGEN, R.drawable.soc7_1);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Señales hechas con el brazo")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SOC_T3);
                    definicion = getString(R.string.SOC_T3D);

                    i.putExtra(IMAGEN, R.drawable.soc7_3);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Señales acústicas")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SOC_T4);
                    definicion = getString(R.string.SOC_T4D);

                    i.putExtra(IMAGEN, R.drawable.soc7_4);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Otras órdenes o indicaciones")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SOC_T5);
                    definicion = getString(R.string.SOC_T5D);

                    i.putExtra(IMAGEN, R.drawable.soc7_5);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                } else if (selec.equals("Dispositivos retrorreflectantes")) {
                    Intent i = new Intent(getContext(), Plantilla.class);
                    titulo = getString(R.string.SOC_T6);
                    definicion = getString(R.string.SOC_T6D);

                    i.putExtra(IMAGEN, R.drawable.soc7_6);
                    i.putExtra(TITULO, titulo);
                    i.putExtra(DEFINICION, definicion);
                    startActivity(i);
                }
            }
        });

    }
}
