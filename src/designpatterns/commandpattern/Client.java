package designpatterns.commandpattern;

import designpatterns.commandpattern.receiver.Radio;
import designpatterns.commandpattern.receiver.TV;

public class Client {
    public static void main (String args[]){
        System.out.println("Tv");
        TV tv = new TV();
        tv.turnOn();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.turnOff();

        //radio
        System.out.println("Radio");
        Radio radio = new Radio();
        radio.turnOn();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.turnOff();
    }
}
