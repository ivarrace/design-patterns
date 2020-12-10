package com.ivarrace.patterns.creational.builder.examples.simple.robot.model;

/**
 * Clase que implementa un Builder.
 * Este patroón se suele utilizar para crear objetos complejos, evitando la sobrecarga de constructores,
 * simplificando el proceso de creanión de nuevos objetos de la clase, y generando un código más limpio.
 */
public class Robot {

    private long serialNumber;
    private String purpose;
    private int armsNumber;
    private boolean isAgressive;

    public long getSerialNumber() {
        return serialNumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getArmsNumber() {
        return armsNumber;
    }

    public boolean isAgressive() {
        return isAgressive;
    }

    /**
     * Constructor privado.
     * Solo podran crearse nuevas instancias desde el Builder definido en la propia clase
     */
    private Robot() {
    }

    /**
     * Este Builder será el encargado de crear nuevas instancias de esta clase.
     * Los métodos definidos en el Builder, devuelven el propio Builder para facilitar el proceso de construcción.
     */
    public static class Builder {
        private long serialNumber;
        private String purpose;
        private int armsNumber;
        private boolean isAgressive;

        public Builder(long serialNumber) {
            this.serialNumber = serialNumber;
        }

        public Builder withPurpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder withArms(int armsNumber) {
            this.armsNumber = armsNumber;
            return this;
        }

        public Builder agressive() {
            this.isAgressive = Boolean.TRUE;
            return this;
        }

        /**
         * El método al que se llamará para que, una vez definidos los parámetros necesarios para el nuevo objeto,
         * se genere una nueva instancia.
         *
         * @return
         */
        public Robot build() {
            Robot robot = new Robot();
            robot.serialNumber = this.serialNumber;
            robot.purpose = this.purpose;
            robot.armsNumber = this.armsNumber;
            robot.isAgressive = this.isAgressive;
            return robot;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Robot [v-" + serialNumber + "]");
        sb.append("{Purpose: " + (purpose != null ? purpose : "none"));
        sb.append(", Arms: " + (armsNumber != 0 ? armsNumber : "none"));
        sb.append(", Agressive: " + isAgressive);
        sb.append("}");
        return sb.toString();
    }
}
