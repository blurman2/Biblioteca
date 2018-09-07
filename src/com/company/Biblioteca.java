package com.company;

import java.util.ArrayList;

public class Biblioteca {
    //Atributos
    private ArrayList<Libro> listaLibros = new ArrayList<>();
    private ArrayList<Socio> listaSocios = new ArrayList<>();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    //Métodos
    public void prestar(Integer isbn, Integer numeroDeIdentificacion){
    Libro libroAPrestar = null;
    Socio unSocio = null;

        for (Libro l: listaLibros
             ) {
            if (l.getIsbn() == isbn) {
                libroAPrestar = l;
            }
        }
        if (libroAPrestar==null){
            System.out.println("No existe ese libro en la biblioteca");
            return;
        }

        for (Socio s: listaSocios
             ) {
            if (s.getNroIdentificacion()== numeroDeIdentificacion){
                 unSocio = s;
            }

        }
        if (unSocio==null){
            System.out.println("No existe ese socio en la biblioteca");
            return;
        }


        if (libroAPrestar.tieneEjemplaresDisponibles() && unSocio.tieneCupoDisponible()){
            Ejemplar ejemplarAPrestar = libroAPrestar.prestarEjemplar();
            unSocio.tomarPrestadoUnEjemplar(ejemplarAPrestar);
            Prestamo nuevoPrestamo = new Prestamo(ejemplarAPrestar, unSocio);
            listaPrestamos.add(nuevoPrestamo);
            System.out.println("El préstamo se registró con éxito");
        } else if (!libroAPrestar.tieneEjemplaresDisponibles()){
            System.out.println("El libro no tiene ejemplares disponibles");
        } else  if(!unSocio.tieneCupoDisponible()){
            System.out.println("El socio no tiene cupo disponible");
        }


    }

    public void devolver(Ejemplar unEjemplar, Integer numeroDeIdentificacion) {

        for (Socio s : listaSocios
        ) {
            if (s.getNroIdentificacion() == numeroDeIdentificacion) {
                for (Ejemplar e : s.getListaPrestados()
                ) {
                    if (e.equals(unEjemplar)) {
                        s.devolverUnEjemplar(unEjemplar);
                        System.out.println("El ejemplar se devolvió con éxito");
                        return;
                    }
                    System.out.println("El ejemplar no fue prestado a este socio");
                    return;
                }
            }

        }
        System.out.println("No se encontró número de socio");
        return;
    }
}
