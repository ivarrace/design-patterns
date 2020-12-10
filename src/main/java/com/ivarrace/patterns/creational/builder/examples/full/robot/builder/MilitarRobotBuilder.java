package com.ivarrace.patterns.creational.builder.examples.full.robot.builder;

import com.ivarrace.patterns.creational.builder.examples.full.robot.model.Robot;

public class MilitarRobotBuilder implements RobotBuilder {

    private Robot robot;

    public MilitarRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void definePurpose() {
        robot.setPurpose("Defender");
    }

    @Override
    public void setArms() {
        robot.setArmsNumber(4);
    }

    @Override
    public void isAgressive() {
        robot.setAgressive(Boolean.TRUE);
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
