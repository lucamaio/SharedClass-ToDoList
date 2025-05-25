package Shared;
import java.time.LocalDate; 

public class Manager implements Utente {
    private int id,id_company;
    private String cognome,nome,email;
    
    // costruttore
    public Manager(int id,String nome,String cognome,String email,int id_company) {
        setId(id);
        setNome(nome);
        setCognome(cognome);
        setEmail(email);
        setIdCompany(id_company);
    }
    

    // Metodi get
    public int getId() {
        return id;
    }

    // metodi Set
  
    private void setId(int id) {
        this.id = id;
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


	public int getIdCompany() {
		return id_company;
	}


	private void setIdCompany(int id_company) {
		this.id_company = id_company;
	}


	public String getEmail() {
		return email;
	}


	private void setEmail(String email) {
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setCognome(String cognome) {
		this.cognome=cognome;
	}
	
	public String getCognome() {
		return cognome;
	}

}
