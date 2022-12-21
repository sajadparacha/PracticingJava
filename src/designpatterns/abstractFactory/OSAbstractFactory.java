package designpatterns.abstractFactory;

import designpatterns.abstractFactory.gui.GUIObject;

public interface OSAbstractFactory {
    public GUIObject getButton();
    public GUIObject getCombo();
    public GUIObject getList();
}
