package Shared;

import java.io.Serializable;
import java.util.ArrayList;

public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome, descrizione, indirizzo, email, telefono;
	private Integer id;
	
	
	// Costruttore
	
	public Company(int id, String nome,String descrizione,String indirizzo,String email,String telefono) {
		setId(id);
		setNome(nome);
		setDescrizione(descrizione);
		setIndirizzo(indirizzo);
		setEmail(email);
		setTelefono(telefono);
	}
	
	
	// Metodi set e get
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	// Metodo getInfo()
	
	public String getInfo() {
		String str="Azienda: "+getNome()+"\n";
		str+="Descrizione: "+getDescrizione()+"\n";
		str+="Indirizzo: "+getIndirizzo()+"\n";
		str+="Email: "+getEmail()+"\n";
		str+="Telefono: "+getTelefono()+"\n";
		return str;
	}
	
}
