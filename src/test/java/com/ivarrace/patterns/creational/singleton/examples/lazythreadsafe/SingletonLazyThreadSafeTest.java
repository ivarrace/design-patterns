package com.ivarrace.patterns.creational.singleton.examples.lazythreadsafe;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class SingletonLazyThreadSafeTest {

    @Test
    public void testSingletonEagerInstances() throws ExecutionException, InterruptedException {
        //Definimos el ejecutor
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //Ejecutamos las tareas
        Future expectedInstance1 = executorService.submit(SingletonLazyThreadSafeClass::getInstance);
        Future expectedInstance2 = executorService.submit(SingletonLazyThreadSafeClass::getInstance);
        //Validamos
        SingletonLazyThreadSafeClass lazyInstance1 = (SingletonLazyThreadSafeClass) expectedInstance1.get();
        SingletonLazyThreadSafeClass LazyInstance2 = (SingletonLazyThreadSafeClass) expectedInstance2.get();
        assertEquals("Diferentes instancias, mismo objeto", lazyInstance1.hashCode(), LazyInstance2.hashCode());
    }
}