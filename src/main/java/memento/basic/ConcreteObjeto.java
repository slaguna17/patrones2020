package memento.basic;

public class ConcreteObjeto{
    private String name;
    private String state;

    public ConcreteObjeto(String name,String state){
        this.name=name;
        this.state=state;
    }

    public void showData(){
        System.out.println("name : "+this.name);
        System.out.println("state : "+this.state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
