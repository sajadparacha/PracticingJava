package designpatterns.commandpattern.receiver;

public class TV implements ElectronicDevice {
    int volume=0;
    @Override
    public void increaseVolume() {
        volume++;
        System.out.println("TV Volume Increased "+volume);
    }

    @Override
    public void decreaseVolume() {
        --volume;
        System.out.println("TV Volume Decreased "+volume);
    }

    @Override
    public void turnOn() {
        System.out.println("Tv Turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Turn Off");
    }
}
