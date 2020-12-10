package com.ivarrace.patterns.creational.builder.examples.simple.robot;

import com.ivarrace.patterns.creational.builder.examples.simple.robot.model.Robot;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleRobotBuilderTest {

    @Test
    public void builderTest(){
        //Ejemplo 1
        Robot robot = new Robot.Builder(0L).withPurpose("test").withArms(2).agressive().build();
        assertEquals("getSerialNumber", 0L, robot.getSerialNumber());
        assertEquals("getPurpose", "test", robot.getPurpose());
        assertEquals("getArmsNumber", 2, robot.getArmsNumber());
        assertTrue("isAgressive", robot.isAgressive());
    }
}
