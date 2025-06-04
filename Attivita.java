package Shared;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Attivita implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Dichiarazione variabili della classe
    private String titolo, descrizione, dataScadenza, nominativoEmplyee,departmentName;
    private int id;
    private LocalDateTime dataCreazione;
    private StatoAttivita stato;
    private TipoPriorita priorita;
    
    private Integer idManager, idEmployee, idDepartment;

    // Costruttori
    
    
	public Attivita(int id,String titolo, String descrizione,String scadenza, Integer idManager, Integer idEmployee, Integer idDepartment) {
    	setId(id);
    	setTitolo(titolo);
    	setDescrizione(descrizione);
    	setDataScadenza(scadenza);
    	setTipoPriorita();
    	setStato();
    	setDataCreazione();	
    	setIdManager(idManager);
    	setIdEmployee(idEmployee);
    	setIdDepartment(idDepartment);
    	setNominativoEmployee();
    }
    
    public Attivita(int id,String titolo, String descrizione,String scadenza, Integer idManager, Integer idEmployee,Integer idDepartment, TipoPriorita priorita) {
    	this(id,titolo,descrizione,scadenza,idManager,idEmployee,idDepartment);
    	setTipoPriorita(priorita);
    }
    
    public Attivita(int id,String titolo, String descrizione,String scadenza, Integer idManager, Integer idEmployee,Integer idDepartment, TipoPriorita priorita, StatoAttivita stato) {
    	this(id,titolo,descrizione,scadenza,idManager,idEmployee,idDepartment,priorita);
    	setStato(stato);
    }
    
    public Attivita(int id,String titolo, String descrizione,String scadenza, Integer idManager, Integer idEmployee,Integer idDepartment, TipoPriorita priorita, StatoAttivita stato, LocalDateTime dataCreazione) {
    	this(id,titolo,descrizione,scadenza,idManager,idEmployee,idDepartment,priorita);
    	setStato(stato);
    	setDataCreazione(dataCreazione);
    }
    
    
    public Attivita(String titolo, String descrizione, String scadenza,TipoPriorita priorita, Integer idManager,String nominativoEmplyee, String department_name) {
    	setId();
    	setDataCreazione();	
    	setTitolo(titolo);
    	setDescrizione(descrizione);
    	setDataScadenza(scadenza);
    	setTipoPriorita(priorita);
    	setStato();
    	setIdManager(idManager);
    	setNominativoEmployee(nominativoEmplyee);
    	setDepartmentName(department_name);
    }
    
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

    private void setId() {
		this.id=-1;		
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
    
    private void setDataCreazione(LocalDateTime data) {
        this.dataCreazione = data;
    }
        
    private void setStato(StatoAttivita stato){
        this.stato=stato;
    }
    
    private void setStato() {
    	 StatoAttivita.valueOf("DA_FARE");
    }
    
    public StatoAttivita getStato(){
        return stato;
    }

    public Integer getIdEmployee() {
		return idEmployee;
	}

	private void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public Integer getIdManager() {
		return idManager;
	}

	private void setIdManager(Integer idManager) {
		this.idManager = idManager;
	}
	
	public Integer getIdDepartment() {
		return idDepartment;
	}
	
	private void setIdDepartment(Integer idDepartment) {
		this.idDepartment=idDepartment;
	}
	
	private void setNominativoEmployee() {
		this.nominativoEmplyee=null;
	}
	private void setNominativoEmployee(String nominativo) {
		this.nominativoEmplyee=nominativo;
	}
	public String getNominativoEmployee() {
		return nominativoEmplyee;
	}
	
	private void setDepartmentName(String department_name) {
		this.departmentName=department_name;
	}
	public String getdepartmentName() {
		return departmentName;
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
}