package Shared;
import java.io.Serializable;


public class Manager extends Utente implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    
    public Manager(int id, String nome, String cognome) {
    	super(id,nome,cognome);
    }
    
    // costruttore
    public Manager(int id,String nome,String cognome,String email) {
        super(id, nome, cognome, email); 
    }

    // metodo getRuolo
    public String getRuolo(){
        return "manager";
    }
    // Metodo assegna attivita
    /*
    public void assegnaAttivita(String titolo, String descrizione, LocalDate data_scadenza, Employee utente, TipoPriorita priorita){
        Attivita newAttivita= new Attivita(titolo, descrizione,data_scadenza, this, utente, priorita);
        utente.aggiungiAttività(newAttivita);
        System.out.println("Attività assegnata a " + utente.getCognome()+" "+utente.getNome());
    }
    
    public void visualizzaAttivita(){
        System.out.println("Da definire");
    }*/

    public String getInfo(){
        String info = getCognome()+" "+getNome();
        return info;
    }

}
