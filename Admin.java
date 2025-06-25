package Shared;

import java.io.Serializable;

public class Admin extends Utente implements Serializable{

   
	private static final long serialVersionUID = 1L;

    // Costruttore

	public Admin(int id,String nome,String cognome,String email){
        super(id, nome, cognome, email); 
    }

    // Metodo Get Ruolo

    public String getRuolo(){
        return "admin";
    }

    // Metodo getInfo
    public String getInfo(){
        String info;
        info=super.cognome+" "+super.nome+"\n";
        return info;
    }

}
