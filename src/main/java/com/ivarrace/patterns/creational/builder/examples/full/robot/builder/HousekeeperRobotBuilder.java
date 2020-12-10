package com.ivarrace.patterns.creational.builder.examples.full.robot.builder;

import com.ivarrace.patterns.creational.builder.examples.full.robot.model.Robot;

public class HousekeeperRobotBuilder implements RobotBuilder {

    private Robot robot;

    public HousekeeperRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void definePurpose() {
        robot.setPurpose("Limpiar");
    }

    @Override
    public void setArms() {
        robot.setArmsNumber(0);
    }

    @Override
    public void isAgressive() {
        robot.setAgressive(Boolean.FALSE);
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
