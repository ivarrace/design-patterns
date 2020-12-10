package com.ivarrace.patterns.creational.prototype.examples.shape.model;

import org.apache.log4j.Logger;

import java.util.Objects;

/**
 * Esta será la clase base para los prototipos.
 * Implementa la clase {@link java.lang.Cloneable} para habilitar el
 * método {@link Cloneable#clone()}, que habilita la copia campo a campo de los objetos.
 *
 * Hay qu etener en cuenta que no está recomendado el uso de <code>Cloneable</code>
 * @see <a href="https://www.artima.com/intv/bloch13.html">Copy Constructor versus Cloning</a>
 */
public abstract class Shape implements Cloneable {

    private static final Logger LOGGER = Logger.getLogger(Shape.class);

    /**
     * Parametros comunes para las clases derivadas de esta
     */
    private String id;
    protected String type;

    //Cada clase derivada implementará su propie definicion del método draw()
    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Implementación del metodo de clonado, heredado de {@link java.lang.Cloneable}
     *
     * @return Copia exacta del objeto
     */
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            LOGGER.fatal(e.getMessage());
        }
        return clone;
    }

    /**
     * Implementamos el equals para comparar los objetos clonados
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(getId(), shape.getId()) &&
                Objects.equals(getType(), shape.getType());
    }

    /**
     * Implementamos el hashCode para comparar los objetos clonados
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}