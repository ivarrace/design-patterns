package com.ivarrace.patterns.creational.singleton.examples.eager;

import org.apache.log4j.Logger;

/**
 * El patrón Singleton permite restringir la creación de objetos pertenecientes a una clase o el valor de un
 * tipo a un único objeto.
 *
 * Su intención consiste en garantizar que una clase solo tenga una instancia y proporcionar un punto de acceso
 * global a ella.
 */
public class MainSingletonEager {

    private static final Logger LOGGER = Logger.getLogger(MainSingletonEager.class);

    public static void main(String[] args) {

        //Probamos SingletonEagerClass
        SingletonEagerClass eagerInstance1 = SingletonEagerClass.getInstance();
        SingletonEagerClass eagerInstance2 = SingletonEagerClass.getInstance();
        //Comparamos las instancias
        LOGGER.info("SingletonEager: ");
        LOGGER.info("SingletonEagerInstance1 hashCode: "+ eagerInstance1.hashCode());
        LOGGER.info("SingletonEagerInstance2 hashCode: "+ eagerInstance2.hashCode());

    }

}
