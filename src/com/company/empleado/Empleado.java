package com.company.empleado;

public abstract class Empleado implements Pagable{

    private Double sueldoBasico;

    public Empleado() {
        this.sueldoBasico = 20000.0;
    }


    public Double getSueldoBasico() {
        return sueldoBasico;
    }
}
