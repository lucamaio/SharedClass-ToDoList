package Shared;

public abstract class Utente {

    protected int id;
    protected String cognome, nome, email;

    public Utente(int id, String nome, String cognome, String email) {
        setId(id);
        setNome(nome);
        setCognome(cognome);
        setEmail(email);
    }

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

    public abstract String getRuolo();

    public abstract String getInfo();
}
