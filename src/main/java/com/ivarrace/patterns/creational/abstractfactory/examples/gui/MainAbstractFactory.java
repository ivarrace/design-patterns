package com.ivarrace.patterns.creational.abstractfactory.examples.gui;

import com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory.UnixFactory;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory.WindowsFactory;
import org.apache.log4j.Logger;

/**
 * Main para probar la factoria abstracta
 */
public class MainAbstractFactory {

    private static final Logger LOGGER = Logger.getLogger(MainAbstractFactory.class);

    public static void main(String[] args) {
        //Test GUI Windows
        LOGGER.info("----- Windows GUI -----");
        ApplicationGui appWindowa = new ApplicationGui(new WindowsFactory());
        appWindowa.paint();
        //Test GUI Unix
        LOGGER.info("----- Unix GUI -----");
        ApplicationGui appUnix = new ApplicationGui(new UnixFactory());
        appUnix.paint();
    }
}
