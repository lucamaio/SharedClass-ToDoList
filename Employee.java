package Shared;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Utente{
    
    private int id;
    private String username;
    private List<Attivita> listaAttività = new ArrayList<>();

    // Constructor
    public Employee(String username) {
        setId();
        setUsername(username);
    }

   

    public Employee(int id, String username){
        setId(id);
        setUsername(username);
    }

    // Metodi get e set

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = 0;
    }


    private void setId(int id) {
        this.id = id;
    }



    public String getUsername() {
        return username;
    }


    private void setUsername(String username) {
        this.username = username;
    }

    // getRuolo

    public String getRuolo(){
        return "user";
    }

    public String getInfo(){
        String info=null;
        info="Username: "+username+" Ruolo: "+getRuolo()+"\n";
        return info;
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

}
