package intercepting.administrador;

import java.util.ArrayList;
import java.util.List;

import intercepting.filtres.Filtre;
import intercepting.target.BlockChain;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();

    private BlockChain bc;

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
        this.bc.execucio(peticio);
    }
    
    public void setTarget(BlockChain bc){
        this.bc = bc;
    }    
}