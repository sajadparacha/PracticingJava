package designpatterns.abstractFactory.gui.android;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIListAndroid implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("Android List draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("Android List onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("Android List change background color called");
    }
}
