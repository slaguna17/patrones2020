package adapter.ejercicio;

public class AdapterAutomovilElectrico implements IAutomoviles {
    // caracteristica
    private AutomovilElectrico adaptee;

    public AdapterAutomovilElectrico(AutomovilElectrico adaptee){
        this.adaptee= adaptee;
    }


    @Override
    public void llenar(int capacidad) {
        this.adaptee.cargar(capacidad);
    }

    @Override
    public int estadoDelCombustible() {
         return this.adaptee.estadoDeElectricidad();
    }
}
