package com.ivarrace.patterns.creational.builder.examples.full.robot.builder;

import com.ivarrace.patterns.creational.builder.examples.full.robot.model.Robot;

public interface RobotBuilder {

    void definePurpose();
    void setArms();
    void isAgressive();
    Robot getRobot();
}
