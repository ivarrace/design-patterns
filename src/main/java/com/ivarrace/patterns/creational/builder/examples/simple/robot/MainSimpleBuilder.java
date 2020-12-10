package com.ivarrace.patterns.creational.builder.examples.simple.robot;

import com.ivarrace.patterns.creational.builder.examples.simple.robot.model.Robot;
import org.apache.log4j.Logger;

public class MainSimpleBuilder {

    private static final Logger LOGGER = Logger.getLogger(MainSimpleBuilder.class);

    public static void main(String[] args) {
        LOGGER.info("Iniciando el proceso de creación de un nuevo Robot");
        Robot prototipo0 = new Robot.Builder(000000L).build();
        LOGGER.info("prototipo0: "+prototipo0.toString());
        Robot prototipo1 = new Robot.Builder(000001L).withPurpose("Limpiar").build();
        LOGGER.info("prototipo1: "+prototipo1.toString());
        Robot prototipo2 = new Robot.Builder(000002L).withPurpose("Proteger").withArms(4).agressive().build();
        LOGGER.info("prototipo2: "+prototipo2.toString());
    }
}
