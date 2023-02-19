package com.politecnicomalaga.tienda;

/**
 *
 * @author noelia
 */
public class Productos {
    
    private String descripción;
    private int código;
    private float precio;
    private int porcentaje;
    
    public Productos(){
        
    }

    public Productos(String descripcion, int codigo, float precio) {

        //ATRIBUTOS
        this.descripción = descripcion;
        this.código = codigo;
        this.precio = precio;
    }

    public float aumPrecio(float precio, int porcentaje) {
        return precio + (precio * porcentaje / 100);
    }

    public float rebPrecio(float precio, int porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

public String toString() {
        String cadena = "";
        cadena = "El precio del producto 1 es: " + aumPrecio(precio, porcentaje) + "\nEl precio del producto 2 es: " + rebPrecio(precio, porcentaje);
        return cadena;
    }
}