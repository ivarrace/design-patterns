package com.ivarrace.patterns.structural.facade.examples.engine.components;

import org.apache.log4j.Logger;

/**
 * Clase de ejemplo, con métodos de ejemplo
 */
public class AirFlowController {
    private static final Logger LOGGER = Logger.getLogger(AirFlowController.class);

    public void takeAir() {
        LOGGER.info("TAKE AIR");
    }

    public void off() {
        LOGGER.info("OFF");
    }
}
