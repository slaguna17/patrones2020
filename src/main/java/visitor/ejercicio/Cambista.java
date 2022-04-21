package visitor.ejercicio;

public class Cambista implements IVisitor {
    @Override
    public double visit(Bolivia bolivia,TipoCambio tipoCambio) {
      double change;
      if (tipoCambio.name().equals(TipoCambio.MonedaLocalToDolares.name())){
          change=bolivia.getMoneda().cambiarMonedaLocalaDolar(bolivia.getAmount());
          System.out.println(bolivia.getMoneda().getSimbolo()+" ----> Dolares");
      }else{
          change=bolivia.getMoneda().cambiarDolaraMonedaLocal(bolivia.getAmount());
          System.out.println("Dolares ----> "+bolivia.getMoneda().getSimbolo());
      }
      System.out.println(tipoCambio.name()+"  -->  Cantidad ["+bolivia.getAmount()+"] fue cambiado a ["+change+"]");
      return change;
    }

    @Override
    public double visit(Argentina argentina,TipoCambio tipoCambio) {
        double change;
        if (tipoCambio.name().equals(TipoCambio.MonedaLocalToDolares.name())){
            change=argentina.getMoneda().cambiarMonedaLocalaDolar(argentina.getAmount());
            System.out.println(argentina.getMoneda().getSimbolo()+" ----> Dolares");
        }else{
            change=argentina.getMoneda().cambiarDolaraMonedaLocal(argentina.getAmount());
            System.out.println("Dolares ----> "+argentina.getMoneda().getSimbolo());
        }
        System.out.println(tipoCambio.name()+"  -->  Cantidad ["+argentina.getAmount()+"] fue cambiado a ["+change+"]");
        return change;
    }

    @Override
    public double visit(Brazil brazil,TipoCambio tipoCambio) {
        double change;
        if (tipoCambio.name().equals(TipoCambio.MonedaLocalToDolares.name())){
            change=brazil.getMoneda().cambiarMonedaLocalaDolar(brazil.getAmount());
            System.out.println(brazil.getMoneda().getSimbolo()+" ----> Dolares");
        }else{
            change=brazil.getMoneda().cambiarDolaraMonedaLocal(brazil.getAmount());
            System.out.println("Dolares ----> "+brazil.getMoneda().getSimbolo());
        }
        System.out.println(tipoCambio.name()+"  -->  Cantidad ["+brazil.getAmount()+"] fue cambiado a ["+change+"]");
        return change;
    }
}
