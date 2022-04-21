package _parcial3.ej1;

public interface IEditor {
    void crear(String nombre, String contenido);
    void editar(String nuevo);
    void eliminar();
    void showData();

    // metodo que empieza a implementar el patron visitor
    void accept(IVisitor visitor);
}
