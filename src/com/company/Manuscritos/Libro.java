package com.company.Manuscritos;

import java.time.LocalDate;

public class Libro extends Manuscrito implements Prestable{

    private Boolean prestado;

    public Libro(String codigo, String titulo, LocalDate fechaPublicacion, Boolean prestado) {
        super(codigo, titulo, fechaPublicacion);
        this.prestado = prestado;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        if (this.prestado()){
            System.out.println("Ya esta prestado.");
        }else{
            this.prestado = true;
            System.out.println("Libro prestado");
        }

    }

    @Override
    public void devolver() {
        if (this.prestado()){
            this.prestado = false;
            System.out.println("Libro debolvido.");
        }else{
            System.out.println("Libro no fue prestado.");
        }

    }

    @Override
    public Boolean prestado() {
        return getPrestado();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                '}';
    }
}
