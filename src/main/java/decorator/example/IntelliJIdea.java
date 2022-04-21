package decorator.example;

/**
 * @autor : eynar.pari
 * @date : 25/06/2020.
 **/
public class IntelliJIdea implements IDE {

    String typeLicense;

    public IntelliJIdea(String typeLicense){
        this.typeLicense=typeLicense;
    }

    @Override
    public void ejecucionCode() {
        System.out.println("INFO> Ejecutando con IntelliJIdea con typeLicense : "+typeLicense);
    }
}
