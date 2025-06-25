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

    // Metodi set e get Lista Dipartimenti
    
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

}
