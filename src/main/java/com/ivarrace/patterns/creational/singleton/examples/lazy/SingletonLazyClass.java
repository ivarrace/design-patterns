package com.ivarrace.patterns.creational.singleton.examples.lazy;

/**
 * Una clase Singleton solo se puede instanciar una vez.
 * Este metodo se conoce como Lazy initialization, ya que restringe la creación de la instancia hasta que es llamada por primera vez
 */
public class SingletonLazyClass {

    /**
     * Se guarda el objeto instanciado dentro de la propia clase
     */
    private static SingletonLazyClass instance = null;

    /**
     * El constructor se define como privado para evitar instanciar una nueva clase
     */
    private SingletonLazyClass() {
    }

    /**
     * Para llamar al objeto, se llama a qetInstance.
     * Esta clase devuelve la instancia del propio objeto, y si no existe la crea.
     * Si trabajamos con hilos se pueden dar condiciones de carrera en la llamada a este método,
     * por lo que se deberia especificar como synchronized
     * {@link SingletonLazyThreadSafeClass#getInstance()}
     *
     * @return Objeto singleton
     */
    public static SingletonLazyClass getInstance() {
        if (instance == null) {
            instance = new SingletonLazyClass();
        }
        return instance;
    }

}
