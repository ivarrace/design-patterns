package com.ivarrace.patterns.creational.prototype.examples.shape.model;

import org.apache.log4j.Logger;

/**
 * Clase derivada del prototipo {@link Shape}
 */
public class Rectangle extends Shape {

    private static final Logger LOGGER = Logger.getLogger(Rectangle.class);

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        LOGGER.info("Inside Rectangle::draw() method.");
    }
}