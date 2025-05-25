package Shared;

public class Admin implements Utente{

    private int id;
    private String nome,cognome,email;

    public Admin(int id,String nome,String cognome,String email){
        this.setId(id);
        this.setNome(nome);
        this.setCognome(cognome);
        this.setEmail(email);
    }
    
    private void setNome(String nome) {
		this.nome=nome;
		
	}
     public String getNome() {
    	 return nome;
     }

	private void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
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
}
