package _parcial3.ej1;

public class Plugin implements IVisitor {
    private PDF pdf;
    @Override
    public void visit(Word word) {
        System.out.println("PDF realizado en word");
        pdf =new PDF(word.getDoc().getNombre(),word.getDoc().getContenido());
        word.showData();
    }

    @Override
    public void visit(Sublime sublime) {
        System.out.println("PDF realizado en sublime");
        pdf =new PDF(sublime.getDoc().getNombre(),sublime.getDoc().getContenido());
        sublime.showData();
    }

    @Override
    public void visit(Notepad notepad) {
        System.out.println("PDF realizado en notepad");
        pdf =new PDF(notepad.getDoc().getNombre(),notepad.getDoc().getContenido());
        notepad.showData();
    }
}
