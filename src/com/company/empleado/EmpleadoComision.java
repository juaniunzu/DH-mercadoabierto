package com.company.empleado;

public class EmpleadoComision extends Empleado implements Pagable{

    private Integer ventasRealizadas;
    private Double porcentajeComision;
    private Double sueldoBasico;

    public EmpleadoComision(Integer ventasRealizadas, Double porcentajeComision) {
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
        this.sueldoBasico = 20000.0;
    }

    /**
     * Este empleado cobra el sueldo basico + una comision que depende de la cantidad de ventas realizadas
     */
    @Override
    public void cobrarSueldo() {
        Double sueldoACobrar = 0.0;
        Double sueldoComisionACobrar = this.ventasRealizadas * this.porcentajeComision / 100;
        sueldoACobrar += (this.sueldoBasico + sueldoComisionACobrar);
        System.out.println("El empleado acaba de cobrar $" + sueldoACobrar);
    }

    public Integer getVentasRealizadas() {
        return ventasRealizadas;
    }

    public Double getPorcentajeComision() {
        return porcentajeComision;
    }
}
