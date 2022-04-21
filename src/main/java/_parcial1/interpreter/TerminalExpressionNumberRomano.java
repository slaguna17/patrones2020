package _parcial1.interpreter;

public class TerminalExpressionNumberRomano extends AbstractExpresion {

    public TerminalExpressionNumberRomano(int sizeToRemove){
        this.sizeToRemove=sizeToRemove;
    }

    @Override
    public void interpreter(Context context) {
           System.out.println("contect "+context.input);
        System.out.println("contect "+this.sizeToRemove);
           switch (context.input.substring(0,this.sizeToRemove)){
               case "I":
                   context.output = context.output + 1 +" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "II":
                   context.output = context.output + 2+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "III":
                   context.output = context.output + 3+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "IV":
                   context.output = context.output + 4+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "V":
                   context.output = context.output + 5+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "VI":
                   context.output = context.output + 6+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "VII":
                   context.output = context.output + 7+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "VIII":
                   context.output = context.output + 8+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "IX":
                   context.output = context.output + 9+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
               case "X":
                   context.output = context.output + 10+" ";
                   context.input= context.input.substring(this.sizeToRemove);
                   break;
           }

    }
}
