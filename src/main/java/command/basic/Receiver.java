package command.basic;

public class Receiver {

    private String attribute1="Default";
    private int attribute2=0;

    public void operation1(){
        System.out.println("COMMAND > Operation 1\t>\t" + attribute1);
    }

    public void operation2(){
        System.out.println("COMMAND > Operation 2\t>\t"+attribute2);
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
