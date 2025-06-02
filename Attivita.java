package Shared;
import java.io.Serializable;
import java.time.LocalDate;         // Importo le classi che mi consentono di operare sulle date
import java.time.LocalDateTime;

public class Attivita implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Dichiarazione variabili della classe
    private String titolo, descrizione;
    private int id;
    private String dataScadenza;
    private LocalDateTime dataCreazione;
    private StatoAttivita stato;
    private TipoPriorita priorita;

    //private Manager maneger;
    //private Employee user;
    
    private int idManager, idEmployee;

    // Costruttori
    
    public Attivita(int id,String titolo, String descrizione,String scadenza, int idManager, int idEmployee) {
    	setId(id);
    	setTitolo(titolo);
    	setDescrizione(descrizione);
    	setDataScadenza(scadenza);
    	setTipoPriorita();
    	setStato();
    	setDataCreazione();	
    	setIdManager(idManager);
    	setIdEmployee(idEmployee);
    }
    
    public Attivita(int id,String titolo, String descrizione,String scadenza, int idManager, int idEmployee,TipoPriorita priorita) {
    	this(id,titolo,descrizione,scadenza,idManager,idEmployee);
    	setTipoPriorita(priorita);
    }
    
    public Attivita(int id,String titolo, String descrizione,String scadenza, int idManager, int idEmployee,TipoPriorita priorita, StatoAttivita stato) {
    	this(id,titolo,descrizione,scadenza,idManager,idEmployee,priorita);
    	setStato(stato);
    }

    /*public Attivita(String titolo, String descrizione,LocalDate dataScadenza2, Manager maneger2, Employee user2) {
        setId();
        setDataCreazione();
        setTitolo(titolo);
        setDescrizione(descrizione);
        c(dataScadenza2);
        setManeger(maneger2);
        setUser(user2);
        setTipoPriorita();
        this.stato.valueOf("DA FARE");
    }

    public Attivita(String titolo, String descrizione,String scadenza, int idManager, int idEmployee, TipoPriorita priorita) {
        this(titolo,descrizione,scadenza,idManager,idEmployee);
        setTipoPriorita(priorita);
    }

    public Attivita(int id, String titolo, String descrizione, LocalDate dataScadenza, Manager maneger, Employee user) {
        this(titolo,descrizione,dataScadenza,maneger,user);
        setId(id);
    }

    public Attivita(int id, String titolo, String descrizione, String scadenza, int idManager, int idEmployee, TipoPriorita priorita) {
        this(titolo,descrizione,scadenza,idManager,idEmployee,priorita);
        setId(id);
    }*/

    // Metodi Get e set
    private void setTipoPriorita() {
        this.priorita=TipoPriorita.valueOf("NESSUNA");
    }

    private void setTipoPriorita(TipoPriorita priorita) {
        this.priorita=priorita;
    }

    public TipoPriorita getPriorita(){
        return priorita;
    }

    public String getTitolo() {
        return titolo;
    }

    private void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    private void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }


    public String getDataScadenza() {
        return dataScadenza;
    }

    private void setDataScadenza(String scadenza) {
        this.dataScadenza = scadenza;
    }

    public LocalDateTime getDataCreazione() {
        return dataCreazione;
    }

    private void setDataCreazione() {
        this.dataCreazione = LocalDateTime.now();
    }
        
    private void setStato(StatoAttivita stato){
        this.stato=stato;
    }
    
    private void setStato() {
    	 this.stato.valueOf("DA_FARE");
    }
    public StatoAttivita getStato(){
        return stato;
    }

    public String getInfo(){
        String info="Attività numero: "+this.getId()+" Data Creazione: "+this.getDataCreazione()+"\n";
        info+="Titolo: "+this.getTitolo()+"\n";
        info+="Descrizione: "+this.getDescrizione()+"\n";
        info+="Data Scadenza: "+this.getDataScadenza()+"\n";
        info+="Stato: "+getStato()+"\n";
        info+="Priorità: "+getPriorita()+"\n";
        return info;
    }

    public int getIdEmployee() {
		return idEmployee;
	}

	private void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public int getIdManager() {
		return idManager;
	}

	private void setIdManager(int idManager) {
		this.idManager = idManager;
	}
}
