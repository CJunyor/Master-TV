package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mastertv.Cliente;

public class ClienteDAO {
    
    public boolean inserirCliente(Cliente c){
        int r = 0;
        try{
            String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?);";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getCpf());
            p.setString(2, c.getNome());
            p.setString(3, c.getTelefone());
            p.setString(4, c.getEmail());
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
    
    public boolean updateCliente(Cliente c, String cpf){
        int r = 0;
        try{
            String sql = "UPDATE cliente SET cpf = ?, nome = ?, telefone = ?, email = ? WHERE cpf = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getCpf());
            p.setString(2, c.getNome());
            p.setString(3, c.getTelefone());
            p.setString(4, c.getEmail());
            p.setString(5, cpf);
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
    
    public void pequisarCliente(Cliente c){

        try{
            String sql = "SELECT nome, cpf, telefone, email FROM cliente WHERE cpf=?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getCpf());
            ResultSet rs = p.executeQuery();
            if(rs != null && rs.next()){
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setCpf(rs.getString("cpf"));
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherClienteArray(ArrayList<Cliente> array){
        Cliente c;
        try{
            String sql = "SELECT nome, cpf, telefone, email FROM cliente;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Cliente();
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setCpf(rs.getString("cpf"));
                array.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherClienteArray(ArrayList<Cliente> array, String Nome){
        Cliente c;
        try{
            String sql = "SELECT nome, cpf, telefone, email FROM cliente WHERE nome like '%"+Nome+"%';";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Cliente();
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setCpf(rs.getString("cpf"));
                array.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public boolean deletarCliente(Cliente c){
        int r = 0;
        try{
            String sql = "DELETE FROM cliente WHERE cpf=?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getCpf());
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
    
}
