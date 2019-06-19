package intercepting;

import intercepting.administrador.ProgramadorTasques;
import intercepting.clients.Wallet;
import intercepting.filtres.Credit;
import intercepting.target.BlockChain;
import intercepting.filtres.Autenticacio;

public final class App {

    public static void main(String[] args) {

        /**
         * Rick es mou per diferents realitats paraleles 
         * disparant la seva pistola de portals.
         * 
         * La pistola de portals de Rick necessita la autenticacio
         * de l'usuari com a propietari de la pistola abans de ser 
         * disparada i la comprobació de que l'usuari disposa de
         * acces a la realitat a la que preten accedir.
         * 
         * Filtres:
         *  - Autenticacio
         *  - Acces
         * 
         * Target:
         *  - Disparar
         * 
         * La pistola necessita una cadena de filtres
         * controlada per un administrador de filtres 
         * que posa la execucio del tret despres de 
         * chequear els filtres.
         * 
         */

        ProgramadorTasques programadorTasques = new ProgramadorTasques(new BlockChain());
        programadorTasques.setTasca(new Autenticacio());
        programadorTasques.setTasca(new Credit());

        Wallet wallet = new Wallet();
        wallet.setProgramadorTasques(programadorTasques);
        wallet.enviarPeticio("transferir BTC");
    }
}
