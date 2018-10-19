package com.company;

import com.company.Manuscritos.Manuscrito;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static Biblioteca biblioteca;
    private ArrayList<Manuscrito> listMa = new ArrayList<>();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    private Biblioteca() {

    }

    public static Biblioteca getInstance()
    {
        if(biblioteca== null)
        {
            biblioteca = new Biblioteca();
        }
        return biblioteca;
    }
    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
    public void addManuscrito(Manuscrito manuscrito){
        listMa.add(manuscrito);
    }
    public void addPrestamos(Prestamo prestamo)
    {
        listaPrestamos.add(prestamo);
    }
    public void addCliente(Cliente cliente)
    {
        listaCliente.add(cliente);
    }
}
