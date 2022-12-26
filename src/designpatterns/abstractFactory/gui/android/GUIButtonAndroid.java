package designpatterns.abstractFactory.gui.android;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIButtonAndroid implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("Android Button draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("Android Button onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("Android Button change background color called");
    }
}
