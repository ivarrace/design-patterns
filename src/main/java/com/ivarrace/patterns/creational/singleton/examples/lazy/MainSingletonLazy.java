package com.ivarrace.patterns.creational.singleton.examples.lazy;

import org.apache.log4j.Logger;

/**
 * El patrón Singleton permite restringir la creación de objetos pertenecientes a una clase o el valor de un
 * tipo a un único objeto.
 *
 * Su intención consiste en garantizar que una clase solo tenga una instancia y proporcionar un punto de acceso
 * global a ella.
 */
public class MainSingletonLazy {

    private static final Logger LOGGER = Logger.getLogger(MainSingletonLazy.class);

    public static void main(String[] args) {
        //Probamos SingletonLazyClass
        SingletonLazyClass lazyInstance1 = SingletonLazyClass.getInstance();
        SingletonLazyClass lazyInstance2 = SingletonLazyClass.getInstance();
        //Comparamos las instancias
        LOGGER.info("SingletonLazy: ");
        LOGGER.info("SingletonLazyInstance1 hashCode: "+ lazyInstance1.hashCode());
        LOGGER.info("SingletonLazyInstance2 hashCode: "+ lazyInstance2.hashCode());
    }

}
