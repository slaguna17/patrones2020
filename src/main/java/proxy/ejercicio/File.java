package proxy.ejercicio;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class File {

    private String name;
    private String extention;

    public File(String name, String extention){
        this.name= name;
        this.extention=extention;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }
}
