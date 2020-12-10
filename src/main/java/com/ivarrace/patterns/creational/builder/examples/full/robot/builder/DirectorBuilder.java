package com.ivarrace.patterns.creational.builder.examples.full.robot.builder;

import com.ivarrace.patterns.creational.builder.examples.full.robot.model.Robot;

public class DirectorBuilder {
    private RobotBuilder robotBuilder;

    public DirectorBuilder(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot buildRobot() {
        this.robotBuilder.definePurpose();
        this.robotBuilder.setArms();
        this.robotBuilder.isAgressive();
        return this.robotBuilder.getRobot();
    }
}
