package com.ivarrace.patterns.creational.builder.examples.full.robot;

import com.ivarrace.patterns.creational.builder.examples.full.robot.builder.DirectorBuilder;
import com.ivarrace.patterns.creational.builder.examples.full.robot.builder.RobotBuilder;
import com.ivarrace.patterns.creational.builder.examples.full.robot.builder.HousekeeperRobotBuilder;
import com.ivarrace.patterns.creational.builder.examples.full.robot.builder.MilitarRobotBuilder;
import com.ivarrace.patterns.creational.builder.examples.full.robot.model.Robot;
import org.apache.log4j.Logger;

public class MainRobotBuilder {

    private static final Logger LOGGER = Logger.getLogger(MainRobotBuilder.class);

    public static void main(String[] args) {
        LOGGER.info("Iniciando el proceso de creación de un nuevo Robot");
        RobotBuilder housekeeper = new HousekeeperRobotBuilder();
        DirectorBuilder director = new DirectorBuilder(housekeeper);
        Robot prototipo3 = director.buildRobot();
        LOGGER.info("prototipo3: " + prototipo3.toString());
        RobotBuilder militar = new MilitarRobotBuilder();
        director = new DirectorBuilder(militar);
        Robot prototipo4 = director.buildRobot();
        LOGGER.info("prototipo4: " + prototipo4.toString());
    }
}
