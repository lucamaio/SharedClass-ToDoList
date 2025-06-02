package Shared;

public class Director extends Utente {
	
	private int idCompany;
	
	public Director (int id, String nome,String cognome, int id_company) {
		super(id,nome,cognome);
		setIdCompany(id_company);
	}
	
	public Director(int id, String nome,String cognome,String email, int id_company) {
		this(id,nome,cognome,id_company);
		setEmail(email);
	}
	
	private void setIdCompany(int idCompany) {
		this.idCompany=idCompany;
	}
	
	 public int getIdCompany() {
	    	return idCompany;
	    }
	
	public String getRuolo() {
		return "director";
	}

    public String getInfo() {
    	String str=super.getCognome()+" "+super.getNome();
    	return str;
    }

}
