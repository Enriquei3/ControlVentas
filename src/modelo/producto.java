
package modelo;

/**
 *
 * @author Enrique Isales
 */
public class producto {
    
    int id;
    String NomP;
    Double precioP;
    int stockP;
    String estadoP;

    public producto() {
    }

    public producto(int id, String NomP, Double precioP, int stockP, String estadoP) {
        this.id = id;
        this.NomP = NomP;
        this.precioP = precioP;
        this.stockP = stockP;
        this.estadoP = estadoP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomP() {
        return NomP;
    }

    public void setNomP(String NomP) {
        this.NomP = NomP;
    }

    public Double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(Double precioP) {
        this.precioP = precioP;
    }

    public int getStockP() {
        return stockP;
    }

    public void setStockP(int stockP) {
        this.stockP = stockP;
    }

    public String getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(String estadoP) {
        this.estadoP = estadoP;
    }

   
    
    
    
    
}
