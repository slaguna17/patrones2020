package proxy.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class FileServer implements Servidor {

    private HashMap<String,File> fileList= new HashMap<>();

    public FileServer(){
    }

    @Override
    public void upload(File file) {
        System.out.println("Upload : "+file.getName()+"."+file.getExtention());
        fileList.put(file.getName(),file);
    }

    @Override
    public void download(String nameFile) {
        System.out.println("Download : "+fileList.get(nameFile).getName()+"."+fileList.get(nameFile).getExtention());
    }
}
