package ejercicios1.abstractFactory;

public class Lenguaje implements IMateria {
    @Override
    public void inscripcion(Estudiante estudiante) {
        System.out.println("Esdutiante : "+estudiante.getNombre()+" materia Lenguaje");
    }
}
