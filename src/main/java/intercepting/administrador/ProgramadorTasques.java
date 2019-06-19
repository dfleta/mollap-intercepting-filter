package intercepting.administrador;

import intercepting.administrador.Tasques;
import intercepting.filtres.Filtre;
import intercepting.target.BlockChain;

public class ProgramadorTasques {

    private Tasques tasques = null; 

    public ProgramadorTasques(BlockChain blockChain) {
        tasques = new Tasques();
        tasques.setTarget(blockChain);     
    }

    public Tasques getTasques() {
        return this.tasques;
    }

    public void setTasca(Filtre tasca) {
        getTasques().afegirTasca(tasca);
    }

    public void peticioTasques(String peticio) {
        tasques.execucio(peticio);
    }
    
}