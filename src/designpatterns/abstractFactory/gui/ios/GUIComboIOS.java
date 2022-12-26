package designpatterns.abstractFactory.gui.ios;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIComboIOS implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("IOS Combo draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("IOS Combo onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("IOS Combo change background color called");
    }
}
