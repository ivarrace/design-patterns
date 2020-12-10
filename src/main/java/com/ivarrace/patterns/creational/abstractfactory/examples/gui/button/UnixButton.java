package com.ivarrace.patterns.creational.abstractfactory.examples.gui.button;

import org.apache.log4j.Logger;

/**
 * Esta clase define los botones Unix
 */
public class UnixButton implements Button {

    private static final Logger LOGGER = Logger.getLogger(UnixButton.class);

    @Override
    public void paint() {
        LOGGER.info("Se crea un nuevo boton con estilo Unix");
    }
}
