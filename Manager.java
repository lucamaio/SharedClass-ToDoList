package Shared;
import java.time.LocalDate; 

public class Manager implements Utente {
    private int id;
    private String username;

    // costruttore
    public Manager(String username) {
        setId();
        setUsername(username);
    }
    

    // Metodi get
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    // metodi Set
    private void setId(){
        this.id=0;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    // metodo getRuolo
    public String getRuolo(){
        return "manger";
    }
    // Metodo assegna attivita

    public void assegnaAttivita(String titolo, String descrizione, LocalDate data_scadenza, Employee utente, TipoPriorita priorita){
        Attivita newAttivita= new Attivita(titolo, descrizione,data_scadenza, this, utente, priorita);
        utente.aggiungiAttività(newAttivita);
        System.out.println("Attività assegnata a " + utente.getUsername());
    }
    public void visualizzaAttivita(){
        System.out.println("Da definire");
    }

    public String getInfo(){
        String info = null;
        info="Manager: "+getUsername()+"\n";
        return info;
    }
}
