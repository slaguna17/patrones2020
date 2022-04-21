package _parcial3.ej6;

public class Adicionales implements ICelular {
    private ICelular celular;

    public Adicionales(ICelular celular){
        this.celular = celular;
    }

    @Override
    public void showData() {
        celular.showData();
    }

    @Override
    public void aumentarAlmacenamiento(int almacenamiento) {
        celular.aumentarAlmacenamiento(almacenamiento);
    }

    @Override
    public void aumentarPrecio(int precio) {
        celular.aumentarPrecio(precio);
    }
}
