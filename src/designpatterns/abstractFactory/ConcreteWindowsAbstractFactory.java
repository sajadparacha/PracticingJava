package designpatterns.abstractFactory;

import designpatterns.abstractFactory.gui.GUIObject;
import designpatterns.abstractFactory.gui.windows.GUIButtonWindows;
import designpatterns.abstractFactory.gui.windows.GUIComboWindows;
import designpatterns.abstractFactory.gui.windows.GUIListWindows;

public class ConcreteWindowsAbstractFactory implements OSAbstractFactory{
    @Override
    public GUIObject getButton() {
        GUIButtonWindows guiButtonWindows=new GUIButtonWindows();
        System.out.println("Returning Windows Button");
        return  guiButtonWindows;
    }

    @Override
    public GUIObject getCombo() {
        GUIComboWindows guiComboWindows=new GUIComboWindows();
        System.out.println("Returning Windows Combo");
        return guiComboWindows;
    }

    @Override
    public GUIObject getList() {
        GUIListWindows guiListWindows=new GUIListWindows();
        System.out.println("Returning Windows List");
        return guiListWindows;
    }
}
