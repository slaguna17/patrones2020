package _parcial3.ej1;

public interface IVisitor {
    void visit(Word word);
    void visit(Sublime sublime);
    void visit(Notepad notepad);
}
