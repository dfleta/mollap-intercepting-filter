package intercepting.filtres;

public class Credit implements Filtre {

    @Override
    public void execucio(String peticio) {
        System.out.println("Credit suficient per a " + peticio.toString());
    }
}

