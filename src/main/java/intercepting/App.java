package intercepting;

import intercepting.administrador.ProgramadorTasques;
import intercepting.clients.Wallet;
import intercepting.filtres.Credit;
import intercepting.target.BlockChain;
import intercepting.filtres.Autenticacio;

public final class App {

    public static void main(String[] args) {

        ProgramadorTasques programadorTasques = new ProgramadorTasques(new BlockChain());
        programadorTasques.setTasca(new Autenticacio());
        programadorTasques.setTasca(new Credit());

        Wallet wallet = new Wallet();
        wallet.setProgramadorTasques(programadorTasques);
        wallet.enviarPeticio("transferir BTC");
    }
}
