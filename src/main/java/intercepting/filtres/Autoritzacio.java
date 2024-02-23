package intercepting.filtres;

public class Autoritzacio implements Filtre {

    @Override
    public void execucio(String id) {
        System.out.println("Autorizacion OK para " + id.toString());
    }
}

