package com.ivarrace.patterns.creational.prototype.examples.shape.model;

import org.apache.log4j.Logger;

/**
 * Clase derivada del prototipo {@link Shape}
 */
public class Circle extends Shape {

    private static final Logger LOGGER = Logger.getLogger(Circle.class);

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        LOGGER.info("Inside Circle::draw() method.");
    }
}
