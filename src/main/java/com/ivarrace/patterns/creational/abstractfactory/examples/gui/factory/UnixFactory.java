package com.ivarrace.patterns.creational.abstractfactory.examples.gui.factory;

import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.Button;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.button.UnixButton;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.Checkbox;
import com.ivarrace.patterns.creational.abstractfactory.examples.gui.checkbox.UnixCheckbox;

/**
 * Define el comportamiento de los metodos definidos en su interfaz para la familia Unix
 */
public class UnixFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new UnixCheckbox();
    }
}
