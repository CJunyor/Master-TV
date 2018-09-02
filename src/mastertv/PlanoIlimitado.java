package mastertv;

import java.util.ArrayList;

public class PlanoIlimitado extends Plano {
    
    private static final float MENSALIDADE = 500;
    
    public PlanoIlimitado(ArrayList<Categoria> Categorias) {
        super(Categorias);
    }

    public static float calcularMensalidade(){
        return PlanoIlimitado.MENSALIDADE;
    }
    
    
    
}
