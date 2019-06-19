package intercepting.filtres;

public class Autoritzacio implements Filtre {

    @Override
    public void execucio(String peticio) {
        System.out.println("Autoritzacio OK per a " + peticio.toString());
    }
}

