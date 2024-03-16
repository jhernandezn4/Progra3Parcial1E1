package org.umg;

import org.umg.ejercicio1.formMostrar;
import org.umg.ejercicio2.nodos.Producto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //formMostrar form = new formMostrar();
        //form.setVisible(true);


        Producto lista = new Producto(1,"Coca");
        lista.agregarProducto(new Producto(2,"Galletas"));
        lista.agregarProducto(new Producto(3,"Jugo"));
        lista.agregarProducto(new Producto(4,"Golosinas"));
        lista.agregarProducto(new Producto(5,"Dulces"));

        Producto mostrar = lista;
        for (int i =0; i<5;i++){
            System.out.println(mostrar.getNombre());
            mostrar=mostrar.getSiguiente();
        }

    }


}