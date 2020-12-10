package com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox;

import org.apache.log4j.Logger;

/**
 * Esta clase define los checkbox Windows
 */
public class WindowsCheckbox implements Checkbox {

    private static final Logger LOGGER = Logger.getLogger(WindowsCheckbox.class);

    @Override
    public void paint() {
        LOGGER.info("Se crea un nuevo checkbox con estilo Windows");
    }
}
