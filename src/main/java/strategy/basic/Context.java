package strategy.basic;

public class Context {

    private IStrategy strategy;
    private String attribute1;
    private int attribute2;

    public Context(){}

    public void execute(){
        this.strategy.execute(attribute2);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
}
