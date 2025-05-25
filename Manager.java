package Shared;
import java.time.LocalDate; 

public class Manager extends Utente {
    private int id_company;
    
    // costruttore
    public Manager(int id,String nome,String cognome,String email,int id_company) {
        super(id, nome, cognome, email); 
        setIdCompany(id_company);
    }

    // metodo getRuolo
    public String getRuolo(){
        return "manger";
    }
    // Metodo assegna attivita

    public void assegnaAttivita(String titolo, String descrizione, LocalDate data_scadenza, Employee utente, TipoPriorita priorita){
        Attivita newAttivita= new Attivita(titolo, descrizione,data_scadenza, this, utente, priorita);
        utente.aggiungiAttività(newAttivita);
        System.out.println("Attività assegnata a " + utente.getCognome()+" "+utente.getNome());
    }
    public void visualizzaAttivita(){
        System.out.println("Da definire");
    }

    public String getInfo(){
        String info = null;
        info="Manager: "+getCognome()+" "+getNome()+"\n";
        return info;
    }


	private void setIdCompany(int id_company) {
		this.id_company = id_company;
	}

}
