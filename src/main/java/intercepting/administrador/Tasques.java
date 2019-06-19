package intercepting.administrador;

import java.util.ArrayList;
import java.util.List;

import intercepting.filtres.Filtre;
import intercepting.target.Target;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();

    private Target target;

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public void afegirTasca(Filtre filtre){
        getTasques().add(filtre);
    }

    public void execucio(String peticio) {

        for (Filtre filtre : tasques) {
            filtre.execucio(peticio);
        }
        this.target.execucio(peticio);
    }
    
    public void setTarget(Target target){
        this.target = target;
    }    
}