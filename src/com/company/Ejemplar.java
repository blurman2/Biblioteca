package com.company;

public class Ejemplar {
    //Atributos
    private Libro libro;
    private Integer nroEdicion;
    private String ubicacion;
    private Boolean prestado = false;


    //Constructor
    public Ejemplar(Libro libro, Integer nroEdicion, String ubicacion) {
        this.libro = libro;
        this.nroEdicion = nroEdicion;
        this.ubicacion = ubicacion;
    }

    //Setters
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    //Getters
    public Integer getNroEdicion() {
        return nroEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Boolean getPrestado() {
        return prestado;
    }


}
