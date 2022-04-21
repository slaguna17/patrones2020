package _parcial3.ej3;

public class SA implements Empresa {

    Paquete paquete;

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("Empresa SA");
        this.paquete = paquete;
        this.paquete.enviando();
    }
}
