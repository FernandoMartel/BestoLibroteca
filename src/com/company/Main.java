package com.company;

import com.company.Manuscritos.Libro;
import com.company.Manuscritos.Manuscrito;

import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca= Biblioteca.getInstance();

        Libro l1= new Libro("1","dorsd", LocalDate.now(),false);
        biblioteca.addManuscrito(l1);
        Libro l2=new Libro("5","asd", LocalDate.now(),false);
        biblioteca.addManuscrito(l2);
        biblioteca.addManuscrito(new Libro("3","bbb", LocalDate.now(),false));
        biblioteca.addManuscrito(new Libro("13","ccccc", LocalDate.now(),false));

        Cliente c1=new Cliente(2);



        biblioteca.addCliente(c1 );
        biblioteca.addCliente(new Cliente(5));
        biblioteca.addCliente(new Cliente(7));
        biblioteca.addCliente(new Cliente(44));

        ArrayList<Manuscrito> listaAprestar= new ArrayList<>();
        listaAprestar.add(l1);
        listaAprestar.add(l2);
        Prestamo prestamisto = c1.solicitarPrestamo( listaAprestar, 2 );
        System.out.println(l1);

        biblioteca.addPrestamos(prestamisto);

        Prestamo aux= buscameEsta(2, biblioteca, prestamisto);

        aux.devolverLibro();
        System.out.println(aux);

    }
     private static Prestamo buscameEsta(Integer id, Biblioteca biblioteca, Prestamo prestamisto){
        Prestamo x= null;
         for (Prestamo P: biblioteca.getListaPrestamos()
         ) {
             if (prestamisto.getID()== id){
                  x=P;
             }

         }
         return x;

     }

}
