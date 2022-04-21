package abstractFactory.basic;

public class FactoryProduct {

    public static IProducto make(String type) {

        IProducto producto;

        switch (type) {
            case "productoConcreto1":
                producto = new ConcreteProduct1();
                break;
            case "productoConcreto2":
                producto = new ConcreteProduct2();
                break;
            case "productoConcreto3":
                producto = new ConcreteProduct3();
                break;
            case "productoConcreto4":
                producto = new ConcreteProduct4();
                break;
            default:
                producto = new ConcreteProduct3();
                break;
        }
        return producto;
    }
}
