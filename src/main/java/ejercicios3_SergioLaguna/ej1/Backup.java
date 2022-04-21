package ejercicios3_SergioLaguna.ej1;

import java.util.ArrayList;
import java.util.List;

public class Backup {
    private String alias;
    private String state;
    private List<Persona> personas;

    public Backup(String alias, List<Persona> personas){
        this.alias=alias;
        this.personas = personas;
    }

    public void showData(){
        System.out.println("name : "+this.alias);
       // System.out.println("state : "+this.state);
        System.out.println("Numeros de personas: " + this.personas.size());
        for(int i = 0; i< personas.size(); i++){
            System.out.println("Persona# " + i+1);
            System.out.println("Nombre: " + personas.get(i).getName());
            System.out.println("Edad: " + personas.get(i).getEdad());
            System.out.println("Ci: " + personas.get(i).getCi());
        }
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
