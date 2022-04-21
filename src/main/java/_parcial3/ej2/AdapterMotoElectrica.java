package _parcial3.ej2;

public class AdapterMotoElectrica implements IMotos {
    private MotoElectrica adapter;

    public AdapterMotoElectrica(MotoElectrica adapter) {
        this.adapter = adapter;
    }

    @Override
    public int estadoCombustible() {
        return adapter.getEstadoDeBateria();
    }

    @Override
    public void cargarCombustible(int carga) {
        adapter.cargarBateria(carga);
    }
}
