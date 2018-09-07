package com.company;

import java.util.Calendar;
import java.util.Date;

public class Prestamo {
    //Atributos
    private Ejemplar ejemplar;
    private Socio socio;
    private Date fechaPrestamo;
    private Date fechaVencimiento;

    //Constructor
    public Prestamo(Ejemplar ejemplar, Socio socio) {
        this.ejemplar = ejemplar;
        this.socio = socio;
        this.fechaPrestamo = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.fechaPrestamo);
        calendar.add(Calendar.DAY_OF_YEAR,5);
        this.fechaVencimiento = calendar.getTime();
    }

    //Getters
    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Socio getSocio() {
        return socio;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
}
