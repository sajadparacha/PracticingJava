package designpatterns.abstractFactory;

import designpatterns.abstractFactory.gui.GUIObject;
import designpatterns.abstractFactory.gui.android.GUIButtonAndroid;
import designpatterns.abstractFactory.gui.android.GUIComboAndroid;
import designpatterns.abstractFactory.gui.android.GUIListAndroid;

public class ConcreteAndroidAbstractFactory implements OSAbstractFactory{
    @Override
    public GUIObject getButton() {
        GUIButtonAndroid guiButtonAndroid=new GUIButtonAndroid();
        System.out.println("Returning Android Button");
        return  guiButtonAndroid;
    }

    @Override
    public GUIObject getCombo() {
        GUIComboAndroid guiComboAndroid=new GUIComboAndroid();
        System.out.println("Returning Android Combo");
        return guiComboAndroid;
    }

    @Override
    public GUIObject getList() {
        GUIListAndroid guiListAndroid=new GUIListAndroid();
        System.out.println("Returning Android List");
        return guiListAndroid;
    }
}
