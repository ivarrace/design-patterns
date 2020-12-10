package com.ivarrace.patterns.creational.prototype.examples.shape;

import com.ivarrace.patterns.creational.prototype.examples.shape.model.Shape;
import com.ivarrace.patterns.creational.prototype.examples.shape.model.ShapeCache;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeShapeTest {

    @Before
    public void init() {
        ShapeCache.loadTestCache();
    }

    @Test
    public void testPrototype() {
        Shape clonedShape1 = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("2");
        Shape clonedShape3 = ShapeCache.getShape("3");
        Shape clonedShape3bis = ShapeCache.getShape("3");

        assertTrue("clonedShape1 y clonedShape2 son distintos objetos", clonedShape1 != clonedShape2);
        assertTrue("clonedShape2 y clonedShape3 son distintos objetos", clonedShape2 != clonedShape3);
        assertTrue("clonedShape1 y clonedShape3 son distintos objetos", clonedShape1 != clonedShape3);
        assertTrue("clonedShape3 y clonedShape3bis son distintos objetos", clonedShape3 != clonedShape3bis);
        assertTrue("clonedShape3 y clonedShape3bis son identicos", clonedShape3.equals(clonedShape3bis));
        clonedShape3bis.setId("CHANGED");
        assertTrue("clonedShape3 y clonedShape3bis ya no son identicos", !clonedShape3.equals(clonedShape3bis));
    }
}