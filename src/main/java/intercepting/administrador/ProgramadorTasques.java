package intercepting.administrador;

import intercepting.administrador.Tasques;
import intercepting.filtres.Filtre;
import intercepting.target.Target;

public class ProgramadorTasques {

    private Tasques tasques = null; 

    public ProgramadorTasques(Target target) {
        tasques = new Tasques();
        tasques.setTarget(target);     
    }

    public Tasques getTasques() {
        return this.tasques;
    }

    public void setTasca(Filtre tasca) {
        getTasques().afegirTasca(tasca);
    }

    public void executarTasques(String peticio) {
        tasques.execucio(peticio);
    }
    
}