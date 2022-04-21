package singleton.examples.ej1;

public class Logger {

    private static  Logger instance=null;

    private Logger(){
      System.out.println("Creando LOG");
    }

    public static  Logger getInstance(){
        if (instance == null)
            instance = new Logger();

        return  instance;
    }

    /**
     *  this method is to print a log
     * @param type INFO, DEBUG, ERROR
     * @param msg actions
     */
    public void logger(String type, String msg){
        System.out.println(type.toUpperCase()+"\t"+msg);
    }

}
