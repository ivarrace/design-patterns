package com.ivarrace.patterns.structural.facade.examples.engine;

import com.ivarrace.patterns.structural.facade.examples.engine.components.AirFlowController;
import com.ivarrace.patterns.structural.facade.examples.engine.components.CoolingController;
import com.ivarrace.patterns.structural.facade.examples.engine.components.FuelInjector;
import com.ivarrace.patterns.structural.facade.examples.engine.components.Starter;

/**
 * La clase Facade define los métodos que se utilizaran para simplificar los flujos, abstrayendo al que lo usa de como funciona.
 */
public class CarEngineFacade {

    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();

    /**
     * Método que simplifica el arrancado del coche
     */
    public void startEngine() {
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.inject();
        starter.start();
        coolingController.run();
    }

    /**
     * Método que simplifica la parada del coche
     */
    public void stopEngine() {
        fuelInjector.off();
        coolingController.stop();
        airFlowController.off();
    }

}
