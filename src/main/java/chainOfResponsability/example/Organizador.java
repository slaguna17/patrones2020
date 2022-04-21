package chainOfResponsability.example;

public class Organizador implements IHadler {
    private IHadler next;
    @Override
    public void setNext(IHadler handler) {
        this.next=handler;
    }

    @Override
    public IHadler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int amount) {

        Local local = new Local(); // <10000
        Sucursal sucursal = new Sucursal(); //  10001- 20000
        Departamental departamental = new Departamental(); //   20001 -50000
        Nacional nacional = new Nacional(); //50000 +

        // orden de la cadena responsabilidad
        this.setNext(local);
        local.setNext(sucursal);
        sucursal.setNext(departamental);
        departamental.setNext(nacional);

        this.next.criteriaHandler(amount);
    }
}
