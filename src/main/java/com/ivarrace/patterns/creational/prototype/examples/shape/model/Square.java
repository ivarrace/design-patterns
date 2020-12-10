package com.ivarrace.patterns.creational.prototype.examples.shape.model;

import org.apache.log4j.Logger;

/**
 * Clase derivada del prototipo {@link Shape}
 */
public class Square extends Shape {

    private static final Logger LOGGER = Logger.getLogger(Square.class);

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        LOGGER.info("Inside Square::draw() method.");
    }
}