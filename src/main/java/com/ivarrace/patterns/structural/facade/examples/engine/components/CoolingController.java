package com.ivarrace.patterns.structural.facade.examples.engine.components;

import org.apache.log4j.Logger;

/**
 * Clase de ejemplo, con métodos de ejemplo
 */
public class CoolingController {
    private static final Logger LOGGER = Logger.getLogger(CoolingController.class);

    public void run() {
        LOGGER.info("RUN");
    }

    public void stop() {
        LOGGER.info("STOP");
    }
}
