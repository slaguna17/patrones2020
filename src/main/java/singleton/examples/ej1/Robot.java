package singleton.examples.ej1;

public class Robot {

    private String nombre;
    private String apellido;
    private String direccion;

    public Robot(String nombre, String apellido, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        Logger.getInstance().logger("INFO","instancia de :"+nombre+" "+apellido+" "+direccion);
    }

    public String getNombre() {
        Logger.getInstance().logger("INFO","get nombre :"+nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        Logger.getInstance().logger("INFO","set nombre : "+nombre);
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
