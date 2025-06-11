package Shared;

import java.io.Serializable;

public class Director extends Utente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idCompany;
	
	public Director (Integer id, String nome,String cognome, Integer id_company) {
		super(id,nome,cognome);
		setIdCompany(id_company);
	}
	
	public Director(Integer id, String nome,String cognome,String email, Integer id_company) {
		this(id,nome,cognome,id_company);
		setEmail(email);
	}
	
	private void setIdCompany(Integer idCompany) {
		this.idCompany=idCompany;
	}
	
	 public Integer getIdCompany() {
	    	return idCompany;
	    }
	
	public String getRuolo() {
		return "director";
	}

    public String getInfo() {
    	String str=super.getCognome()+" "+super.getNome();
    	return str;
    }

	@Override
	public int getIdDepartment() {
		// TODO Auto-generated method stub
		return 0;
	}

}
