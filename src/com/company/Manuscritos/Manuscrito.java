package com.company.Manuscritos;

import java.time.LocalDate;

public abstract class Manuscrito implements Prestable {

    private String codigo;
    private String titulo;
    private LocalDate fechaPublicacion;

    public Manuscrito (String codigo, String titulo, LocalDate fechaPublicacion) {

    this.codigo=codigo;
    this.titulo=titulo;
    this.fechaPublicacion=fechaPublicacion;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void devuelveAño(){

    }

    public void devuelveCodigo(){

    }

    @Override
    public String toString() {
        return "Manuscrito{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                '}';
    }

   public abstract void prestar() ;

    public abstract void devolver() ;

    public abstract Boolean prestado() ;

}
