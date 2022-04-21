package observer.ejercicio;

import java.util.ArrayList;

public class CanalYoutube implements IYoutube {
    private ArrayList<IObserver> observers = new ArrayList<>();
    private ArrayList<Video> videoArrayList = new ArrayList<>();

    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer:observers
             ) {
            if ( observer.getCategory().equals("AnyCategory") || observer.getCategory() == videoArrayList.get(videoArrayList.size()-1).categoria ){
                observer.update("[Notify]\n\tVideo : "+videoArrayList.get(videoArrayList.size()-1).titulo+"\n\tCategoria : "+videoArrayList.get(videoArrayList.size()-1).categoria);
            }
        }
    }

    public void addVideo(Video video){
        System.out.println("INFO >  Video Agregado "+video.titulo+" "+video.categoria);
        this.videoArrayList.add(video);
        this.notifyObserver();
    }
}
