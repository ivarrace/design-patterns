package com.ivarrace.patterns.behavior.iterator.examples.patterns;

import com.ivarrace.patterns.behavior.iterator.examples.patterns.model.DesignPattern;

/**
 * Agregado (Aggregate) define la interfaz para el método de fabricación de iteradores.
 */
public interface PatternAggregate {

    void addPattern(DesignPattern designPattern);
    void removePattern(DesignPattern designPattern);
    PatternIterator getPatternIterator();

}