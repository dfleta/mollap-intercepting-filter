package intercepting.administrador;

import java.util.ArrayList;
import java.util.List;

import intercepting.filtres.Filtre;
import intercepting.targets.Target;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();

    private Target target;

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public Target getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void afegirTasca(Filtre filtre) {
        getTasques().add(filtre);
    }

    public void execucio(String missatge) {
        getTasques().forEach(item -> item.execucio(missatge));
        getTarget().execucio(missatge);
    }
}