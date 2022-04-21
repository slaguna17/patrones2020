package visitor.ejercicio;

public interface IPais {
    double accept(IVisitor visitor, TipoCambio tipoCambio);
}
