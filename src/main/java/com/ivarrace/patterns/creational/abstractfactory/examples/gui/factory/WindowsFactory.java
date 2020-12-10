package com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory;

import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.Button;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.WindowsButton;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.Checkbox;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.WindowsCheckbox;

/**
 * Define el comportamiento de los metodos definidos en su interfaz para la familia Windows
 */
public class WindowsFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
