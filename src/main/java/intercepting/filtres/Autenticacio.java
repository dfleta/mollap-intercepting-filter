package intercepting.filtres;

public class Autenticacio implements Filtre {

    @Override
    public void execucio(String peticio) {
        System.out.println("Autenticacio OK per a " + peticio.toString());
    }
}