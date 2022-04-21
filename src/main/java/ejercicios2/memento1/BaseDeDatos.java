package ejercicios2.memento1;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos implements Cloneable {
    private List<Persona> personas;
    private String nombreDB;

    public BaseDeDatos(String nombreDB ){
        this.nombreDB=nombreDB;
        this.personas= new ArrayList<>();
    }

    public void addPersonas(Persona persona){
        this.personas.add(persona);
    }

    public void showData(){

        System.out.println("****** Nombre data base "+this.nombreDB);
        for (Persona persona :this.personas
                ) {
           System.out.println("Persona , nombre : "+persona.nombre);
           System.out.println("Persona , ci : "+persona.ci);
        }
    }
    public List getPersonas() {
        return this.personas;
    }

    public void setPersonas(List personas) {
        this.personas = personas;
    }

    public String getNombreDB() {
        return nombreDB;
    }

    public void setNombreDB(String nombreDB) {
        this.nombreDB = nombreDB;
    }

    @Override
    public BaseDeDatos clone(){
        BaseDeDatos dbClone= new BaseDeDatos(this.nombreDB);
        List<Persona> personasClone= new ArrayList<>();
        this.personas.forEach((person) -> personasClone.add(person));
        dbClone.setNombreDB(this.nombreDB);
        dbClone.setPersonas(personasClone);
        return dbClone;
    }
}
