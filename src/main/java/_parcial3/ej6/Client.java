package _parcial3.ej6;

public class Client {
    public static void main(String[] args) {
        ICelular celular1 = new Sony(4, 128, "intel i3", 2200);
        celular1 = new Carcasa(celular1);
        celular1 = new Memoria(celular1);
        celular1 = new Vidrio(celular1);

        celular1.showData();
        System.out.println();

        ICelular celular2 = new Samsung(6, 128, "intel i5", 4000);
        celular2 = new Carcasa(celular2);
        celular2 = new Vidrio(celular2);
        celular2 = new MemoriaExterna(celular2);

        celular2.showData();
        System.out.println();

        ICelular celular3 = new Xiaomi(2, 32, "intel i3", 900);
        celular3 = new Carcasa(celular3);
        celular3 = new Memoria(celular3);
        celular3 = new Vidrio(celular3);
        celular3 = new MemoriaExterna(celular3);

        celular3.showData();
        System.out.println();
    }
}
