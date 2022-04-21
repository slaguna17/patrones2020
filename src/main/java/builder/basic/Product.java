package builder.basic;

public class Product {
    private String attribute1;
    private int attribute2;

    public Product(){

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

    public void action(){
        System.out.println("attribute1 "+attribute1);
        System.out.println("attribute2 "+attribute2);



    }
}
