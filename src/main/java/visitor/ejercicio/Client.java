package visitor.ejercicio;

public class Client {

    public static void main (String []args  ){
        Bolivia bolivia = new Bolivia();
        Argentina argentina = new Argentina();
        Brazil brazil= new Brazil();

        Cambista visitor= new Cambista();

        bolivia.setAmount(100);
        bolivia.accept(visitor,TipoCambio.MonedaLocalToDolares);
        bolivia.accept(visitor,TipoCambio.DolaresToMonedaLocal);

        brazil.setAmount(100);
        brazil.accept(visitor,TipoCambio.MonedaLocalToDolares);
        brazil.accept(visitor,TipoCambio.DolaresToMonedaLocal);

        argentina.setAmount(100);
        argentina.accept(visitor,TipoCambio.MonedaLocalToDolares);
        argentina.accept(visitor,TipoCambio.DolaresToMonedaLocal);

    }
}
