package designpatterns.abstractFactory.gui.windows;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIComboWindows implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("Windows Combo draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Combo onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("Windows Combo change background color called");
    }
}
