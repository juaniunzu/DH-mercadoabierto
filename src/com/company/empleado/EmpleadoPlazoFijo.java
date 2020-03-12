package com.company.empleado;

public class EmpleadoPlazoFijo extends Empleado implements Pagable {

    private Integer duracionContratoEnMeses;
    private Double sueldoBasico;

    public EmpleadoPlazoFijo(Integer duracionContratoEnMeses) {
        this.duracionContratoEnMeses = duracionContratoEnMeses;
        this.sueldoBasico = 20000.0;
    }

    public Integer getDuracionContratoEnMeses() {
        return duracionContratoEnMeses;
    }

    public void cobrarSueldo(){
        System.out.println("El empleado acaba de cobrar $" + sueldoBasico);
    }

}
