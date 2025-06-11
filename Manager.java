package Shared;
import java.io.Serializable;
import java.util.ArrayList;


public class Manager extends Utente implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Department> listaDipartimenti;
	
	// Costruttori
	    
    public Manager(int id, String nome, String cognome) {
    	super(id,nome,cognome);
    	listaDipartimenti=new ArrayList<Department>();
    }
    
    public Manager(int id,String nome,String cognome,String email) {
        super(id, nome, cognome, email); 
        listaDipartimenti=new ArrayList<Department>();
    }
    public Manager(int id,String nome,String cognome,String email,ArrayList<Department> listaDipartimenti) {
        super(id, nome, cognome, email); 
        setListaDipartimenti(listaDipartimenti);
    }
    // Metodi set e get
    
    public void setListaDipartimenti(ArrayList<Department> listaDipartimenti) {
    	this.listaDipartimenti=listaDipartimenti;
    }
    
    public ArrayList<Department> getListaDipartimenti() {
    	return listaDipartimenti;
    }
    
    
    /**
     * Metodo getRuolo: questo metodo restituisce un stringa che contiente il tipo di ruolo 
     * del utente sulla quale viene invocato. In questo caso restituisce una stringa "manager" 
     * */
    public String getRuolo(){
        return "manager";
    }
    // Metodo getInfo()
    
    public String getInfo(){
        String info = getCognome()+" "+getNome();
        return info;
    }

	@Override
	public int getIdDepartment() {
		// TODO Auto-generated method stub
		return 0;
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

}
