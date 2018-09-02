package mastertv;

import Dados.ChamadoDAO;
import java.util.ArrayList;

public class Chamado {
    private String motivo;
    private int protocolo;
    private String situacao;//A - Aberto | R- Em resolucao | C - Concluido
    private String data;
    private int contrato;
    private int idtecnicos;

    public Chamado() {
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getIdtecnicos() {
        return idtecnicos;
    }

    public void setIdtecnicos(int idtecnicos) {
        this.idtecnicos = idtecnicos;
    }
    
    public boolean addOnDb(){
        ChamadoDAO c = new ChamadoDAO();
        return(c.inserirChamado(this));
    }
    
    public boolean delOnDb(){
        ChamadoDAO c = new ChamadoDAO();
        return c.deletarChamado(this);
    }
    
    public boolean updateOnDb(){
        ChamadoDAO c = new ChamadoDAO();
        return(c.updateChamado(this));
    }
    
    public void getFromDB(){
        ChamadoDAO c = new ChamadoDAO();
        c.pequisarChamado(this);
    }

    public static ArrayList<Chamado> getAllFromDB(int contrato){
        ChamadoDAO c = new ChamadoDAO();
        ArrayList<Chamado> array = new ArrayList<>();
        c.preencherChamadoArray(array, contrato);
        return array;
    }
    
    public static ArrayList<Chamado> getAllFromDB(int contrato, String Prot){
        ChamadoDAO c = new ChamadoDAO();
        ArrayList<Chamado> array = new ArrayList<>();
        c.preencherChamadoArray(array, contrato, Prot);
        return array;
    }
}
