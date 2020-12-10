package com.ivarrace.patterns.behavior.iterator.examples.patterns;

import com.ivarrace.patterns.behavior.iterator.examples.patterns.model.DesignPattern;

import java.util.List;

/**
 * Iterador Concreto (ConcreteIterator) implementa la interfaz propuesta por el Iterador. Es el que se encarga de
 * mantener la posición actual en el recorrido de la estructura.
 *
 * Un iterador concreto es el encargado de guardar la posición actual dentro de la estructura de datos, interactuando
 * con esta para calcular el siguiente elemento del recorrido.
 */
public class PatternIteratorImpl implements PatternIterator {

    //Conjunto de objetos sobre los que iterar
    private List patternList;

    //El iterador es el encargado de guardar la posición en la estructura
    private int position;

    public PatternIteratorImpl(List patternList) {
        this.patternList = patternList;
    }

    @Override
    public DesignPattern nextPattern() {
        DesignPattern designPattern = (DesignPattern) patternList.get(position);
        position++;
        return designPattern;
    }

    @Override
    public boolean isLastPattern() {
        return (position >= patternList.size());
    }

}