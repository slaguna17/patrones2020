package chainOfResponsability.example;

public interface IHadler {
    void setNext(IHadler handler);
    IHadler next();
    void criteriaHandler(int amount);   // nuestra peticion

}
