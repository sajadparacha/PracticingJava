package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewVideoName() {
        return newVideoName;
    }

    public void setNewVideoName(String newVideoName) {
        this.newVideoName = newVideoName;
    }

    private String newVideoName;
    private List<Subscriber> subscriberList= new ArrayList<Subscriber>();

    @Override
    public void addSubscriber(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    @Override
    public  void removeSubscriber(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }
    @Override
    public void notifySubscribers(){
        for(Subscriber sub:subscriberList){
            sub.update(newVideoName);
        }
    }

    public static void main (String args[]){

        YouTubeChannel youTubeChannel=new YouTubeChannel();
        youTubeChannel.setName("My New Channel");

        Subscriber subscriber=new Subscriber();
        subscriber.setChanel(youTubeChannel);
        subscriber.setName("Sajjad");

        Subscriber subscriber1=new Subscriber();
        subscriber1.setChanel(youTubeChannel);
        subscriber1.setName("Waqar");

        Subscriber subscriber2=new Subscriber();
        subscriber2.setChanel(youTubeChannel);
        subscriber2.setName("Dilshad");

        youTubeChannel.addSubscriber(subscriber);
        youTubeChannel.addSubscriber(subscriber1);
        youTubeChannel.addSubscriber(subscriber2);

        youTubeChannel.setNewVideoName("Video About Design Patterns");
        youTubeChannel.notifySubscribers();
    }
}
