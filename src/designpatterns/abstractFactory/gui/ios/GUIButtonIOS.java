package designpatterns.abstractFactory.gui.ios;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIButtonIOS implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("IOS Button draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("IOS Button onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("IOS Button change background color called");
    }
}
