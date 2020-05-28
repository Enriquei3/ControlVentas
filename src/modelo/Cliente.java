
package modelo;

/**
 *
 * @author Enrique Isales
 */
public class Cliente {
    
    int id;
    String dpi;
    String nom;
    String dir;
    String estado;

    public Cliente() {
        
    }

    public Cliente(int id, String dpi, String nom, String dir, String estado) {
        this.id = id;
        this.dpi = dpi;
        this.nom = nom;
        this.dir = dir;
        this.estado = estado;
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

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
}
