package com.ivarrace.patterns.creational.abstractfactory.examples.gui;

import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.Button;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.Checkbox;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory.GuiFactory;

/**
 * La clase principal utiliza las interfaces para abstraerse de la implementación que se utilizará
 */
public class ApplicationGui {
    private Button button;
    private Checkbox checkbox;

    public ApplicationGui(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
