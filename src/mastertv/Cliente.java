package mastertv;

import Dados.ClienteDAO;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String telefone, String email) {
        super(nome, cpf);
        this.telefone=telefone;
        this.email=email;
    }

    public Cliente(){
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean addOnDB(){
        ClienteDAO c = new ClienteDAO();
        return(c.inserirCliente(this));
    }
    
    public boolean updateOnDb(String cpf){
        ClienteDAO c = new ClienteDAO();
        return(c.updateCliente(this, cpf));
    }
    
    public void getFromDB(){
        ClienteDAO c = new ClienteDAO();
        c.pequisarCliente(this);
    }
    
    public boolean delOnDB(){
        ClienteDAO c = new ClienteDAO();
        return(c.deletarCliente(this));
    }
    
    public static ArrayList<Cliente> getAllFromDB(){
        ClienteDAO c = new ClienteDAO();
        ArrayList<Cliente> array = new ArrayList<>();
        c.preencherClienteArray(array);
        return array;
    }
    
    public static ArrayList<Cliente> getAllFromDB(String Nome){
        ClienteDAO c = new ClienteDAO();
        ArrayList<Cliente> array = new ArrayList<>();
        c.preencherClienteArray(array, Nome);
        return array;
    }
}
