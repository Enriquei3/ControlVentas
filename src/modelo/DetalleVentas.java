/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Enrique Isales
 */
public class DetalleVentas {
    
    int id;
    int idventas;
    int idproducto;
    int cantidad;
    double preVenta;

    public DetalleVentas() {
    }

    public DetalleVentas(int id, int idventas, int idproducto, int cantidad, double preVenta) {
        this.id = id;
        this.idventas = idventas;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.preVenta = preVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(double preVenta) {
        this.preVenta = preVenta;
    }
    
    
    
    
    
}
