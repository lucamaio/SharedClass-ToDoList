package Shared;

import java.io.Serializable;

public abstract class Utente implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    protected int id, idDepartment;
    protected String cognome, nome, email;

    // Costruttori
    
    public Utente(int id,String nome, String cognome) {
    	setId(id);
        setNome(nome);
        setCognome(cognome);
        setIdDepartment(-1);
    }

    public Utente(int id, String nome, String cognome, String email) {
        this(id,nome,cognome);
        setEmail(email);
    }

    public Utente(int id, String nome, String cognome, String email, int idDepartment) {
        this(id,nome,cognome,email);
        setIdDepartment(idDepartment);
    }

    // Set e get

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    private void setCognome(String cognome) {
        this.cognome = cognome;
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

    public int getIdDepartment(){
        return idDepartment;
    }

    private void setIdDepartment(int idDepartment){
        this.idDepartment=idDepartment;
    }

    // Metodi Astratti
    
    public abstract String getRuolo();

    public abstract String getInfo();
    
}
