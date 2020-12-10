package com.ivarrace.patterns.creational.singleton.examples.lazythreadsafe;

import com.ivarrace.patterns.creational.singleton.examples.eager.SingletonEagerClass;
import com.ivarrace.patterns.creational.singleton.examples.lazy.SingletonLazyClass;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MainSingletonThreadSafe {

    private static final Logger LOGGER = Logger.getLogger(MainSingletonThreadSafe.class);

    public static void main(String[] args) {
        //Ejecuta las pruebas para cada tipo de Singleton
        testSingletonLazyClass();
        testSingletonLazyThreadSafeClass();
        testSingletonEagerClass();
    }

    /**
     * Verificar que los SingletonLazyClass NO son ThreadSafe
     * NOTA: Cada ejecucion será distinta, pudiendo ser iguales o no, dependiendo de la condicion de carrera.
     */
    private static void testSingletonLazyClass() {
        //Definimos el task
        Callable<SingletonLazyClass> taskGetSingletonLazyClass = SingletonLazyClass::getInstance;
        //Ejecutamos los hilos, obteniendo los objetos instanciados
        List<Object> result = runThreads(taskGetSingletonLazyClass);
        //Pintamos resultados
        LOGGER.info("SingletonLazyInstance1 hashCode: " + result.get(0).hashCode());
        LOGGER.info("SingletonLazyInstance2 hashCode: " + result.get(1).hashCode());
        if(result.get(0).hashCode()==result.get(1).hashCode()){
            LOGGER.error("[FAIL] Los objetos conciden. !Que suerte! Prueba de nuevo, a ver que pasa...");
        } else {
            LOGGER.info("[SUCCESS] Se ha producido una condición de carrera, demostrando que no son ThreadSafe");
        }
    }

    /**
     * Verificar que los SingletonEagerClass funcionan correctamente, comparando su hashCode
     */
    private static void testSingletonEagerClass() {
        //Definimos el task
        Callable<SingletonEagerClass> taskGetSingletonEagerClass = SingletonEagerClass::getInstance;
        //Ejecutamos los hilos, obteniendo los objetos instanciados
        List<Object> result = runThreads(taskGetSingletonEagerClass);
        //Pintamos resultados
        LOGGER.info("SingletonEagerInstance1 hashCode: " + result.get(0).hashCode());
        LOGGER.info("SingletonEagerInstance2 hashCode: " + result.get(1).hashCode());
    }

    /**
     * Verificar que los SingletonLazyThreadSafeClass funcionan correctamente, comparando su hashCode
     */
    private static void testSingletonLazyThreadSafeClass() {
        //Definimos el task
        Callable<SingletonLazyThreadSafeClass> taskGetSingletonLazyThreadSafeClass = SingletonLazyThreadSafeClass::getInstance;
        //Ejecutamos los hilos, obteniendo los objetos instanciados
        List<Object> result = runThreads(taskGetSingletonLazyThreadSafeClass);
        //Pintamos resultados
        LOGGER.info("SingletonLazyThreadSafeInstance1 hashCode: " + result.get(0).hashCode());
        LOGGER.info("SingletonLazyThreadSafeInstance2 hashCode: " + result.get(1).hashCode());
    }


    /**
     * Método generico para lanzar dos hilos con un task especifico, almacenando sus resultados.
     * @param task Tarea a ejecutar en cada hilo
     * @return Lista de objetos que contiene las dos instancias generadas en cada hilo.
     */
    private static List<Object> runThreads(Callable<?> task) {
        //Definimos el ejecutor
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //Ejecutamos las tareas
        Future instance1 = executorService.submit(task);
        Future instance2 = executorService.submit(task);
        //Esperamos a la respuesta
        LOGGER.debug("processin threads . . .");
        while (!instance1.isDone() && !instance2.isDone()) {
            //Esperar a que las dos tareas terminen
        }
        LOGGER.debug("processin threads . . .  DONE!");
        executorService.shutdown();
        //Devolcemos los objetos generados
        List<Object> objects = new ArrayList<>();
        try{
            objects.add(instance1.get());
            objects.add(instance2.get());
        } catch (InterruptedException | ExecutionException e) {
            LOGGER.fatal(e.getMessage());
            Thread.currentThread().interrupt();
        }
        return objects;
    }

}
