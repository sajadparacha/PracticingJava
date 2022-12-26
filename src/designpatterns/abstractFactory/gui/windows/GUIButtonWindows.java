package designpatterns.abstractFactory.gui.windows;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIButtonWindows implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("Windows Button draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("Windows Button change background color called");
    }
}
