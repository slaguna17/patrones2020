package observer.ejercicio;

public class Client {

    public static void main (String [] argsss){
        CanalYoutube cienciaChannerl = new CanalYoutube();

        YouTubeUser juan1 = new YouTubeUser(new Persona("Juan1 ","123"),"DRAMA");
        YouTubeUser juan2  = new YouTubeUser(new Persona("Juan2 ","123"),"ACCION");
        YouTubeUser juan3  = new YouTubeUser(new Persona("Juan3 ","123"),"TERROR");
        YouTubeUser juan4  = new YouTubeUser(new Persona("JJJJJuan4 ","123"),"AnyCategory");
        YouTubeUser juan5  = new YouTubeUser(new Persona("JJJJJuan5 ","123"),"AnyCategory");

        cienciaChannerl.attach(juan1);
        cienciaChannerl.attach(juan2);
        cienciaChannerl.attach(juan3);
        cienciaChannerl.attach(juan4);
        cienciaChannerl.attach(juan5);


        cienciaChannerl.addVideo(new Video("MP4","REY LEON","2h","INFANTIL"));

        cienciaChannerl.addVideo(new Video("MP4","AVG","2h","ACCION"));

        cienciaChannerl.addVideo(new Video("MP4","TTT","2h","DRAMA"));



    }
}
