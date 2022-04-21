package abstractFactory.ejercicios.ej1;

public class FactoryHelado {

    public enum heladoType{CREMA,AGUA,MIXTO}

    public static IHelado make(heladoType type){
        IHelado helado;

        switch (type){
            case CREMA:
                helado = new HeladoCrema();
                ((HeladoCrema)helado).setBase(new Base("triangular","cono"));
                ((HeladoCrema)helado).setCrema(new Crema("dulce","5$"));
                ((HeladoCrema)helado).setForma("circular");
                ((HeladoCrema)helado).setFruta(new Fruta("cirtrico","limon","2$"));
                ((HeladoCrema)helado).setTamano("5");
                break;
            case AGUA:
                helado= new HeladoAgua();
                ((HeladoAgua)helado).setBase(new Base("triangular","cono"));
                ((HeladoAgua)helado).setForma("cono");
                ((HeladoAgua)helado).setFruta(new Fruta("dulce","frutilla","2$"));
                ((HeladoAgua)helado).setTamano("Mediano");
                break;
            case MIXTO:
                helado= new HeladoMixto();
                ((HeladoMixto)helado).setBase(new Base("triangular","cono"));
                ((HeladoMixto)helado).setCrema(new Crema("frutilla","3$"));
                ((HeladoMixto)helado).setForma("cono");
                ((HeladoMixto)helado).setFruta(new Fruta("dulce","frutilla","2$"));
                ((HeladoMixto)helado).setTamano("Mediano");
                break;
            default:
                helado= new HeladoMixto();
                break;
        }
        return helado;
    }

}
