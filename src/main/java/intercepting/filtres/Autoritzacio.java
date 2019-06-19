package intercepting.filtres;

public class Autoritzacio implements Filtre {

    @Override
    public void execucio(String id) {
        System.out.println("Autoritzacio OK per a " + id.toString());
    }
}

