package state.basic;

public class Context {
    // agregar- cumpla patron state
    private IState state;

    private String attribute1;
    private int attribute2;

    public Context(){
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    // agregar- cumpla patron state
    public void request(){
        state.handle();
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
