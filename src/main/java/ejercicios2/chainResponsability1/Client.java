package ejercicios2.chainResponsability1;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        organizador.criteriaHandler(new PersonaRequisitos("Jose1",true,true,true));
        organizador.criteriaHandler(new PersonaRequisitos("Jose2",false,true,true));
        organizador.criteriaHandler(new PersonaRequisitos("Jose3",true,false,true));
        organizador.criteriaHandler(new PersonaRequisitos("Jose4",false,false,false));
        organizador.criteriaHandler(new PersonaRequisitos("Jose5",false,false,true));

    }
}
