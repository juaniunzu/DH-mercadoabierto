package com.company.empleado;

public class EmpleadoTiempoIndeterminado extends Empleado {

    private Integer cantidadDeHijos;
    private Integer antiguedadEnAños;
    private Double sueldoBasico;
    private Integer bonoPresentismo;
    private Integer bonoDesempenio;

    public EmpleadoTiempoIndeterminado(Integer cantidadDeHijos, Integer antiguedadEnAños) {
        this.cantidadDeHijos = cantidadDeHijos;
        this.antiguedadEnAños = antiguedadEnAños;
        this.sueldoBasico = 20000.0;
        this.bonoDesempenio = 0;
        this.bonoPresentismo = 0;
    }

    public void agregarBonoPresentismo(){
        this.bonoPresentismo ++;
    }

    public void agregarBonoDesempenio(){
        this.bonoDesempenio ++;
    }



    /**
     * Este empleado cobra el sueldo basico + adicional por hijo + adicional por antiguedad
     * $200 por hijo, maximo 5 hijos ($1000)
     * $100 por año de antiguedad, maximo 5 años ($500)
     * $20 por punto de bono presentismo
     * $100 por punto de bono desempeño
     */
    @Override
    public void cobrarSueldo() {
        Double sueldoACobrar = 0.0;
        sueldoACobrar += this.sueldoBasico;
        sueldoACobrar += calcularAdicionalSueldo();
        sueldoACobrar += calcularAdicionalPorBono();

        System.out.println("El empleado ha cobrado $ " + sueldoACobrar);
    }

    private Double calcularAdicionalSueldo(){
        Double sueldoAdicional = 0.0;
        if(this.cantidadDeHijos <= 5){
            sueldoAdicional += this.cantidadDeHijos*200.0;
        } else if (this.cantidadDeHijos > 5){
            sueldoAdicional += 1000.0;
        }
        return sueldoAdicional;
    }

    private Double calcularAdicionalPorBono(){
        Double sueldoAdicional = 0.0;
        sueldoAdicional += this.bonoDesempenio * 100.0;
        sueldoAdicional += this.bonoPresentismo * 20.0;
        return sueldoAdicional;
    }

    public Integer getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public Integer getAntiguedadEnMeses() {
        return antiguedadEnAños;
    }
}
