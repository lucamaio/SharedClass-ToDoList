package Shared;

public class Admin implements Utente{

    private int id;
    private String ursername;

    public Admin(String username){
        this.setId();
        this.setUsername(username);
    }
    
    private void setId(){
        this.id=1;
    }

    public int getId(){
        return id;
    }

    private void setUsername(String usrname){
        this.ursername=usrname;
    }

    public String getUsername(){
        return ursername;
    }

    public String getRuolo(){
        return "admin";
    }

    public String getInfo(){
        String info;
        info="Username: "+ursername+"\n";
        return info;
    }


    public void visualizzaAttivita(){
        System.out.println("Da definire");
    }

}
