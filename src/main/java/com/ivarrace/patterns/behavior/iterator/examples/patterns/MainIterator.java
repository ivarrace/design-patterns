package com.ivarrace.patterns.behavior.iterator.examples.patterns;

import com.ivarrace.patterns.behavior.iterator.examples.patterns.model.DesignPattern;
import org.apache.log4j.Logger;

/**
 * Este patrón de diseño permite recorrer una estructura de datos sin que sea necesario conocer la estructura interna de la misma.
 */
public class MainIterator {

    private static final Logger LOGGER = Logger.getLogger(MainIterator.class);

    //Objetos utilizados para las pruebas
    private static DesignPattern pattern1 = new DesignPattern("Creational", "Factory Method");
    private static DesignPattern pattern2 = new DesignPattern("Creational", "Abstract Factory");
    private static DesignPattern pattern3 = new DesignPattern("Structural", "Adapter");
    private static DesignPattern pattern4 = new DesignPattern("Structural", "Bridge");
    private static DesignPattern pattern5 = new DesignPattern("Behavioral", "Chain of Responsibility");
    private static DesignPattern pattern6 = new DesignPattern("Behavioral", "Iterator");

    public static void main(String[] args) {
        //Definimos el conjunto de objetos con datos de prueba
        PatternAggregate patternAggregate = new PatternAggregateImpl();
        patternAggregate.addPattern(pattern1);
        patternAggregate.addPattern(pattern2);
        patternAggregate.addPattern(pattern3);
        patternAggregate.addPattern(pattern4);
        patternAggregate.addPattern(pattern5);
        patternAggregate.addPattern(pattern6);

        //Mostramos los objetos del conjunto, utilizando el iterador
        PatternIterator patternIterator= patternAggregate.getPatternIterator();
        LOGGER.info("------ Aggregate content ------");
        while(!patternIterator.isLastPattern()){
            DesignPattern designPattern=patternIterator.nextPattern();
            LOGGER.info(designPattern.getPatternType() + " : " + designPattern.getPatternName());
        }

        LOGGER.info("------ Update content ------");
        //Eliminamos un elemento
        patternAggregate.removePattern(pattern3);
        patternAggregate.removePattern(pattern5);

        //Mostramos los objetos del conjunto, utilizando el iterador, y vemos que ya no contienen los eliminados
        patternIterator= patternAggregate.getPatternIterator();
        LOGGER.info("------ Aggregate content ------");
        while(!patternIterator.isLastPattern()){
            DesignPattern designPattern=patternIterator.nextPattern();
            LOGGER.info(designPattern.getPatternType() + " : " + designPattern.getPatternName());
        }
    }

}
