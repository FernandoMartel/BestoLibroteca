package com.company.Manuscritos;

import java.time.LocalDate;

public class Revista extends Manuscrito{

    private String numeroEjemplar;

    public Revista (String codigo, String titulo, LocalDate fechaPublicacion, String numeroEjemplar){
        super(codigo, titulo, fechaPublicacion);
        this.numeroEjemplar=numeroEjemplar;
    }

    public String getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(String numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroEjemplar='" + numeroEjemplar + '\'' +
                '}';
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public Boolean prestado() {
        return null;
    }
}
