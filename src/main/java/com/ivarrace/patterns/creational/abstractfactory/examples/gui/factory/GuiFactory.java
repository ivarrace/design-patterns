package com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory;

import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.Button;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.Checkbox;

/**
 * Interfaz para la factoria abstracta, que conoce todos los tipos abstractos de objetos que tenemos
 */
public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
