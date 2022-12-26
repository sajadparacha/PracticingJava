package designpatterns.abstractFactory.gui.ios;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIListIOS implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("IOS List draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("IOS List onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("IOS List change background color called");
    }
}
