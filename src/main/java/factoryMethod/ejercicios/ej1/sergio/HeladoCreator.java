package factoryMethod.ejercicios.ej1.sergio;

public class HeladoCreator extends Creator {

    @Override
    public Helado factoryMethodHelado(boolean conCrema){

        Helado helado = new Helado();
        helado.setForma("Cono");
        helado.setTamano("Mediano");

        BaseHelado base = new BaseHelado("Galleta", "cono");
        helado.setBase(base);

        Crema crema = new Crema("Chocolate", 15, conCrema);
        helado.setCrema(crema);

        Fruta fruta = new Fruta("citrica", "naranja", 10);
        helado.setFruta(fruta);

        return helado;
    }


}
