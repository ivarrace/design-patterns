package com.ivarrace.patterns.creational.singleton.examples.eager;

/**
 * Una clase Singleton solo se puede instanciar una vez.
 * Este metodo se conoce como Eager initialization, y SIEMPRE registra la instancia del objeto
 */
public class SingletonEagerClass {

    /**
     * Se guarda el objeto instanciado dentro de la propia clase, y se iniciacilia definiendolo como final
     */
    private static final SingletonEagerClass INSTANCE = new SingletonEagerClass();

    /**
     * El constructor se define como privado para evitar instanciar una nueva clase
     */
    private SingletonEagerClass() {
    }

    /**
     * Para llamar al objeto, se llama a qetInstance.
     * Esta clase devuelve la instancia del propio objeto.
     *
     * @return Objeto singleton
     */
    public static SingletonEagerClass getInstance() {
        return INSTANCE;
    }

}
