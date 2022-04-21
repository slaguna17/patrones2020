package _parcial3.ej1;

public class Client {
    public static void main(String[] args) {
        Documento doc = new Documento("d1", "HolaMundo");
        Plugin plugin = new Plugin();
        Word word =new Word();
        Sublime sublime = new Sublime();
        Notepad notepad = new Notepad();

        word.setDoc(doc);
        sublime.setDoc(doc);
        notepad.setDoc(doc);

        word.editar("ver 2.0");

        word.accept(plugin);
        sublime.accept(plugin);
        notepad.accept(plugin);
    }
}
