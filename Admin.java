package Shared;

public class Admin extends Utente{

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
}
