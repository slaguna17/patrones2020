package visitor.ejercicio;

public interface IVisitor {

    double visit(Bolivia bolivia,TipoCambio tipoCambio);
    double visit(Argentina argentina,TipoCambio tipoCambio);
    double visit(Brazil brazil,TipoCambio tipoCambio);

}
