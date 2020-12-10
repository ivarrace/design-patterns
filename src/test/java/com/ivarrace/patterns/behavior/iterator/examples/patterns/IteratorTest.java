package com.ivarrace.patterns.behavior.iterator.examples.patterns;

import com.ivarrace.patterns.behavior.iterator.examples.patterns.model.DesignPattern;
import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void testPatternIterator() throws Exception {
        DesignPattern pattern1 = new DesignPattern("Creational", "Factory Method");
        DesignPattern pattern2 = new DesignPattern("Creational", "Abstract Factory");
        DesignPattern pattern3 = new DesignPattern("Structural", "Adapter");
        DesignPattern pattern4 = new DesignPattern("Structural", "Bridge");
        DesignPattern pattern5 = new DesignPattern("Behavioral", "Chain of Responsibility");
        DesignPattern pattern6 = new DesignPattern("Behavioral", "Iterator");

        PatternAggregate patternAggregate = new PatternAggregateImpl();
        patternAggregate.addPattern(pattern1);
        patternAggregate.addPattern(pattern2);
        patternAggregate.addPattern(pattern3);
        patternAggregate.addPattern(pattern4);
        patternAggregate.addPattern(pattern5);
        patternAggregate.addPattern(pattern6);

        // Verificamos una iteracion completa en el conjunto
        PatternIterator patternIterator = patternAggregate.getPatternIterator();
        Assert.assertEquals("El siguiente patron que obtendra es el 1", patternIterator.nextPattern(), pattern1);
        Assert.assertEquals("El siguiente patron que obtendra es el 2", patternIterator.nextPattern(), pattern2);
        Assert.assertEquals("El siguiente patron que obtendra es el 3", patternIterator.nextPattern(), pattern3);
        Assert.assertEquals("El siguiente patron que obtendra es el 4", patternIterator.nextPattern(), pattern4);
        Assert.assertEquals("El siguiente patron que obtendra es el 5", patternIterator.nextPattern(), pattern5);
        Assert.assertEquals("El siguiente patron que obtendra es el 6", patternIterator.nextPattern(), pattern6);
        Assert.assertTrue("No hay mas elementos en el conjunto", patternIterator.isLastPattern());

        // Eliminamos elementos
        patternAggregate.removePattern(pattern1);
        patternAggregate.removePattern(pattern3);
        patternAggregate.removePattern(pattern5);

        // Verificamos una iteracion completa en el conjunto
        PatternIterator patternIterator2 = patternAggregate.getPatternIterator();
        Assert.assertEquals("El siguiente patron que obtendra es el 2", patternIterator2.nextPattern(), pattern2);
        Assert.assertEquals("El siguiente patron que obtendra es el 4", patternIterator2.nextPattern(), pattern4);
        Assert.assertEquals("El siguiente patron que obtendra es el 5", patternIterator2.nextPattern(), pattern6);
        Assert.assertTrue("No hay mas elementos en el conjunto", patternIterator2.isLastPattern());
    }
}