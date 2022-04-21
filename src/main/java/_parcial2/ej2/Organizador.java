package _parcial2.ej2;

public class Organizador implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(String solicitud) {
        DevOps devOps = new DevOps();
        Qa qa = new Qa();
        Developer developer = new Developer();
        Finanzas finanzas = new Finanzas();
        Support support = new Support();

        // orden de la cadena responsabilidad
        this.setNext(devOps);
        devOps.setNext(qa);
        qa.setNext(developer);
        developer.setNext(finanzas);
        finanzas.setNext(support);

        this.next.criteriaHandler(solicitud);
    }
}
