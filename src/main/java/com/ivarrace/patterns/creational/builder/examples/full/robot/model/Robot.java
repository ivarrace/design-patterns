package com.ivarrace.patterns.creational.builder.examples.full.robot.model;

public class Robot {

    private long serialNumber;
    private String purpose;
    private int armsNumber;
    private boolean isAgressive;

    public Robot(){
        this.serialNumber = System.currentTimeMillis();
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getArmsNumber() {
        return armsNumber;
    }

    public void setArmsNumber(int armsNumber) {
        this.armsNumber = armsNumber;
    }

    public boolean isAgressive() {
        return isAgressive;
    }

    public void setAgressive(boolean agressive) {
        isAgressive = agressive;
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
