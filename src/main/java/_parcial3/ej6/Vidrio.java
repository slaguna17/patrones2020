package _parcial3.ej6;

public class Vidrio extends Adicionales{

    public Vidrio(ICelular celular){
        super(celular);
        aumentarPrecio(50);
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Se le puso vidrio templado");
    }

    @Override
    public void aumentarPrecio(int precio) {
        super.aumentarPrecio(precio);
    }
}
