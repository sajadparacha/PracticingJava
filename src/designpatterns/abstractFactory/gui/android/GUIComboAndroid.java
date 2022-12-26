package designpatterns.abstractFactory.gui.android;

import designpatterns.abstractFactory.gui.GUIObject;

public class GUIComboAndroid implements GUIObject {
    @Override
    public void drawBorders() {
        System.out.println("Android Combo draw borders called");
    }

    @Override
    public void onClick() {
        System.out.println("Android Combo onClick called");
    }

    @Override
    public void changeBackgroundColor(String color) {
        System.out.println("Android Combo change background color called");
    }
}
