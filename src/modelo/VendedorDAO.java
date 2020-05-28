
package modelo;

import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Isales
 */
public class VendedorDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    

    public EntidadVendedor validarVendedor(String dpi, String user){
        
         EntidadVendedor ev= new EntidadVendedor();
        
        String sql= "select * from vendedor where dpi=? and User_2=?";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, dpi);
            ps.setString(2, user);
            rs = ps.executeQuery();
            
            while(rs.next()){
                ev.setId(rs.getInt(1));
                ev.setDpi(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setTel(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));       
            }
  
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en validar Vendedor "+e);
        }
             return ev;
    }
    
    
    public Vendedor listarVendedorId(String dpi) {
        Vendedor v = new Vendedor();
        String sql = "select * from vendedor where dpi=" + dpi;
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                v.setId(rs.getInt(1));
                v.setDpi(rs.getString(2));
                v.setNom(rs.getString(3));
                v.setTel(rs.getString(4));
                v.setEstado(rs.getString(5));
                v.setUsua2(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return v;
    }

    
    
    
    

    @Override
    public List listar() {
         List <Vendedor> lista = new ArrayList<>();
        String sql= "select * from vendedor";
        
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Vendedor v=new Vendedor();
                v.setId(rs.getInt(1));
                v.setDpi(rs.getString(2));
                v.setNom(rs.getString(3));
                v.setTel(rs.getString(4));
                v.setEstado(rs.getString(5));
                v.setUsua2(rs.getString(6));
                lista.add(v);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en Listar Vendedor "+e);
        }
        return lista;
     
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into vendedor(dpi, Nombres, Telefono, Estado, User_2)values(?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement)con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r= ps.executeUpdate();
     
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error en add Vendedor "+e);
        }
        return r;
     
    }

    @Override
    public int actualizar(Object[] o) {
        String sql="update vendedor set dpi=?, Nombres=?,Telefono=?, Estado=?, User_2=? where idVendedor=? ";
        int r=0;
        try {
            
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null,"Error en actualizar Vendedor "+e);
        }
        return r;
     
    }

    @Override
    public void eliminar(int id) {
         String sql="delete from vendedor where idVendedor=?";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null,"Error en Eliminar Vendedor "+e);
        }
 
    }
      
   
}
