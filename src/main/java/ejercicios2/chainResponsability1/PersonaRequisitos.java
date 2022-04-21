package ejercicios2.chainResponsability1;

public class PersonaRequisitos {

    private String nombre;
    private boolean tieneCertificadoNacimiento;
    private boolean tienePagoAlBanco;
    private boolean tieneFicha;

    public PersonaRequisitos (String nombre, boolean tieneCertificadoNacimiento
    ,boolean tienePagoAlBanco, boolean tieneFicha){
        this.nombre=nombre;
        this.tieneCertificadoNacimiento=tieneCertificadoNacimiento;
        this.tienePagoAlBanco=tienePagoAlBanco;
        this.tieneFicha=tieneFicha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneCertificadoNacimiento() {
        return tieneCertificadoNacimiento;
    }

    public void setTieneCertificadoNacimiento(boolean tieneCertificadoNacimiento) {
        this.tieneCertificadoNacimiento = tieneCertificadoNacimiento;
    }

    public boolean isTienePagoAlBanco() {
        return tienePagoAlBanco;
    }

    public void setTienePagoAlBanco(boolean tienePagoAlBanco) {
        this.tienePagoAlBanco = tienePagoAlBanco;
    }

    public boolean isTieneFicha() {
        return tieneFicha;
    }

    public void setTieneFicha(boolean tieneFicha) {
        this.tieneFicha = tieneFicha;
    }
}
