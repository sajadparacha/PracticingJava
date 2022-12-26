package designpatterns.abstractFactory.gui.windows;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIListWindows implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("Windows List draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("Windows List onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("Windows List change background color called");
    }
}
