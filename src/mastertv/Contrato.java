package mastertv;

import Dados.ContratoDAO;
import java.util.ArrayList;

public class Contrato {
    private String endereco;
    private String numeroContrato;
    private String cpf;
    private int categorias[];
    private int numeroReceptores;
    private float mensalidade;
    private boolean acesso;
    private int plano;

    public Contrato() {
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int[] getCategorias() {
        return categorias;
    }

    public void setCategorias(int[] categorias) {
        this.categorias = categorias;
    }

    public int getNumeroReceptores() {
        return numeroReceptores;
    }

    public void setNumeroReceptores(int numeroReceptores) {
        this.numeroReceptores = numeroReceptores;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean isAcesso() {
        return acesso;
    }

    public void setAcesso(boolean acesso) {
        this.acesso = acesso;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public void cortaAcesso(){
        this.setAcesso(false);
    }
    
    public void liberarAcesso(){
        this.setAcesso(true);
    }
    
    public boolean addOnDb(){
        ContratoDAO c = new ContratoDAO();
        return(c.inserirContrato(this) && c.inserirCatContrato(this));
    }
    
    public boolean delOnDb(){
        ContratoDAO c = new ContratoDAO();
        return c.deletarContrato(this);
    }
    
    public boolean updateOnDb(){
        ContratoDAO c = new ContratoDAO();
        return(c.deletarCatContrato(this) && c.updateContrato(this) && c.inserirCatContrato(this));
    }
    
    public boolean updateOnDb(int numero){
        ContratoDAO c = new ContratoDAO();
        return(c.updateContrato(this, numero));
    }
    
    public void getFromDB(){
        ContratoDAO c = new ContratoDAO();
        c.pequisarContrato(this);
    }
    
    public void getCatFromDB(){
        ContratoDAO c = new ContratoDAO();
        c.pequisarCatContrato(this);
    }
    
    public static ArrayList<Contrato> getAllFromDB(String cpf){
        ContratoDAO c = new ContratoDAO();
        ArrayList<Contrato> array = new ArrayList<>();
        c.preencherContratoArray(array, cpf);
        return array;
    }
    
    public static ArrayList<Contrato> getAllFromDB(String cpf, String Numero){
        ContratoDAO c = new ContratoDAO();
        ArrayList<Contrato> array = new ArrayList<>();
        c.preencherContratoArray(array, cpf, Numero);
        return array;
    }
}
