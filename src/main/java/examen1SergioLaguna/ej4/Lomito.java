package examen1SergioLaguna.ej4;

public class Lomito extends CarneBuilder {
    @Override
    public void buildTipo() {
        carne.setTipoDeCarne("Lomito");
    }

    @Override
    public void buildRefresco() {
        carne.setRefresco("Pepsi");
    }

    @Override
    public void buildGuarnicion() {
carne.setGuarnicion("arroz");
    }
}
