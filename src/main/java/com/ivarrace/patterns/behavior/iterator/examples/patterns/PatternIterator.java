package com.ivarrace.patterns.behavior.iterator.examples.patterns;

import com.ivarrace.patterns.behavior.iterator.examples.patterns.model.DesignPattern;

/**
 * Iterador (Iterator) define la interfaz para recorrer el agregado de elementos y acceder a ellos, de manera que el
 * cliente no tenga que conocer los detalles y sea capaz de manejarlos de todos modos.
 *
 * Los métodos más comunes son: Primero(), Siguiente(), HayMas() y ElementoActual().
 */
public interface PatternIterator {

    DesignPattern nextPattern();
    boolean isLastPattern();

}