package org.umg.ejercicio2.nodos;

public class Producto {
    private int id;
    private String nombre;
    private Producto siguiente;

    public Producto(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    public void agregarProducto(Producto nuevo){
        Producto lista = this.siguiente;
        nuevo.setSiguiente(lista);
        this.setSiguiente(nuevo);
    }
    public Producto(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Producto siguiente) {
        this.siguiente = siguiente;
    }

}
