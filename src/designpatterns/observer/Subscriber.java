package designpatterns.observer;

public class Subscriber implements Observer {
    private String name;
    private YouTubeChannel youTubeChannel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public YouTubeChannel getChanel() {
        return youTubeChannel;
    }

    public void setChanel(YouTubeChannel chanel) {
        this.youTubeChannel = chanel;
    }

    @Override
    public void update(String videoName) {
        System.out.println("Hello "+name+" a new video has been uploaded on channel "+youTubeChannel.getName()+ " and the name of video is "+videoName);
    }
}
