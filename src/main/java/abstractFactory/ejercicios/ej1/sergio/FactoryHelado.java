package abstractFactory.ejercicios.ej1.sergio;
public class FactoryHelado {
    public static IHelado make(String type){
        IHelado helado;

        switch (type){
            case "mixto":
                helado = new HeladoMixto("mediano","doble", new Fruta1("citrico", "naranja", 9),
                        new BaseHelado1("Galleta", "vaso"),new Crema1("Chocolate",15));
                break;
            case "crema":
                helado= new HeladoCrema("mediano","doble", new Fruta1("citrico", "naranja", 9),
                        new BaseHelado1("Galleta", "vaso"),new Crema1("Chocolate",15));
                break;
            case "agua":
                helado = new HeladoAgua("mediano","doble", new Fruta1("citrico", "naranja", 9),
                        new BaseHelado1("Galleta", "vaso"));
                break;
            default:
                helado = new HeladoAgua("mediano","doble", new Fruta1("citrico", "naranja", 9),
                        new BaseHelado1("Galleta", "vaso"));
                break;
        }
        return helado;
    }
}
