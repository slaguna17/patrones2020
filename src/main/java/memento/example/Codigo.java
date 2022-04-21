package memento.example;

public class Codigo {
    private String name;
    private String code;

    public Codigo(String name, String code){
        this.name=name;
        this.code =code;
    }

    public void showData(){
        System.out.println("name : "+this.name);
        System.out.println("code : "+this.code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
