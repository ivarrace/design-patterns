package com.ivarrace.patterns.creational.singleton.examples.lazy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonLazyTest {

    @Test
    public void testSingletonEagerInstances(){
        SingletonLazyClass lazyInstance1 = SingletonLazyClass.getInstance();
        SingletonLazyClass LazyInstance2 = SingletonLazyClass.getInstance();
        assertEquals("Diferentes instancias, mismo objeto", lazyInstance1.hashCode(), LazyInstance2.hashCode());
    }
}