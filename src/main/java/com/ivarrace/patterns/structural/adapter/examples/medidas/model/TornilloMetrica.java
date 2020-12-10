package com.ivarrace.patterns.structural.adapter.examples.medidas.model;

/**
 * El tornillos simula un objeto de nuestro sistema, que tendrá que trabajar en conjunto con el otro (libreria externa)
 */
public class TornilloMetrica {

    private float diametro; //En centimetros

    public float getDiametro() {
        return this.diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
}
