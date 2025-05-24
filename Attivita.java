package Shared;
import java.time.LocalDate;         // Importo le classi che mi consentono di operare sulle date
import java.time.LocalDateTime;

public class Attivita {

    // Dichiarazione variabili della classe
    private String titolo, descrizione;
    private int id;
    private LocalDate dataScadenza;
    private LocalDateTime dataCreazione;
    private StatoAttivita stato;
    private TipoPriorita priorita;

    private Manager maneger;
    private Employee user;

    // Costruttori

    public Attivita(String titolo, String descrizione,LocalDate dataScadenza, Manager maneger, Employee user) {
        setId();
        setDataCreazione();
        setTitolo(titolo);
        setDescrizione(descrizione);
        setDataScadenza(dataScadenza);
        setManeger(maneger);
        setUser(user);
        setTipoPriorita();
        this.stato.valueOf("DA FARE");
    }

    public Attivita(String titolo, String descrizione,LocalDate dataScadenza, Manager maneger, Employee user, TipoPriorita priorita) {
        this(titolo,descrizione,dataScadenza,maneger,user);
        setTipoPriorita(priorita);
    }

    public Attivita(int id, String titolo, String descrizione, LocalDate dataScadenza, Manager maneger, Employee user) {
        this(titolo,descrizione,dataScadenza,maneger,user);
        setId(id);
    }

    public Attivita(int id, String titolo, String descrizione, LocalDate dataScadenza, Manager maneger, Employee user, TipoPriorita priorita) {
        this(titolo,descrizione,dataScadenza,maneger,user,priorita);
        setId(id);
    }

    // Metodi Get e set
     private void setTipoPriorita() {
        this.priorita=this.priorita.valueOf("NESSUNA");
    }

    private void setTipoPriorita(TipoPriorita priorita) {
        this.priorita=priorita;
    }

    public TipoPriorita getPriorita(){
        return priorita;
    }

    private String getTitolo() {
        return titolo;
    }

    private void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    private String getDescrizione() {
        return descrizione;
    }

    private void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    private int getId() {
        return id;
    }

    private void setId(){
        this.id=1;
    }

    private void setId(int id) {
        this.id = id;
    }


    private LocalDate getDataScadenza() {
        return dataScadenza;
    }

    private void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    private LocalDateTime getDataCreazione() {
        return dataCreazione;
    }

    private void setDataCreazione() {
        this.dataCreazione = LocalDateTime.now();
    }
    
    private void setManeger(Manager maneger){
        this.maneger=maneger;
    }

    public Manager getManeger(){
        return maneger;
    }

    private void setUser(Employee user){
        this.user=user;
    }

    public Employee getUser(){
        return user;
    }

    public void setStato(StatoAttivita stato){
        this.stato=stato;
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
        info+=maneger.getInfo();
        return info;
    }
}
