package com.politecnicomalaga.tienda_ex;

/**
 *
 * @author noelia
 */
public class Productos {

    private String descripcion;
    private int codigo;
    private float precio;
    private int porcentaje;
    
    public Productos(){
        
    }

    public Productos(String descripcion, int codigo, float precio) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
    }

    public float aumPrecio(int porcentaje) {
        return precio = precio + (precio * porcentaje / 100);
    }

    public float rebPrecio(int porcentaje) {
        return precio = precio - (precio * porcentaje / 100);
    }

    public String toString() {
        return "El precio del producto " + codigo + " es: " + precio;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}
