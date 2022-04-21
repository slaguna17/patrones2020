package _parcial3.ej6;

public class Memoria extends Adicionales {

    public Memoria(ICelular celular){
        super(celular);
        aumentarPrecio(210);
        aumentarAlmacenamiento(64);
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Se añadió 64 GB a la memoria inicial.");
    }

    @Override
    public void aumentarAlmacenamiento(int almacenamiento){
        super.aumentarAlmacenamiento(almacenamiento);
    }

    @Override
    public void aumentarPrecio(int precio) {
        super.aumentarPrecio(precio);
    }
}
