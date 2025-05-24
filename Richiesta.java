package Shared;

import java.io.Serializable;
import java.util.HashMap;

public class Richiesta implements Serializable {
    private String tipo;
    private HashMap<String, Object> parametri;

    public Richiesta(String tipo) {
        this.tipo = tipo;
        this.parametri = new HashMap<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void aggiungiParametro(String chiave, Object valore) {
        parametri.put(chiave, valore);
    }

    public Object getParametro(String chiave) {
        return parametri.get(chiave);
    }
}
