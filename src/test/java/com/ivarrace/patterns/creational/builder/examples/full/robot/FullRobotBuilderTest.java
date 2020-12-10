package com.ivarrace.patterns.creational.builder.examples.full.robot;

import com.ivarrace.patterns.creational.builder.examples.full.robot.builder.DirectorBuilder;
import com.ivarrace.patterns.creational.builder.examples.full.robot.builder.RobotBuilder;
import com.ivarrace.patterns.creational.builder.examples.full.robot.builder.HousekeeperRobotBuilder;
import com.ivarrace.patterns.creational.builder.examples.full.robot.model.Robot;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullRobotBuilderTest {

    @Test
    public void builderTest(){
        RobotBuilder housekeeper = new HousekeeperRobotBuilder();
        DirectorBuilder director = new DirectorBuilder(housekeeper);
        Robot robot2 = director.buildRobot();
        assertNotNull("getSerialNumber", robot2.getSerialNumber());
        assertEquals("getPurpose", "Limpiar", robot2.getPurpose());
        assertEquals("getArmsNumber", 0, robot2.getArmsNumber());
        assertTrue("isAgressive", !robot2.isAgressive());
    }
}
