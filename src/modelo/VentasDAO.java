
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Isales
 */
public class VentasDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    
    public String NroSerieVentas(){
        String serie="";
        String sql="select max(NumeroVentas) from ventas";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                serie=rs.getString(1);
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error en Numero de Serie "+ e);
        }
        return serie;
    }
    
    
    public String IdVentas(){
        String idv="";
        String sql= "select max(IdVentas) from ventas";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idv=rs.getString(1); 
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en IdVentas "+ e);
        }
        return idv;
    }
    
    public int GuardarVentas( Ventas v){
       Ventas ventas= new Ventas();
       String sql="insert into ventas(Cliente_idCliente, Vendedor_idVendedor, NumeroVentas, fechaventa, monto, estado) values(?,?,?,?,?,?) ";
       
       
        try {
       con=cn.Conectar();
       ps=con.prepareStatement(sql);
       ps.setInt(1, v.getIdcliente());
       ps.setInt(2, v.getIdvendedor());
       ps.setString(3, v.getSerie());
       ps.setString(4, v.getFecha());
       ps.setDouble(5, v.getMonto());
       ps.setString(6, v.getEstado1());
       
       ps.executeUpdate();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error en guardar ventas "+ e);
        }
       
       return r;
       
        
    }
        
    public int GuardarDetalleVentas(DetalleVentas dv){
        String sql="insert into detalle_ventas(Ventas_idVentas, Producto_idProducto, Cantidad, PrecioVenta) values(?,?,?,?)";
        
        try {
       con=cn.Conectar();
       ps=con.prepareStatement(sql);
       ps.setInt(1, dv.getIdventas());
       ps.setInt(2, dv.getIdproducto());
       ps.setInt(3, dv.getCantidad());
       ps.setDouble(4, dv.getPreVenta());
       
       
        ps.executeUpdate(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en guardar detalle de ventas "+ e);
        }
        
        return r;
        
    }
    
    
    
}
