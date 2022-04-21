package factoryMethod.ejercicios.ej1.sergio;

public class Cliente {
    public static void main(String[] args) {
        HeladoCreator creator = new HeladoCreator();
        Helado agua1 = creator.factoryMethodHelado(false);
        Helado agua2 = creator.factoryMethodHelado(false);

        agua1.setTamano("pequenio");
        agua2.setBase(new BaseHelado("Plastico", "Canasta"));

        Helado crema1 = creator.factoryMethodHelado(true);
        Helado crema2 = creator.factoryMethodHelado(true);

        crema1.setFruta(new Fruta("Dulce", "Durazno", 8));
        crema2.setTamano("Grande");

        Helado mixto1 = creator.factoryMethodHelado(true);
        Helado mixto2 = creator.factoryMethodHelado(true);

        mixto1.setCrema(new Crema("Vainilla", 7, true));
        mixto2.setForma("doble");

        agua1.infoHelado();
        agua2.infoHelado();
        crema1.infoHelado();
        crema2.infoHelado();
        mixto1.infoHelado();
        mixto2.infoHelado();
    }
}
