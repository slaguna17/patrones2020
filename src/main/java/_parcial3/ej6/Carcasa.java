package _parcial3.ej6;

public class Carcasa extends Adicionales {

    public Carcasa(ICelular celular){
        super(celular);
        aumentarPrecio(60);
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Se puso una carcasa");
    }

    @Override
    public void aumentarPrecio(int precio) {
        super.aumentarPrecio(precio);
    }
}
