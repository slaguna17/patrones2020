package ejercicios1.abstractFactory;

public class FactoryMateria {
    public enum Materia{MATEMATICA,LENGUAJE,INGLES,HISTORIA}

    public static IMateria make(Materia type){
        IMateria materia;

        switch (type){
            case INGLES:
                materia= new Ingles();
                break;
            case MATEMATICA:
                materia=new Matematicas();
                break;
            case LENGUAJE:
                materia=new Lenguaje();
                break;
            case HISTORIA:
                materia= new Historia();
                break;

            default:
                materia= new Historia();
            break;

        }

        return materia;


    }
}
