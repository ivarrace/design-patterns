package com.ivarrace.patterns.structural.adapter.examples.medidas;

import com.ivarrace.patterns.structural.adapter.examples.medidas.model.TornilloImperial;
import com.ivarrace.patterns.structural.adapter.examples.medidas.model.TornilloMetrica;

/**
 * Esta clase permitirá utilizar las tornillos imperiales externas con nuestros tornillos,
 * sobreescribiendo los metodos para adaptar las diferencias.
 * <p>
 * Extiende al objeto de nuestro sistema, y como parametro en el constructor llega el objeto externo
 */
public class TornilloImperialAdapter extends TornilloMetrica {

    private static final float PULGADA_A_CM = 2.54f;
    private TornilloImperial tornilloImperial;

    public TornilloImperialAdapter(TornilloImperial tornilloImperial) {
        this.tornilloImperial = tornilloImperial;
    }

    /**
     * Actualiza el método para que pueda ser utilizado por nuestro sistema
     *
     * @return
     */
    @Override
    public float getDiametro() {
        return this.tornilloImperial.getDiametro() * PULGADA_A_CM;
    }

}
