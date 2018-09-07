package com.company;

import java.util.ArrayList;

public class Socio {
    //Atributos
    private Integer nroIdentificacion;
    private String nombre;
    private String apellido;
    protected Integer cantidadMax;
    private ArrayList<Ejemplar> listaPrestados = new ArrayList<>();

    //Constructor
    public Socio(Integer nroIdentificacion, String nombre, String apellido) {
        this.nroIdentificacion = nroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantidadMax = 3;
    }

    //Getters
    public Integer getNroIdentificacion() {
        return nroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCantidadMax() {
        return cantidadMax;
    }

    public ArrayList<Ejemplar> getListaPrestados() {
        return listaPrestados;
    }

    //Métodos
    public Boolean tieneCupoDisponible(){
        if (this.cantidadMax > listaPrestados.size()){
            return true;
        } else {
            return false;
        }
    }

    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
        if (!unEjemplar.getPrestado() && tieneCupoDisponible()){
            listaPrestados.add(unEjemplar);
            System.out.println("Se ha prestado el ejemplar");
        }else{
            System.out.println("El ejemplar se encuentra prestado");
        }
    }

    public void devolverUnEjemplar(Ejemplar unEjemplar){
        unEjemplar.setPrestado(false);
        listaPrestados.remove(unEjemplar);

    }

}
