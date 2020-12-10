package com.ivarrace.patterns.structural.facade.examples.engine.components;

import org.apache.log4j.Logger;

/**
 * Clase de ejemplo, con métodos de ejemplo
 */
public class FuelInjector {
    private static final Logger LOGGER = Logger.getLogger(FuelInjector.class);

    public void on() {
        LOGGER.info("ON");
    }

    public void inject() {
        LOGGER.info("INJECT");
    }

    public void off() {
        LOGGER.info("OFF");
    }
}
