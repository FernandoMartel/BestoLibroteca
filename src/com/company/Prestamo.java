package com.company;

import com.company.Manuscritos.Manuscrito;

import java.util.ArrayList;

public class Prestamo {

    private Integer ID;


    private Cliente cliente;
    private ArrayList<Manuscrito> prestamosList;


    public Prestamo(Cliente cliente, ArrayList<Manuscrito> prestamosList, Integer id) {
        this.cliente = cliente;
        this.prestamosList = prestamosList;
        prestarLibro();
        this.ID = id;

    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Manuscrito> getPrestamosList() {
        return prestamosList;
    }

    public void setPrestamosList(ArrayList<Manuscrito> prestamosList) {
        this.prestamosList = prestamosList;
    }
    public void prestarLibro()
    {
        for(Manuscrito m:prestamosList )
        {
            m.prestar();
        }
    }

    public void devolverLibro()
    {
        for(Manuscrito m:prestamosList )
        {
            m.devolver();
        }
    }
}
