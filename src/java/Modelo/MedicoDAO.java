
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {
    PreparedStatement ps;
    ResultSet rs;
    ConexionBD c = new ConexionBD();
    Connection con;
    
    public boolean inicio(String id){
        boolean flag = false;
        String sql = "SELECT * FROM MEDICO WHERE COD_MEDICO = '" + id + "'";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            } else {
                flag = false;
            }
        } catch (Exception e) {
        }
        
        return flag;
    }
    
    public List listar(){
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM MEDICO";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Medico m = new Medico();
                m.setCod_Medico(rs.getInt(1));
                m.setPrimer_Nombre(rs.getString(2));
                m.setSegundo_Nombre(rs.getString(3));
                m.setTercer_Nombre(rs.getString(4));
                m.setPrimer_Apellido(rs.getString(5));
                m.setSegundo_Apellido(rs.getString(6));
                m.setNum_Telefono(rs.getString(7));
                m.setCorreo(rs.getString(8));
                lista.add(m);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
