package designpatterns.commandpattern.receiver;

public class Radio implements ElectronicDevice{
    int volume=0;
    @Override
    public void increaseVolume() {
        volume++;
        System.out.println("Radio Volume Increased "+volume);
    }

    @Override
    public void decreaseVolume() {
        --volume;
        System.out.println("Radio Volume Decreased "+volume);
    }

    @Override
    public void turnOn() {
        System.out.println("Radio Turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio Turn Off");
    }
}
