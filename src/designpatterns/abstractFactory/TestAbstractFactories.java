package designpatterns.abstractFactory;

public class TestAbstractFactories {
    public static void main (String args[]){
        /*Testing Android Abstract Factory*/
        System.out.println("Android Factory");
        ConcreteAndroidAbstractFactory concreteAndroidAbstractFactory=new ConcreteAndroidAbstractFactory();
        concreteAndroidAbstractFactory.getButton();
        concreteAndroidAbstractFactory.getCombo();
        concreteAndroidAbstractFactory.getList();
        /*Testing IOS Abstract Factory*/
        System.out.println("IOS Factory");
        ConcreteIOSAbstractFactory concreteIOSAbstractFactory=new ConcreteIOSAbstractFactory();
        concreteIOSAbstractFactory.getButton();
        concreteIOSAbstractFactory.getCombo();
        concreteIOSAbstractFactory.getList();
        /*Testing Windows Abstract Factory*/
        System.out.println("Windows Factory");
        ConcreteWindowsAbstractFactory concreteWindowsAbstractFactory=new ConcreteWindowsAbstractFactory();
        concreteWindowsAbstractFactory.getButton();
        concreteWindowsAbstractFactory.getCombo();
        concreteWindowsAbstractFactory.getList();


    }
}
