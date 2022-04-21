package _parcial3.ej5;

public class Client {
    public static void main (String [] args){
        Archivo file1 = new Archivo(200);
        Archivo file2 = new Archivo(100);
        Archivo file3 = new Archivo(50);
        Archivo file4 = new Archivo(100);

        Disco unidad1 = new Disco();

        Folder folder1 = new Folder();
        Folder folder2 = new Folder();

        folder1.add(file1);
        folder1.add(file2);
        folder1.add(file3);
        folder2.add(file4);


        unidad1.add(folder1);
        unidad1.add(folder2);

        unidad1.totalPalabras();


    }
}
