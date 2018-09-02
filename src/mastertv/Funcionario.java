package mastertv;

import Dados.FuncionarioDAO;
import java.util.ArrayList;

public class Funcionario extends Pessoa{
    private String usuario;
    private String senha;
    private String cargo;
    private int permissao, idFuncionario;

    public Funcionario(String cargo, int permissao, String nome, String cpf) {
        super(nome, cpf);
        this.cargo = cargo;
        this.permissao = permissao;
    }

    public Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    
    public boolean addOnDb(){
        FuncionarioDAO f = new FuncionarioDAO();
        return(f.inserirFuncionario(this));
    }
    
    public boolean delOnDb(){
        FuncionarioDAO f = new FuncionarioDAO();
        return f.deletarFuncionario(this);
    }
    
    public boolean updateOnDb(String cpf){
        FuncionarioDAO f = new FuncionarioDAO();
        return(f.updateFuncionario(this, cpf));
    }
    
    public void getFromDB(){
        FuncionarioDAO f = new FuncionarioDAO();
        f.pequisarFuncionario(this);
    }
    
    public static ArrayList<Funcionario> getAllFromDB(){
        FuncionarioDAO f = new FuncionarioDAO();
        ArrayList<Funcionario> array = new ArrayList<>();
        f.preencherFuncionarioArray(array);
        return array;
    }
    
    public static ArrayList<Funcionario> getAllFromDB(String Nome){
        FuncionarioDAO f = new FuncionarioDAO();
        ArrayList<Funcionario> array = new ArrayList<>();
        f.preencherFuncionarioArray(array, Nome);
        return array;
    }
}
