package com.ivarrace.patterns.creational.prototype.examples.shape.model;

import java.util.HashMap;

/**
 * En esta clase se almacenarán todos los objetos (prototipos) que queramos clonar posteriormente.
 */
public class ShapeCache {

    /**
     * Se define un {@link java.util.HashMap} de forma estatica para
     * almacenar y objetener los objetos {@link Shape}
     * <code>shapeMap</code> no está sincronizado entre distintos Threads.
     */
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    private ShapeCache() {
        throw new AssertionError("Disabled constructor");
    }

    /**
     * Cuando obtengamos un objeto almacenado, buscará en
     * {@link ShapeCache#shapeMap} por la
     * clave indicada en el parámetro, y devolverá una copia del mismo
     *
     * @param shapeId <code>shapeMap</code> key
     * @return Objeto clonado
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * Inicializamos {@link ShapeCache#shapeMap}
     * con datos de prueba (subclases de {@link Shape})
     */
    public static void loadTestCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
