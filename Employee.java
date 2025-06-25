package Shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Utente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	    
    // Constructor
    public Employee(int id,String nome,String cognome) {
    	super(id,nome,cognome);
    }
    public Employee(int id,String nome,String cognome,String email,int idDepartment) {
       super(id, nome, cognome, email,idDepartment); 
    }
   
	// metodo getRuolo
	
    @Override
    public String getRuolo(){
        return "employee";
    }

    // Metodo getInfo
    
    @Override
    public String getInfo(){
        String info=null;
        info=cognome+" "+nome;
        return info;
    }
}