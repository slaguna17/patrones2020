package ejercicios1.singleton;

public class Ventanilla {

    private static Ventanilla instance=null;
    private Cajero cajero;
    private int saldo;
    private Ventanilla(Cajero cajero){
            this.cajero=cajero;
            this.saldo=0;
    }

    public static Ventanilla getInstance(Cajero cajero){
        if (instance == null)
            instance= new Ventanilla(cajero);

        return instance;
    }

    public void pagarMatricula(int amount, Estudiante estudiante){
           saldo= saldo+amount;
           System.out.println("**************************");
           System.out.println("Cajero Codigo: " +this.cajero.getCodigo() + "\nNombre: "+this.cajero.getNombre()+ "\nSaldo :" +saldo);
           System.out.println("Estudiante: "+ estudiante.getNombre());
    }

    public Integer getSaldo(){
        System.out.println("Saldo : "+this.saldo);
        return this.saldo;
    }
}
