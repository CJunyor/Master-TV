package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mastertv.Funcionario;

public class FuncionarioDAO {
    public boolean inserirFuncionario(Funcionario f){
        int r = 0;
        try{
            String sql = "INSERT INTO funcionario (nome, cpf, cargo, permissao, senha, usuario) VALUES (?, ?, ?, ?, ?, ?);";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, f.getNome());
            p.setString(2, f.getCpf());
            p.setString(3, f.getCargo());
            p.setInt(4, f.getPermissao());
            p.setString(5, f.getSenha());
            p.setString(6, f.getUsuario());
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
    
    public boolean updateFuncionario(Funcionario f, String cpf){
        int r = 0;
        try{
            String sql = "UPDATE funcionario SET nome = ?, cpf = ?, cargo = ?, permissao = ?, senha = ?, usuario = ? WHERE cpf = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, f.getNome());
            p.setString(2, f.getCpf());
            p.setString(3, f.getCargo());
            p.setInt(4, f.getPermissao());
            p.setString(5, f.getSenha());
            p.setString(6, f.getUsuario());
            p.setString(7, cpf);
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
    
    public void pequisarFuncionario(Funcionario f){
        try{
            String sql;
            if(f.getUsuario() != null) sql = "SELECT * FROM funcionario WHERE usuario = ?;";
            else sql = "SELECT * FROM funcionario WHERE idfuncionario = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            if(f.getUsuario() != null) p.setString(1, f.getUsuario());
            else p.setInt(1, f.getIdFuncionario());
            ResultSet rs = p.executeQuery();
            if(rs != null && rs.next()){
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setCargo(rs.getString("cargo"));
                f.setPermissao(rs.getInt("permissao"));
                f.setIdFuncionario(rs.getInt("idfuncionario"));
                f.setSenha(rs.getString("senha"));
                f.setUsuario(rs.getString("usuario"));
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherFuncionarioArray(ArrayList<Funcionario> funcionarioArray){
        Funcionario f;
        try{
            String sql = "SELECT * FROM Funcionario;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                f = new Funcionario();
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setCargo(rs.getString("cargo"));
                f.setPermissao(rs.getInt("permissao"));
                f.setIdFuncionario(rs.getInt("idfuncionario"));
                f.setUsuario(rs.getString("usuario"));
                funcionarioArray.add(f);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherFuncionarioArray(ArrayList<Funcionario> funcionarioArray, String Nome){
        Funcionario f;
        try{
            String sql = "SELECT * FROM Funcionario WHERE nome LIKE '%"+Nome+"%';";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                f = new Funcionario();
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setCargo(rs.getString("cargo"));
                f.setPermissao(rs.getInt("permissao"));
                f.setIdFuncionario(rs.getInt("idfuncionario"));
                f.setUsuario(rs.getString("usuario"));
                funcionarioArray.add(f);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public boolean deletarFuncionario(Funcionario f){
        int r = 0;
        try{
            String sql = "DELETE FROM funcionario WHERE usuario = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, f.getUsuario());
            r = p.executeUpdate();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }finally{
            return (r>0);
        }
    }
}
