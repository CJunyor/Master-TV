package mastertv;

import Dados.CategoriaDAO;
import java.util.ArrayList;

public class Categoria {
    private String nome;
    private int id;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean addOnDb(){
        CategoriaDAO c = new CategoriaDAO();
        return(c.inserirCategoria(this));
    }
    
    public boolean updateOnDb(){
        CategoriaDAO c = new CategoriaDAO();
        return(c.updateCategoria(this));
    }
    
    public void getFromDB(){
        CategoriaDAO c = new CategoriaDAO();
        c.pequisarCategoria(this);
    }
    
    public boolean delOnDB(){
        CategoriaDAO c = new CategoriaDAO();
        return c.deletarCategoria(this);
    }
    
    public static ArrayList<Categoria> getAllFromDB(){
        CategoriaDAO c = new CategoriaDAO();
        ArrayList<Categoria> array = new ArrayList<>();
        c.preencherCategoriaArray(array);
        return array;
    }  

    public static ArrayList<Categoria> getAllFromDB(String Nome){
        CategoriaDAO c = new CategoriaDAO();
        ArrayList<Categoria> array = new ArrayList<>();
        c.preencherCategoriaArray(array, Nome);
        return array;
    } 
}
