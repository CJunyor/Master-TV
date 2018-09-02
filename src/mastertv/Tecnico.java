package mastertv;

public class Tecnico extends Pessoa{
    private boolean ocupado;
    public Tecnico(String nome, String cpf) {
        super(nome, cpf);
        this.ocupado=false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
