package com.company;

import com.company.Manuscritos.Manuscrito;

import java.util.ArrayList;

public class Cliente {

    private Number id;

    public Cliente(Number id){
        this.id=id;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Prestamo solicitarPrestamo(ArrayList<Manuscrito> lista, Integer id){

       return  new Prestamo(this,lista, id);
    }


}
