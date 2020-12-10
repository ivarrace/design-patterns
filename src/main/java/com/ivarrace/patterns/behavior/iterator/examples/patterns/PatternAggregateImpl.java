package com.ivarrace.patterns.behavior.iterator.examples.patterns;

import com.ivarrace.patterns.behavior.iterator.examples.patterns.model.DesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Agregado Concreto (ConcreteAggregate) implementa la estructura de datos y el método de fabricación de iteradores
 * que crea un iterador específico para su estructura.
 */
public class PatternAggregateImpl implements PatternAggregate {
    List patternList;

    public PatternAggregateImpl() {
        patternList = new ArrayList();
    }

    @Override
    public void addPattern(DesignPattern designPattern) {
        patternList.add(designPattern);
    }

    @Override
    public void removePattern(DesignPattern designPattern) {
        patternList.remove(designPattern);
    }

    @Override
    public PatternIterator getPatternIterator() {
        return new PatternIteratorImpl(patternList);
    }
}