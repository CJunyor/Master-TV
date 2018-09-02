package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mastertv.Contrato;

public class ContratoDAO {
    
    public boolean inserirContrato(Contrato c){
        int r = 0;
        try{
            String sql = "INSERT INTO contrato (receptores, endereco, cpf, plano, preco, acesso) VALUES (?, ?, ?, ?, ?, ?);";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, c.getNumeroReceptores());
            p.setString(2, c.getEndereco());
            p.setString(3, c.getCpf());
            p.setInt(4, c.getPlano());
            p.setFloat(5, c.getMensalidade());
            p.setBoolean(6, true);
            r = p.executeUpdate();
            String sql2 = "SELECT LAST_INSERT_ID() as ID;";
            p = conn.prepareStatement(sql2);
            ResultSet rs = p.executeQuery();
            if(rs.next()) c.setNumeroContrato(rs.getString("ID"));
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }  
        finally{
            return (r>0);
        }
    }
    
    public boolean inserirCatContrato(Contrato c){
        int r = 0;
        try{
            String sql;
            if(c.getCategorias() != null){
                if(c.getCategorias().length == 3)
                    sql = "INSERT INTO categoriacontrato (nrContrato, idCategoria) VALUES (?, ?), (?, ?), (?, ?);";
                else
                    sql = "INSERT INTO categoriacontrato (nrContrato, idCategoria) VALUES (?, ?), (?, ?);";
            } 
            else {
                r=1;
                return true;
            }
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, Integer.parseInt(c.getNumeroContrato()));
            p.setInt(2, c.getCategorias()[0]);
            p.setInt(3, Integer.parseInt(c.getNumeroContrato()));
            p.setInt(4, c.getCategorias()[1]);
            if(c.getCategorias().length == 3){
                p.setInt(5, Integer.parseInt(c.getNumeroContrato()));
                p.setInt(6, c.getCategorias()[2]);
            }
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
    
    public boolean updateContrato(Contrato c){
        int r = 0;
        try{
            String sql = "UPDATE contrato SET receptores = ?, endereco = ?, plano = ?, preco = ? WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, c.getNumeroReceptores());
            p.setString(2, c.getEndereco());
            p.setInt(3, c.getPlano());
            p.setFloat(4, c.getMensalidade());
            p.setString(5, c.getNumeroContrato());
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
    
    public boolean updateContrato(Contrato c,int numero){
        int r = 0;
        try{
            String sql = "UPDATE contrato SET acesso = ? WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setBoolean(1, c.isAcesso());
            p.setInt(2, numero);
            r = p.executeUpdate();
            ConnectionFactory.closeConnection(conn, p);
            return (r>0);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        } 
        finally{
            return (r>0);
        }
    }
    
    public void pequisarContrato(Contrato c){
        try{
            String sql = "SELECT * FROM contrato WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNumeroContrato());
            ResultSet rs = p.executeQuery();
            if(rs != null && rs.next()){
                c.setNumeroContrato(Integer.toString(rs.getInt("numero")));
                c.setNumeroReceptores(rs.getInt("receptores"));
                c.setEndereco(rs.getString("endereco"));
                c.setCpf(rs.getString("cpf"));
                c.setPlano(rs.getInt("plano"));
                c.setMensalidade(rs.getFloat("preco"));
                c.setAcesso(rs.getBoolean("acesso"));
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void pequisarCatContrato(Contrato c){
        try{
            String sql = "SELECT idCategoria FROM categoriacontrato WHERE nrContrato = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNumeroContrato());
            ResultSet rs = p.executeQuery();
            if(rs != null){
                if(c.getPlano() == 1) c.setCategorias(new int[2]);
                else c.setCategorias(new int[3]);
                while(rs.next()) c.getCategorias()[rs.getRow()-1] = rs.getInt(1);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherContratoArray(ArrayList<Contrato> contratoArray, String cpf){
        Contrato c;
        try{
            String sql = "SELECT * FROM Contrato WHERE cpf = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, cpf);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Contrato();
                c.setNumeroContrato(Integer.toString(rs.getInt("numero")));
                c.setNumeroReceptores(rs.getInt("receptores"));
                c.setEndereco(rs.getString("endereco"));
                c.setCpf(rs.getString("cpf"));
                c.setPlano(rs.getInt("plano"));
                c.setMensalidade(rs.getFloat("preco"));
                c.setAcesso(rs.getBoolean("acesso"));
                contratoArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void preencherContratoArray(ArrayList<Contrato> contratoArray, String cpf, String Numero){
        Contrato c;
        try{
            String sql = "SELECT * FROM Contrato WHERE cpf = ? AND numero LIKE '%"+Numero+"%';";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, cpf);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                c = new Contrato();
                c.setNumeroContrato(Integer.toString(rs.getInt("numero")));
                c.setNumeroReceptores(rs.getInt("receptores"));
                c.setEndereco(rs.getString("endereco"));
                c.setCpf(rs.getString("cpf"));
                c.setPlano(rs.getInt("plano"));
                c.setMensalidade(rs.getFloat("preco"));
                c.setAcesso(rs.getBoolean("acesso"));
                contratoArray.add(c);
            }
            ConnectionFactory.closeConnection(conn, p, rs);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public boolean deletarContrato(Contrato c){
        int r = 0;
        try{
            String sql = "DELETE FROM contrato WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNumeroContrato());
            r = p.executeUpdate();
            return(r==0);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        finally{
            return (r>0);
        }
    }
    
    public boolean deletarCatContrato(Contrato c){
        int r = 0;
        try{
            String sql = "SELECT plano FROM contrato WHERE numero = ?;";
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, c.getNumeroContrato());
            ResultSet rs = p.executeQuery();
            if(rs != null && rs.next()){
                if(rs.getInt("plano") == 3) return true;
                else{
                    sql = "DELETE FROM categoriacontrato WHERE nrContrato = ?;";
                    p = conn.prepareStatement(sql);
                    p.setString(1, c.getNumeroContrato());
                    r = p.executeUpdate();
                    return (r != 0);
                }
            }
            else return false;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        finally{
            return (r>0);
        }
    }
}
