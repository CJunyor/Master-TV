package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mastertv.Pagamento;

public class PagamentoDAO {
    public boolean inserirPagamento(Pagamento pg){
        int r = 0;
        try{
            String sql = "INSERT INTO pagamento  VALUES (?, DATE_FORMAT(NOW(), '%d/%m/%y'), ?, ?);";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, pg.getNumeroContrato());
            p.setFloat(2, pg.getValor());
            p.setBoolean(3, false);
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
    
    public boolean updatePagamento(Pagamento pg){
        int r = 0;
        try{
            String sql = "UPDATE pagamento SET pago = ? WHERE Data = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setBoolean(1, pg.isPago());
            p.setString(2, pg.getData());
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
    
    public void pequisarPagamento(Pagamento pg){
        try{
            String sql = "SELECT * FROM pagamento WHERE numeroContrato = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, pg.getNumeroContrato());
            ResultSet rs = p.executeQuery();
            if(rs != null && rs.next()){
                pg.setNumeroContrato(rs.getInt("numeroContrato"));
                pg.setData(rs.getString("Data"));
                pg.setValor(rs.getFloat("Preço"));
                pg.setPago(rs.getBoolean("pago"));
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherPagamentoArray(ArrayList<Pagamento> pagamentoArray, int contrato){
        Pagamento pg;
        try{
            String sql = "SELECT * FROM pagamento WHERE numeroContrato = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, contrato);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                pg = new Pagamento();
                pg.setNumeroContrato(rs.getInt("numeroContrato"));
                pg.setData(rs.getString("Data"));
                pg.setValor(rs.getFloat("Preço"));
                pg.setPago(rs.getBoolean("pago"));
                pagamentoArray.add(pg);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherPagamentoArray(ArrayList<Pagamento> pagamentoArray, int contrato, String Data){
        Pagamento pg;
        try{
            String sql = "SELECT * FROM pagamento WHERE numeroContrato = ? AND Data LIKE '%"+Data+"%';";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, contrato);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                pg = new Pagamento();
                pg.setNumeroContrato(rs.getInt("numeroContrato"));
                pg.setData(rs.getString("Data"));
                pg.setValor(rs.getFloat("Preço"));
                pg.setPago(rs.getBoolean("pago"));
                pagamentoArray.add(pg);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public boolean deletarPagamento(Pagamento pg){
        int r = 0;
        try{
            String sql = "DELETE FROM pagamento WHERE Data = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, pg.getData());
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
