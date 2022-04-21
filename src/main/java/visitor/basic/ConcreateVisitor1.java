package visitor.basic;

public class ConcreateVisitor1 implements  IVisitor {
    @Override
    public double visit(ElementConcreteA elementConcreteA) {
       System.out.println("Visitando con ConcreateVisitor1... ElementConcreteA ");
       elementConcreteA.setAttribute1(1000);
       //Logica
       return 0.0;
    }

    @Override
    public double visit(ElementConcreteB elementConcreteB) {
        System.out.println("Visitando con ConcreateVisitor1... ElementConcreteB ");
        elementConcreteB.setAttribute1(5000);
        // Logica
        return 0.0;
    }
}
