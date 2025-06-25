package Shared;

import java.io.Serializable;
import java.util.Random; // Classe neccessaria per generare una password casuale

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id,idCompany,idManager;
	private String nome,descrizione, password;
	
	// Costruttori
	
	public Department(String nome,String descrizione,int idCompany, int idManager) {
		id=-1;
		setNome(nome);
		setDescrizione(descrizione);
		setIdCompany(idCompany);
		setIdManager(idManager);
		setPassword();
	}
	
	public Department(int id,String nome,String descrizione,int idCompany, int idManager) {
		setId(id);
		setNome(nome);
		setDescrizione(descrizione);
		setIdCompany(idCompany);
		setIdManager(idManager);
		setPassword();
	}
	
	public Department(int id,String nome,String descrizione,int idCompany, int idManager,String password) {
		this(id,nome,descrizione,idCompany,idManager);
		setPassword(password);
	}
	
	// Metodi set e get
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	// Metodo per generare una password
	
	private String generaPassword(int lunghezza, Random random) {
		 StringBuilder sb = new StringBuilder(lunghezza);
	        for (int i = 0; i < lunghezza; i++) {
	            // Genera un numero casuale (0-9)
	            int numero = random.nextInt(10);
	            // Genera una lettera casuale (a-z)
	            char lettera = (char) ('a' + random.nextInt(26));
	            // Scelta casuale tra numero o lettera
	            if (random.nextBoolean()) {
	                sb.append(numero);
	            } else {
	                sb.append(lettera);
	            }
	        }
	        return sb.toString();
	}
	
	// Metodi set e get Password
	private void setPassword() {
		Random random = new Random();
		this.password=generaPassword(8,random);
	}
	
	private void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}


	// Metodi Set e get IDManager e IDCompany
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

	// Metodo Get info

	public String getInfo() {
		String info="Titolo: "+getNome()+"\nDescrizione: "+getDescrizione()+"\n";
		return info;
	}
}
	
