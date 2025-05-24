package Shared;

import java.io.Serializable;

public class Risposta implements Serializable {
    private String status; // "OK" o "ERRORE"
    private Object messaggio;

    public Risposta(String status, Object messaggio) {
        this.status = status;
        this.messaggio = messaggio;
    }

    public String getStatus() {
        return status;
    }

    public Object getMessaggio() {
        return messaggio;
    }
}
