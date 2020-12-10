package com.ivarrace.patterns.structural.facade.examples.engine;

import org.apache.log4j.Logger;

/**
 * Con este patrón se pretende encapsular la complejidad de un subsistema sobre una interfaz más simple.
 */
public class MainFacade {

    private static final Logger LOGGER = Logger.getLogger(MainFacade.class);

    /**
     * Para este ejemplo se toma como base el comportamiento de un motor de combustión, simplificando el arranque y la parada
     * sobre una clase Facade, que se encargará de llamar a todos los procesos necesarios para que se complete esta tarea.
     */
    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        LOGGER.info("------------------------------");
        LOGGER.info("Arrancamos el motor:");
        LOGGER.info("------------------------------");
        carEngineFacade.startEngine();

        LOGGER.info("-------------------------------");
        LOGGER.info("Paramos el motor:");
        LOGGER.info("-------------------------------");
        carEngineFacade.stopEngine();
    }
}
