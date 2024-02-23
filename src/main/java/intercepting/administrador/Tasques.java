package intercepting.administrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import intercepting.filtres.Filtre;
import intercepting.targets.Target;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();

    private Optional<Target> target;

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void afegirTasca(Filtre filtre) {
        getTasques().add(filtre);
    }

    public void execucio(String missatge) {
        getTasques().forEach(item -> item.execucio(missatge));
        if (getTarget().isPresent()) {
            getTarget().get().execucio(missatge);
        } else {
            // target sin añedir al sistema
        }
    }
}