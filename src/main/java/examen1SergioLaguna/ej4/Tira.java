package examen1SergioLaguna.ej4;

public class Tira extends CarneBuilder{


    @Override
    public void buildTipo() {
        carne.setTipoDeCarne("Tira");
    }

    @Override
    public void buildRefresco() {
carne.setRefresco("Cocacola");
    }

    @Override
    public void buildGuarnicion() {
carne.setGuarnicion("papas");
    }
}
