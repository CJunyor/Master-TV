package mastertv;

import java.util.ArrayList;

public abstract class Plano {
    protected ArrayList<Categoria> categorias;
    
    public Plano(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Plano() {
    }
     
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> Categorias) {
        this.categorias = Categorias;
    }
    
    public static String getPlano(int idPlano){
        if(idPlano == 1) return "Top";
        else if(idPlano == 2) return "Regular";
        else if(idPlano == 3) return "Ilimitado";
        return null;
    }
}
