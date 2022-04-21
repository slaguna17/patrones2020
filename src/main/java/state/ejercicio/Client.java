package state.ejercicio;

public class Client {
    public static void main(String [] abc){

        MaquinaDispensadora md = new MaquinaDispensadora();
        md.setDineroIntroducido(150);

        if (md.getPrecioProduct() == md.getDineroIntroducido() )
             md.setState(new MontoExacto());

        if ( md.getDineroIntroducido() > md.getPrecioProduct() )
            md.setState(new MontoSuperior());

        if (md.getDineroIntroducido() < md.getPrecioProduct() )
            md.setState(new MontoInsuficiente());


        md.request();

    }

}
