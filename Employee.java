package Shared;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Utente{
    
    private int id, IdCompany;
    private String nome,cognome,email;
    private List<Attivita> listaAttività = new ArrayList<>();

    // Constructor
    public Employee(int id,String nome,String cognome,String email,int IdCompany) {
        setId(id);
        setNome(nome);
        setCognome(cognome);
        setEmail(email);
        setIdCompany(IdCompany);
    }
   

    // Metodi get e set

    public int getId() {
        return id;
    }


    private void setId(int id) {
        this.id = id;
    }


    public void aggiungiAttività(Attivita a) {
        listaAttività.add(a);
    }

    public void visualizzaAttivita(){
        System.out.println("Da definire");
    }
    public void stampaAttivita(){
        Attivita attivita=null;

        for(int i=0; i<listaAttività.size();i++){
            attivita=listaAttività.get(i);
            System.out.println(attivita.getInfo());
        }
    }



	public int getIdCompany() {
		return IdCompany;
	}



	private void setIdCompany(int idCompany) {
		IdCompany = idCompany;
	}



	public String getNome() {
		return nome;
	}



	private void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	private void setEmail(String email) {
		this.email = email;
	}



	public String getCognome() {
		return cognome;
	}



	private void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
    // getRuolo

    public String getRuolo(){
        return "user";
    }

    public String getInfo(){
        String info=null;
        info="Username: "+cognome+" "+nome+" Ruolo: "+getRuolo()+"\n";
        return info;
    }
}
