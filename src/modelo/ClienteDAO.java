
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
public class ClienteDAO implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Cliente co=new Cliente();
    
    
    public Cliente ListarID (String dpi){
        Cliente c1=new Cliente();
        String sql= "select * from cliente where dpi=?";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,dpi);
            rs=ps.executeQuery();
            while(rs.next()){
                c1.setId(rs.getInt(1));
                c1.setDpi(rs.getString(2));
                c1.setNom(rs.getString(3));
                c1.setDir(rs.getString(4));
                c1.setEstado(rs.getString(5));
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error en listarID Cliente"+ e);
        }
        return c1;
    }
    
    

    @Override
    public List listar() {
        List <Cliente> lista = new ArrayList<>();
        String sql= "select * from cliente";
        
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente c=new Cliente();
                c.setId(rs.getInt(1));
                c.setDpi(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
            }
        } catch (Exception e) {
            System.out.print("Error listar "+e);
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into cliente(dpi, Nombres, Direccion, estado)values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement)con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r= ps.executeUpdate();
     
        } catch (Exception e) {
            System.out.println("Error en Agregar "+e);
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        String sql="update cliente set dpi=?, Nombres=?,Direccion=?, estado=? where idcliente=? ";
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
             System.out.println("Error en actualizar "+e);
        }
        return r;
       
    }
    
    
    
    @Override
    public void eliminar(int id) {
        
        String sql="delete from cliente where idcliente=?";
        try {
            con=cn.Conectar();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
           System.out.println("Error en Eliminar "+e);  
        }
  
    }
    
}
