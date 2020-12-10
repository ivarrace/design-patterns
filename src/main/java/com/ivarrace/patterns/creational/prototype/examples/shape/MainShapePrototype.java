package com.ivarrace.patterns.creational.prototype.examples.shape;

import com.ivarrace.patterns.creational.prototype.examples.shape.model.Shape;
import com.ivarrace.patterns.creational.prototype.examples.shape.model.ShapeCache;
import org.apache.log4j.Logger;

/**
 * El patrón de diseño prototipo tiene como finalidad crear nuevos objetos clonando una instancia creada previamente.
 * Este patrón especifica la clase de objetos a crear mediante la clonación de un prototipo que es una instancia ya
 * creada. La clase de los objetos que servirán de prototipo deberá incluir en su interfaz la manera de solicitar una
 * copia, que será desarrollada luego por las clases concretas de prototipos.
 */
public class MainShapePrototype {

    private static final Logger LOGGER = Logger.getLogger(MainShapePrototype.class);

    public static void main(String[] args) {
        //Cargamos datos de prueba en el almacén
        ShapeCache.loadTestCache();

        //Obtenemos los clones
        Shape clonedShape1 = ShapeCache.getShape("1");
        LOGGER.info("clonedShape1 : " + clonedShape1.getType());
        Shape clonedShape2 = ShapeCache.getShape("2");
        LOGGER.info("clonedShape2 : " + clonedShape2.getType());
        Shape clonedShape3 = ShapeCache.getShape("3");
        LOGGER.info("clonedShape3 : " + clonedShape3.getType());

        //Comprobamos
        LOGGER.info("Generamos otro objeto de tipo 3, para compararlo con el anterior:");
        Shape clonedShape3bis = ShapeCache.getShape("3");
        LOGGER.info("clonedShape3bis : " + clonedShape3bis.getType());
        if (clonedShape3 != clonedShape3bis) {
            LOGGER.info("[OK] Son objetos diferentes");
            if (clonedShape3.equals(clonedShape3bis)) {
                LOGGER.info("[OK] Son objetos idénticos");
            } else {
                LOGGER.error("[ERROR] No son objetos idénticos");
            }
        } else {
            LOGGER.error("[ERROR] Son el mismo objeto");
        }
    }

}
