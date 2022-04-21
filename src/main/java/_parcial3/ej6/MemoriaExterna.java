package _parcial3.ej6;

public class MemoriaExterna extends Adicionales {

    public MemoriaExterna(ICelular celular){
        super(celular);
        aumentarPrecio(55);
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Se aumento la memoria externa a 32 GB.");
    }

    @Override
    public void aumentarPrecio(int precio) {
        super.aumentarPrecio(precio);
    }
}
