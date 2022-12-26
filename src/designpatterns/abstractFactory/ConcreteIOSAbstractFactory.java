package designpatterns.abstractFactory;

import designpatterns.abstractFactory.gui.GUIObject;
import designpatterns.abstractFactory.gui.ios.GUIButtonIOS;
import designpatterns.abstractFactory.gui.ios.GUIComboIOS;
import designpatterns.abstractFactory.gui.ios.GUIListIOS;

public class ConcreteIOSAbstractFactory implements OSAbstractFactory{
    @Override
    public GUIObject getButton() {
        GUIButtonIOS guiButtonIOS=new GUIButtonIOS();
        System.out.println("Returning IOS Button");
        return  guiButtonIOS;
    }

    @Override
    public GUIObject getCombo() {
        GUIComboIOS guiComboIOS=new GUIComboIOS();
        System.out.println("Returning IOS Combo");
        return guiComboIOS;
    }

    @Override
    public GUIObject getList() {
        GUIListIOS guiListIOS=new GUIListIOS();
        System.out.println("Returning IOS List");
        return guiListIOS;
    }
}
