package ejercicios1.abstractFactory;

public class Ingles implements IMateria {
    @Override
    public void inscripcion(Estudiante estudiante) {
        System.out.println("Esdutiante : "+estudiante.getNombre()+" materia Ingles");
    }
}
