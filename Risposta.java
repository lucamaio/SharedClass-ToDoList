package Shared;

import java.io.Serializable;
//import java.util.ArrayList;
import java.util.HashMap;

public class Risposta implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
    
    // Qesta funzione restituisce se la chiave passata esiste
    public boolean verificaKey(String chiave) {
    	return parametri.containsKey(chiave);
    }
    
    public void stampaKeys() {
    	 for (String chiave : parametri.keySet()) {
             System.out.println(chiave);
         }
    }
    
    /*public void stampaDipendenti() {
    	ArrayList<Employee> employeeList = (ArrayList<Employee>) this.getParametro("dipendenti");
		String[] str = new String[employeeList.size() + 1];
        str[0] = "*";
		System.out.println("Lista dipendenti: " + employeeList);
    	for(Employee dipendente: employeeList) {
    	    System.out.println(dipendente); // override toString per più dettagli
    	}
    }*/
}
