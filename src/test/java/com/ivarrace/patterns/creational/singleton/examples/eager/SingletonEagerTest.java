package com.ivarrace.patterns.creational.singleton.examples.eager;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonEagerTest {

    @Test
    public void testSingletonEagerInstances(){
        SingletonEagerClass eagerInstance1 = SingletonEagerClass.getInstance();
        SingletonEagerClass eagerInstance2 = SingletonEagerClass.getInstance();
        assertEquals("Diferentes instancias, mismo objeto", eagerInstance1.hashCode(), eagerInstance2.hashCode());
    }

}