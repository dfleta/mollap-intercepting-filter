package intercepting.filtres;

public class Autenticacio implements Filtre {

    @Override
    public void execucio(String id) {
        System.out.println("Autenticacion OK para " + id.toString());
    }
}