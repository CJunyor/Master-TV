package mastertv;

import Dados.PagamentoDAO;
import java.util.ArrayList;
import java.util.Date;

public class Pagamento {
    private int numeroContrato;
    private float valor;
    private String data;
    private boolean pago;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    public boolean addOnDb(){
        PagamentoDAO pg = new PagamentoDAO();
        return(pg.inserirPagamento(this));
    }
    
    public boolean delOnDb(){
        PagamentoDAO pg = new PagamentoDAO();
        return pg.deletarPagamento(this);
    }
    
    public boolean updateOnDb(){
        PagamentoDAO pg = new PagamentoDAO();
        return(pg.updatePagamento(this));
    }
    
    public void getFromDB(){
        PagamentoDAO pg = new PagamentoDAO();
        pg.pequisarPagamento(this);
    }
    
    public static ArrayList<Pagamento> getAllFromDB(int numeroContrato){
        PagamentoDAO pg = new PagamentoDAO();
        ArrayList<Pagamento> array = new ArrayList<>();
        pg.preencherPagamentoArray(array, numeroContrato);
        return array;
    }
    
    public static ArrayList<Pagamento> getAllFromDB(int numeroContrato, String Data){
        PagamentoDAO pg = new PagamentoDAO();
        ArrayList<Pagamento> array = new ArrayList<>();
        pg.preencherPagamentoArray(array, numeroContrato, Data);
        return array;
    }
}
