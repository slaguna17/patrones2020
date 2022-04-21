package ejercicios1.builder;

public class Pizza {
    private String masa;
    private String salsa;
    private String tipoQueso;

    public Pizza() {

    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public void action() {
        System.out.println("salsa " + salsa);
        System.out.println("masa " + masa);
        System.out.println("queso " + tipoQueso);

    }
}
