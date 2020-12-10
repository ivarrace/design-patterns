package com.ivarrace.patterns.creational.singleton.examples.lazythreadsafe;

/**
 * Una clase Singleton solo se puede instanciar una vez.
 * Este metodo se conoce como Lazy initialization, ya que restringe la creación de la instancia hasta que es llamada por primera vez.
 *
 */
public class SingletonLazyThreadSafeClass {

    /**
     * Se guarda el objeto instanciado dentro de la propia clase
     */
    private static SingletonLazyThreadSafeClass instance = null;

    /**
     * El constructor se define como privado para evitar instanciar una nueva clase
     */
    private SingletonLazyThreadSafeClass() {
    }

    /**
     * Para llamar al objeto, se llama a qetInstance.
     * Esta clase devuelve la instancia del propio objeto, y si no existe la crea.
     * Si trabajamos con hilos se pueden dar condiciones de carrera en la llamada a este método,
     * por lo que se especifica como synchronized
     *
     * @return Objeto singleton
     */
    public static synchronized SingletonLazyThreadSafeClass getInstance() {
        if (instance == null) {
            instance = new SingletonLazyThreadSafeClass();
        }
        return instance;
    }

}
