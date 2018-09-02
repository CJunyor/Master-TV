package mastertv;

import java.util.ArrayList;

public class PlanoRegular extends Plano{
    
    public PlanoRegular(ArrayList<Categoria> Categorias) {
        super(Categorias);
    }
    
    public float calcularMensalidade(ArrayList<Canal> a) {
        float soma;
        soma = 0;
        for(Canal c: a) soma+=c.getPreco();
        soma-=soma*0.2f;
        return(soma);
    }
}
