package mastertv;

import Dados.CanalDAO;
import java.util.ArrayList;

public class Canal {
    private String nome;
    private int numero;
    private float preco;
    private String classificacaoEtaria;
    private int categoria;

    public Canal(String nome, int numero, float preco, String classificacaoEtaria) {
        this.nome = nome;
        this.numero = numero;
        this.preco = preco;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public Canal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(String classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }
    
        public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public boolean addOnDb(){
        CanalDAO c = new CanalDAO();
        return(c.inserirCanal(this));
    }
    
    public boolean delOnDb(){
        CanalDAO c = new CanalDAO();
        return c.deletarCanal(this);
    }
    
    public boolean updateOnDb(int numero){
        CanalDAO c = new CanalDAO();
        return(c.updateCanal(this, numero));
    }
    
    public void getFromDB(){
        CanalDAO c = new CanalDAO();
        c.pequisarCanal(this);
    }
    
    public static ArrayList<Canal> getAllFromDB(){
        CanalDAO c = new CanalDAO();
        ArrayList<Canal> array = new ArrayList<>();
        c.preencherCanalArray(array);
        return array;
    }
    public static ArrayList<Canal> getAllFromDB(int catCanal){
        CanalDAO c = new CanalDAO();
        ArrayList<Canal> array = new ArrayList<>();
        c.preencherCanalArray(catCanal, array);
        return array;
    }
    
    public static ArrayList<Canal> getAllFromDB(String Nome){
        CanalDAO c = new CanalDAO();
        ArrayList<Canal> array = new ArrayList<>();
        c.preencherCanalArray(array, Nome);
        return array;
    }
    
    public static float getSumAllPreco(int catCanal){
        float soma = 0;
        ArrayList<Canal> array = Canal.getAllFromDB(catCanal);
        for(Canal c: array){
            soma+=c.getPreco();
        }
        return soma;
    }
}
