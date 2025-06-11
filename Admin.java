package Shared;

import java.io.Serializable;

public class Admin extends Utente implements Serializable{

   
	private static final long serialVersionUID = 1L;
	public Admin(int id,String nome,String cognome,String email){
        super(id, nome, cognome, email); 
    }

    public String getRuolo(){
        return "admin";
    }

    public String getInfo(){
        String info;
        info="Username: "+cognome+" "+nome+"\n";
        return info;
    }

    public void visualizzaAttivita(){
        System.out.println("Da definire");
    }
    public int getIdCompany() {
    	return -1;
    }

	@Override
	public int getIdDepartment() {
		// TODO Auto-generated method stub
		return 0;
	}
}
