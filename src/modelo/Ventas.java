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
public class Ventas {
    
    int id;
    int idcliente;
    int idvendedor;
    String serie;
    String fecha;
    Double monto;
    String estado1;

    public Ventas() {
    }

    public Ventas(int id, int idcliente, int idvendedor, String serie, String fecha, Double monto, String estado1) {
        this.id = id;
        this.idcliente = idcliente;
        this.idvendedor = idvendedor;
        this.serie = serie;
        this.fecha = fecha;
        this.monto = monto;
        this.estado1 = estado1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado1() {
        return estado1;
    }

    public void setEstado1(String estado1) {
        this.estado1 = estado1;
    }
    
    
    
    
    
    
}
