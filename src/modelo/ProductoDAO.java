
package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Isales
 */
public class ProductoDAO implements CRUD{
    int r;
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    public int actualizarStock(int cant, int idp){
        String sql="update producto set Stock=? where idProducto=?";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error en actualizar Stock "+e);
        }
        return r;
    }
    
    
    
    public producto listarID(int id){
        producto p=new producto();
        String sql="select * from producto where idProducto=?";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
               p.setId(rs.getInt(1));
               p.setNomP(rs.getString(2));
               p.setPrecioP(rs.getDouble(3));
               p.setStockP(rs.getInt(4));
               p.setEstadoP(rs.getString(5));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en listarID Producto "+e);
        }
            return p;
    }
    
    

    @Override
    public List listar() {
        List <producto> lista = new ArrayList<>();
        String sql= "select * from producto";
        
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                producto p=new producto();
                p.setId(rs.getInt(1));
                p.setNomP(rs.getString(2));
                p.setPrecioP(rs.getDouble(3));
                p.setStockP(rs.getInt(4));
                p.setEstadoP(rs.getString(5));
                lista.add(p);
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error en listar Producto "+e);
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into producto(Nombres, Precio, Stock, Estado) values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement)con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r= ps.executeUpdate();
     
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en Agregar Producto "+e);
        }
        return r; 
    }

    @Override
    public int actualizar(Object[] o) {
        String sql="update producto set Nombres=?, Precio=?,Stock=?, Estado=? where idProducto=? ";
        int r=0;
        try {
            
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null,"Error en actualizar Producto  "+e);
             
        }
        return r; 
    
    
    }

    @Override
    public void eliminar(int id) {
      String sql="delete from producto where idProducto=?";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en Eliminar Producto  "+e);
        } 
    
    
    }
    
    
    
    
    
}
