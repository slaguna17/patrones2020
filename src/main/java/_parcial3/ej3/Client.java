package _parcial3.ej3;

public class Client {
    public static void main (String [] args){
        Tierra tierra = new Tierra(1000, "Paquete1");
        Mar mar = new Mar(2000, "Paquete2");
        Aire aire = new Aire(3000, "Paquete3");
        SA sa = new SA();
        SRL srl = new SRL();
        sa.enviarPaquete(tierra);
        sa.enviarPaquete(mar);
        sa.enviarPaquete(aire);
        srl.enviarPaquete(tierra);
        srl.enviarPaquete(mar);
        srl.enviarPaquete(aire);
    }
}