package ejercicios1.prototype;

import builder.basic.ConcreteBuilder1;

public class ContratoDocente implements  IContrato {
    private String sueldo;
    private String cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoEntrada;
    private String marcadoSalida;
    private String nombre;
    private String apellido;

    @Override
    public Object clone() {
        ContratoDocente objClone= new ContratoDocente();
        objClone.setAccesoPlataforma(this.accesoPlataforma);
        objClone.setApellido(this.apellido);
        objClone.setCargaHoraria(this.cargaHoraria);
        objClone.setCursoEducacionSuperior(this.cursoEducacionSuperior);
        objClone.setMarcadoBiometrico(this.marcadoBiometrico);
        objClone.setMarcadoEntrada(this.marcadoEntrada);
        objClone.setMarcadoSalida(this.marcadoSalida);
        objClone.setNombre(this.nombre);
        objClone.setSueldo(this.sueldo);
        return objClone;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoEntrada() {
        return marcadoEntrada;
    }

    public void setMarcadoEntrada(String marcadoEntrada) {
        this.marcadoEntrada = marcadoEntrada;
    }

    public String getMarcadoSalida() {
        return marcadoSalida;
    }

    public void setMarcadoSalida(String marcadoSalida) {
        this.marcadoSalida = marcadoSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void showData(){
        System.out.println(" *********************");
        System.out.println(" sueldo:"+ sueldo);
        System.out.println(" cargaHoraria: "+ cargaHoraria);
        System.out.println(" cursoEducacionSuperior: "+cursoEducacionSuperior);
        System.out.println(" accesoPlataforma: "+accesoPlataforma);
        System.out.println(" marcadoBiometrico: "+ marcadoBiometrico);
        System.out.println(" marcadoEntrada: "+ marcadoEntrada);
        System.out.println(" marcadoSalida: "+ marcadoSalida);
        System.out.println(" nombre" + nombre);
        System.out.println(" apellido: "+ apellido);
    }
}
