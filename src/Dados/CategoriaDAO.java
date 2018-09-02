package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mastertv.Categoria;

public class CategoriaDAO {
    public boolean inserirCategoria(Categoria c){
        int r = 0;
        try{
            String sql = "INSERT INTO categoria (nome) VALUES (?);";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNome());
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
    
    public boolean updateCategoria(Categoria c){
        int r = 0;
        try{
            String sql = "UPDATE categoria SET nome = ? WHERE idcategoria = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNome());
            p.setInt(2, c.getId());
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
    
    public void pequisarCategoria(Categoria c){
        
        try{
            String sql;
            Connection conn = ConnectionFactory.getConnection();
            if(c.getNome() == null){
                sql = "SELECT nome FROM categoria WHERE idcategoria = ?;";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setInt(1, c.getId());
                ResultSet rs = p.executeQuery();
                if(rs != null && rs.next()) c.setNome(rs.getString("nome"));
                ConnectionFactory.closeConnection(conn, p, rs);
            }
            else{
                sql = "SELECT idcategoria FROM categoria WHERE nome = ?;";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, c.getNome());
                ResultSet rs = p.executeQuery();
                if(rs != null && rs.next()) c.setId(rs.getInt("idcategoria"));
                ConnectionFactory.closeConnection(conn, p, rs);
            }
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherCategoriaArray(ArrayList<Categoria> categoriaArray){
        Categoria c;
        try{
            String sql = "SELECT nome, idcategoria FROM categoria;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Categoria();
                c.setNome(rs.getString("nome"));
                c.setId(rs.getInt("idcategoria"));
                categoriaArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherCategoriaArray(ArrayList<Categoria> categoriaArray, String Nome){
        Categoria c;
        try{
            String sql = "SELECT nome FROM categoria where nome like '%"+Nome + "%';";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Categoria();
                c.setNome(rs.getString("nome"));
                categoriaArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public boolean deletarCategoria(Categoria c){
        int r = 0;
        try{
            String sql = "DELETE FROM categoria WHERE idcategoria = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, c.getId());
            r = p.executeUpdate();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        finally{
            return(r!=0);
        }
    }
}
