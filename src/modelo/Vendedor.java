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
public class Vendedor {
    
    int id;
    String dpi;
    String nom;
    String tel;
    String estado;
    String usua2;

    public Vendedor() {
    }

    public Vendedor(int id, String dpi, String nom, String tel, String estado, String usua2) {
        this.id = id;
        this.dpi = dpi;
        this.nom = nom;
        this.tel = tel;
        this.estado = estado;
        this.usua2 = usua2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsua2() {
        return usua2;
    }

    public void setUsua2(String usua2) {
        this.usua2 = usua2;
    }
    
    
    
    
    
}
