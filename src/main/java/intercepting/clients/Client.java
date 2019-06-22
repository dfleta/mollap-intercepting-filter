package intercepting.clients;

import intercepting.administrador.ProgramadorTasques;

public interface Client {

    void setProgramadorTasques(ProgramadorTasques programador);

    void enviarPeticio(String peticio);
}