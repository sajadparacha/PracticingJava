package designpatterns.abstractFactory.gui;

public interface GUIObject {
    public void drawBorders();
    public void onClick();
    public void changeBackgroundColor(String color);
}
