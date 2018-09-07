package com.company;

import java.util.ArrayList;

public class Libro {
    //Atributos
    private Integer isbn;
    private String nombre;
    private String apellido;
    private ArrayList<Ejemplar> listaEjemplares;

    //Constructor
    public Libro(Integer isbn, String nombre, String apellido, ArrayList<Ejemplar> listaEjemplares) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaEjemplares = listaEjemplares;
    }

    //Getters
    public Integer getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Metodos
    public void agregarNuevoEjemplar(Ejemplar ejemplar){
        listaEjemplares.add(ejemplar);
    }

    public boolean tieneEjemplaresDisponibles(){
        for (Ejemplar e: listaEjemplares
             ) {if (e.getPrestado()==false){
                 return true;
        }
        }
        return false;
    }

    public Ejemplar prestarEjemplar(){
        if (tieneEjemplaresDisponibles()){
            for (int i=0; i<listaEjemplares.size(); i++){
                if (listaEjemplares.get(i).getPrestado()==false){
                   return listaEjemplares.remove(i);
                }
            }
        }
        System.out.println("No hay ejemplares disponibles para prestar");
        return null;
    }

    public void reingresarEjemplar(Ejemplar unEjemplar){
        unEjemplar.setPrestado(false);
        listaEjemplares.add(unEjemplar);
        System.out.println("Se ha devuelto el ejemplar número: " + unEjemplar.getNroEdicion());
    }
}
