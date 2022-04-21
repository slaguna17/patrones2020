package examen1SergioLaguna.ej4;

public class Bife extends CarneBuilder {
    @Override
    public void buildTipo() {
        carne.setTipoDeCarne("bife");
    }

    @Override
    public void buildRefresco() {
        carne.setRefresco("CocaCOla");
    }

    @Override
    public void buildGuarnicion() {
        carne.setGuarnicion("papasFritas");
    }
}
