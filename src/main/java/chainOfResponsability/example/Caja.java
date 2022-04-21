package chainOfResponsability.example;

public class Caja {

    private static Caja instancia=null;
    private int amount;

    private Caja(){
        amount=70;
    }

    private synchronized  static  void makeInstance(){
        if (instancia==null)
            instancia= new Caja();
    }


    public static Caja getInstance(){
        if (instancia==null)
            makeInstance();

        return instancia;
    }

    // synchronized if we have errors when getting money
    public void getMoney(int amount){

        if (amount <= this.amount){
            System.out.println("INFO > -------------------");
            this.amount= this.amount - amount;
            System.out.println("INFO > monto retirado: "+amount);
            System.out.println("INFO > saldo actual : "+this.amount);
        }else{
            System.out.println("WARN > no se cuenta con esa cantidad en la caja :"+this.amount);
        }
    }

}
