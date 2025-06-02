package Shared;

import java.util.ArrayList;

public class Department {

	private int id,idCompany,idManager;
	private String nome,descrizione;
	private ArrayList<Employee> dipendenti;
	
	
	/**
	 * Costruttore
	 * */
	
	public Department(int id,String nome,String descrizione,int idCompany, int idManager) {
		setId(id);
		setNome(nome);
		setDescrizione(descrizione);
		setIdCompany(idCompany);
		dipendenti=new ArrayList<Employee>();
		setIdManager(idManager);
	}
	
	// Metodi set e get
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Employee> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(ArrayList<Employee> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	public void aggiungiEmployee(Employee employee) {
		dipendenti.add(employee);
	}
	
	public String getInfo() {
		String info="Titolo: "+getNome()+"\nDescrizione: "+getDescrizione()+"\n";
		return info;
	}
}
