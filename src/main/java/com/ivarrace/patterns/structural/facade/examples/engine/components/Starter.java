package com.ivarrace.patterns.structural.facade.examples.engine.components;

import org.apache.log4j.Logger;

/**
 * Clase de ejemplo, con métodos de ejemplo
 */
public class Starter {
    private static final Logger LOGGER = Logger.getLogger(Starter.class);

    public void start() {
        LOGGER.info("START");
    }
}
