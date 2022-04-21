package singleton.ejercicios.ej1;

public class Banco {

    private static Banco instance=null;
    private int amount;

    private Banco(){
        amount=400;
        System.out.println("Monto Original " + amount);

    }

    private synchronized static void makeInstance(){
        if (instance==null)
            instance = new Banco();
    }

    public static Banco getInstance(){
        if (instance==null)
            makeInstance();

        return instance;
    }

    public void getDinero(int cantidad){
        if (cantidad <= amount) {
            amount=amount-cantidad;
            System.out.println("Sacando Dinero " + cantidad + " saldo :" + amount);
        }else{
            System.out.println("No existe esa cantidad: " + cantidad + " saldo :" + amount);
        }
    }
}
