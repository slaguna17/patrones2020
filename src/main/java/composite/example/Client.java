package composite.example;

import _parcial1.factoryMethod.ComboBox;
import composite.basic.Leaf2;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class Client {
    public static void main (String [] args){
        Item task1 = new Item("Tarea1");
        Item task2 = new Item("Tarea2");
        Item task3 = new Item("Tarea3");

        task1.setEstimation(10);
        task2.setEstimation(10);
        task3.setEstimation(10);

        Composite userStory1 =new Composite("User Story 1");
        userStory1.add(task1);
        userStory1.add(task2);
        userStory1.add(task3);

        Composite userStory2 =new Composite("User Story 2");
        userStory2.add(task1);
        userStory2.add(task2);
        userStory2.add(task3);

        Composite userStory3 =new Composite("User Story 2");
        userStory3.add(task1);
        userStory3.add(task2);
        userStory3.add(task3);

        Composite epic1 = new Composite("Epic1");
        epic1.add(userStory1);
        epic1.add(userStory2);
        epic1.add(userStory3);

        epic1.totalEstimacion();
    }

}
