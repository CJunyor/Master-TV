package mastertv;

import java.util.ArrayList;

public class PlanoTop extends Plano {
    
    public PlanoTop(ArrayList<Categoria> categorias) {
        super(categorias);
    }

    public float calcularMensalidade(ArrayList<Canal> a) {
        float soma;
        soma = 0;
        for(Canal c: a) soma+=c.getPreco();
        return(soma);
    }
    
}
