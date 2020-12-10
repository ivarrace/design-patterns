package com.ivarrace.patterns.structural.adapter.examples.medidas;

import com.ivarrace.patterns.structural.adapter.examples.medidas.model.TornilloImperial;
import com.ivarrace.patterns.structural.adapter.examples.medidas.model.TornilloMetrica;
import org.apache.log4j.Logger;

/**
 * Tenemos un sistema que trabaja con tornillos que tienen el diametro en centimetros, y necesitamos
 * utilizar "algo" externo que no devuelve tornillos en pulgadas.
 * Para poder trabajar con los tornillosImperiales (pulgadas) necesitamos un adaptador que ajuste sus
 * parámetrosy y sean comparables con nuestros tornillos.
 */
public class MainAdapter {

    private static final Logger LOGGER = Logger.getLogger(MainAdapter.class);

    public static void main(String[] args) {
        TornilloMetrica tornilloMetrica = new TornilloMetrica();
        tornilloMetrica.setDiametro(2.54f);
        TornilloImperial tornilloImperial = new TornilloImperial();
        tornilloImperial.setDiametro(1f);

        //Para poder trabajar con los dos objetos, utilizamos el adapter
        TornilloImperialAdapter tornilloImperialAdapter = new TornilloImperialAdapter(tornilloImperial);
        LOGGER.info("Diametro tornillo METRICA: " + tornilloMetrica.getDiametro() + " cm.");
        LOGGER.info("Diametro tornillo IMPERIAL: " + tornilloImperial.getDiametro() + " pulgadas.");
        LOGGER.info("Diametro adaptado tornillo IMPERIAL: " + tornilloImperialAdapter.getDiametro() + " cm.");
    }

}

