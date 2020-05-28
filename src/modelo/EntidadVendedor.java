
package modelo;

/**
 *
 * @author Enrique Isales
 */
public class EntidadVendedor {
    
    int id;
    String dpi;
    String Nom;
    String tel;
    String estado;
    String user;

    public EntidadVendedor() {
    }

    public EntidadVendedor(int id, String dpi, String Nom, String tel, String estado, String user) {
        this.id = id;
        this.dpi = dpi;
        this.Nom = Nom;
        this.tel = tel;
        this.estado = estado;
        this.user = user;
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
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

                    
    
    
}
