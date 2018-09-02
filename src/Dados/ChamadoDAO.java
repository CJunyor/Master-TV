package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mastertv.Chamado;

public class ChamadoDAO {
    public boolean inserirChamado(Chamado c){
        int r = 0;
        try{
            String sql = "INSERT INTO chamado (data, motivo, nrContrato, tecnico, situacao) VALUES (NOW(), ?, ?, ?, ?);";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getMotivo());
            p.setInt(2, c.getContrato());
            p.setInt(3, c.getIdtecnicos());
            p.setString(4, c.getSituacao());
            r = p.executeUpdate();
            ConnectionFactory.closeConnection(conn, p);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        } 
        finally{
            return (r>0);
        }
    }
    
    public boolean updateChamado(Chamado c){
        int r = 0;
        try{
            String sql = "UPDATE chamado SET motivo = ?, tecnico = ?, situacao = ? WHERE protocolo = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getMotivo());
            p.setInt(2, c.getIdtecnicos());
            p.setString(3, c.getSituacao());
            p.setInt(4, c.getProtocolo());
            r = p.executeUpdate();
            ConnectionFactory.closeConnection(conn, p);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }   
        finally{
            return (r>0);
        }
    } 
    
    public void pequisarChamado(Chamado c){
        try{
            String sql = "SELECT DATE_FORMAT(data, '%h:%i:%s - %d/%m/%y') as data, motivo, nrContrato, tecnico, situacao FROM chamado WHERE protocolo = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, c.getProtocolo());
            ResultSet rs = p.executeQuery();
            if(rs != null && rs.next()){
                c.setData(rs.getString("data"));
                c.setMotivo(rs.getString("motivo"));
                c.setContrato(rs.getInt("nrContrato"));
                c.setIdtecnicos(rs.getInt("tecnico"));
                c.setSituacao(rs.getString("situacao"));
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherChamadoArray(ArrayList<Chamado> chamadoArray, int contrato){
        Chamado c;
        try{
            String sql = "SELECT protocolo, DATE_FORMAT(data, '%h:%i:%s - %d/%m/%y') as data, motivo, nrContrato, tecnico, situacao FROM chamado WHERE nrContrato = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, contrato);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Chamado();
                c.setProtocolo(rs.getInt("protocolo"));
                c.setData(rs.getString("data"));
                c.setMotivo(rs.getString("motivo"));
                c.setContrato(rs.getInt("nrContrato"));
                c.setIdtecnicos(rs.getInt("tecnico"));
                c.setSituacao(rs.getString("situacao"));
                chamadoArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherChamadoArray(ArrayList<Chamado> chamadoArray, int contrato, String Prot){
        Chamado c;
        try{
            String sql = "SELECT protocolo, DATE_FORMAT(data, '%h:%i:%s - %d/%m/%y') as data, motivo, nrContrato, tecnico, situacao FROM chamado WHERE nrContrato = ? AND protocolo LIKE '%"+Prot+"%';";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, contrato);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Chamado();
                c.setProtocolo(rs.getInt("protocolo"));
                c.setData(rs.getString("data"));
                c.setMotivo(rs.getString("motivo"));
                c.setContrato(rs.getInt("nrContrato"));
                c.setIdtecnicos(rs.getInt("tecnico"));
                c.setSituacao(rs.getString("situacao"));
                chamadoArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public boolean deletarChamado(Chamado c){
        int r = 0;
        try{
            String sql = "DELETE FROM chamado WHERE protocolo = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, c.getProtocolo());
            r = p.executeUpdate();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        finally{
            return (r>0);
        }
    }
}
