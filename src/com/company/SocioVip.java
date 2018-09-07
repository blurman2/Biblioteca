package com.company;

public class SocioVip extends Socio {
    //Atributos
    private Integer cuotaMensual;

    //Constructor
    public SocioVip(Integer nroIdentificacion, String nombre, String apellido) {
        super(nroIdentificacion, nombre, apellido);
        this.cantidadMax = 5;
    }

    //Setters
    public void setCuotaMensual(Integer cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    //Getters
    public Integer getCuotaMensual() {
        return cuotaMensual;
    }
}
