package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mastertv.Canal;

public class CanalDAO {
    public boolean inserirCanal(Canal c){
        int r = 0;
        try{
            String sql = "INSERT INTO canal (nome, classificacao, catCanal, preco ) VALUES (?, ?, ?, ?);";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNome());
            p.setString(2, c.getClassificacaoEtaria());
            p.setInt(3, c.getCategoria());
            p.setFloat(4, c.getPreco());
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
    
    public boolean updateCanal(Canal c, int numero){
        int r = 0;
        try{
            String sql = "UPDATE canal SET nome = ?, classificacao = ?, catCanal = ? WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNome());
            p.setString(2, c.getClassificacaoEtaria());
            p.setInt(3, c.getCategoria());
            p.setInt(4, numero);
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
    
    public void pequisarCanal(Canal c){

        try{
            String sql = "SELECT * FROM canal WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, c.getNumero());
            ResultSet rs = p.executeQuery();
            if(rs != null && rs.next()){
                c.setNumero(rs.getInt("numero"));
                c.setNome(rs.getString("nome"));
                c.setClassificacaoEtaria(rs.getString("classificacao"));
                c.setCategoria(rs.getInt("catCanal"));
                c.setPreco(rs.getFloat("preco"));
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherCanalArray(ArrayList<Canal> canalArray){
        Canal c;
        try{
            String sql = "SELECT * FROM canal;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Canal();
                c.setNumero(rs.getInt("numero"));
                c.setNome(rs.getString("nome"));
                c.setClassificacaoEtaria(rs.getString("classificacao"));
                c.setCategoria(rs.getInt("catCanal"));
                c.setPreco(rs.getFloat("preco"));
                canalArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void preencherCanalArray(int catCanal, ArrayList<Canal> canalArray){
        Canal c;
        try{
            String sql = "SELECT * FROM canal WHERE catCanal = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, catCanal);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Canal();
                c.setNumero(rs.getInt("numero"));
                c.setNome(rs.getString("nome"));
                c.setClassificacaoEtaria(rs.getString("classificacao"));
                c.setCategoria(rs.getInt("catCanal"));
                c.setPreco(rs.getFloat("preco"));
                canalArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherCanalArray(ArrayList<Canal> canalArray, String Nome){
        Canal c;
        try{
            String sql = "SELECT * FROM canal WHERE Nome like '%"+Nome+"%';";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Canal();
                c.setNumero(rs.getInt("numero"));
                c.setNome(rs.getString("nome"));
                c.setClassificacaoEtaria(rs.getString("classificacao"));
                c.setCategoria(rs.getInt("catCanal"));
                c.setPreco(rs.getFloat("preco"));
                canalArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public boolean deletarCanal(Canal c){
        int r = 0;
        try{
            String sql = "DELETE FROM canal WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, c.getNumero());
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
