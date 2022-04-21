package _parcial3.ej3;

public class SRL implements Empresa {

    Paquete paquete;

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("Empresa SRL");
        this.paquete = paquete;
        this.paquete.enviando();
    }
}
