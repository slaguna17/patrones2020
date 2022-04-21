package visitor.basic;

public class ElementConcreteB implements  IElemento {
    private int attribute1;
    private int attribute2;
    
    @Override
    public String method1() {
        return null;
    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method3() {
        return 0;
    }


    // implementando patron visitor
    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
}
