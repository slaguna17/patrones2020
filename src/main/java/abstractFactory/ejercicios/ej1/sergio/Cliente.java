package abstractFactory.ejercicios.ej1.sergio;

public class Cliente {
    public static void main(String[] args) {
        FactoryHelado.make("agua").infoHelado();
        FactoryHelado.make("agua").infoHelado();
        FactoryHelado.make("crema").infoHelado();
        FactoryHelado.make("crema").infoHelado();
        FactoryHelado.make("mixto").infoHelado();
        FactoryHelado.make("mixto").infoHelado();

    }
}
