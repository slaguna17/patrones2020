package _parcial3.ej1;

public class Word implements IEditor {
    private Documento doc;

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    @Override
    public void crear(String nombre, String contenido) {
        doc = new Documento(nombre,contenido);
    }

    @Override
    public void editar(String nuevo) {
        doc.setContenido(nuevo);
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el documento");
    }

    @Override
    public void showData() {
        System.out.println(doc.getNombre() + "realizado en Word tiene de contenido: "+ doc.getContenido());
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
