package com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox;

import org.apache.log4j.Logger;

/**
 * Esta clase define los checkbox Unix
 */
public class UnixCheckbox implements Checkbox {

    private static final Logger LOGGER = Logger.getLogger(UnixCheckbox.class);

    @Override
    public void paint() {
        LOGGER.info("Se crea un nuevo checkbox con estilo Unix");
    }
}
