package com.ivarrace.patterns.structural.adapter.examples.medidas.model;

/**
 * Tornillo con medida imperial, en pulgadas, simularia una libreria externa
 * que tenemos que adaptar para nuestro sistema (metrico, en centimetros)
 */
public class TornilloImperial {

    private float diametro; //En puladas

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getDiametro() {
        return this.diametro;
    }
}
