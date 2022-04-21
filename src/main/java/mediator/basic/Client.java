package mediator.basic;

public class Client {


    public static void main (String [] arg) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(concreteMediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(concreteMediator);

        concreteMediator.setConcreteColleague1(c1);
        concreteMediator.setConcreteColleague2(c2);


        c1.send("este mensaje es para realizar una pregunta, que hora es?");
        c2.send("respuesta :  la hora es 8:27");
    }

}
