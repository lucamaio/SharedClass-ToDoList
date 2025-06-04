package Shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Utente implements Serializable{
	
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idDepartment;
    private List<Attivita> listaAttività = new ArrayList<>();
    

    // Constructor
    public Employee(int id,String nome,String cognome) {
    	super(id,nome,cognome);
    }
    public Employee(int id,String nome,String cognome,String email,int idDepartment) {
       super(id, nome, cognome, email); 
       setIdDepartment(idDepartment);
    }
   

    // Metodi get e set

    public void aggiungiAttività(Attivita a) {
        listaAttività.add(a);
    }


    public void stampaAttivita(){
        Attivita attivita=null;

        for(int i=0; i<listaAttività.size();i++){
            attivita=listaAttività.get(i);
            //System.out.println(attivita.getInfo());
        }
    }
    
    /**
     * Metodo che mi restituisce l'id del dipartimento dove lavora l'employee
     * @return int
     */


	private void setIdDepartment (int idDepartment) {
		this.idDepartment = idDepartment;
	}

	// metodo getRuolo
	
    @Override
    public String getRuolo(){
        return "employee";
    }
    
    @Override
    public String getInfo(){
        String info=null;
        info=cognome+" "+nome;
        return info;
    }
	@Override
	public int getIdDepartment() {
		// TODO Auto-generated method stub
		return idDepartment;
	}
}