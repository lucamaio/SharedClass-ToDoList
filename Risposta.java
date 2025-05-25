package Shared;

import java.io.Serializable;
import java.util.HashMap;

public class Risposta implements Serializable {
    private String status; // "OK" o "ERRORE"
    private Object messaggio;
    private HashMap<String, Object> parametri;

    public Risposta(String status, Object messaggio) {
        this.status = status;
        this.messaggio = messaggio;
        this.parametri = new HashMap<>();
    }

    public String getStatus() {
        return status;
    }

    public Object getMessaggio() {
        return messaggio;
    }
    
    public void aggiungiParametro(String chiave, Object valore) {
        parametri.put(chiave, valore);
    }

    public Object getParametro(String chiave) {
        return parametri.get(chiave);
    }
}
