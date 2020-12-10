package com.ivarrace.patterns.behavior.iterator.examples.patterns.model;

/**
 * Ejemplo de una clase principal, sobre la qu equeremos utilizar el patron iterator
 */
public class DesignPattern {

    private String patternType;
    private String patternName;

    public DesignPattern(String patternType, String patternName){
        this.patternType=patternType;
        this.patternName=patternName;
    }

    public String getPatternType() {
        return patternType;
    }

    public String getPatternName() {
        return patternName;
    }
}
