package command.ejercicio;

import java.util.Date;

public class Computadora {

    private String nameUser;

    public void apagar(){
        System.out.println("COMMAND ["+nameUser+ "] > Operation apagar\t>\t" + new Date().getTime());
    }

    public void reiniciar(){
        System.out.println("COMMAND ["+nameUser+ "] Operation reiniciar\t>\t"+new Date().getTime());
    }

    public void suspender(){
        System.out.println("COMMAND ["+nameUser+ "] Operation suspender\t>\t"+new Date().getTime());
    }

    public void cerrarSession(){
        System.out.println("COMMAND ["+nameUser+ "] Operation cerrarSession\t>\t"+new Date().getTime());
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
}
