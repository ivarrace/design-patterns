package com.ivarrace.patterns.creational.abstractfactory.examples.gui;

import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.UnixButton;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.WindowsButton;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.UnixCheckbox;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.WindowsCheckbox;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory.UnixFactory;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory.WindowsFactory;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class ApplicationGuiTest {

    @Test
    public void paint_windows() throws IllegalAccessException {
        ApplicationGui windowsGui = new ApplicationGui(new WindowsFactory());
        //Reflexion para validar variables privadas
        Class<?> windowsGuiClass = windowsGui.getClass();
        Field fields[] = windowsGuiClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            // Validamos los campos
            switch (field.getName()) {
                case "button":
                    assertTrue(field.get(windowsGui) instanceof WindowsButton);
                    break;
                case "checkbox":
                    assertTrue(field.get(windowsGui) instanceof WindowsCheckbox);
                    break;
                default:
                    fail("Variable no esperada");
            }
        }
    }

    @Test
    public void paint_unix() throws IllegalAccessException {
        ApplicationGui unixGui = new ApplicationGui(new UnixFactory());
        //Reflexion para validar variables privadas
        Class<?> windowsGuiClass = unixGui.getClass();
        Field fields[] = windowsGuiClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            // Validamos los campos
            switch (field.getName()) {
                case "button":
                    assertTrue(field.get(unixGui) instanceof UnixButton);
                    break;
                case "checkbox":
                    assertTrue(field.get(unixGui) instanceof UnixCheckbox);
                    break;
                default:
                    fail("Variable no esperada");
            }
        }
    }
}