package designpatterns.builder;

public class PhoneShop {

    public static void main (String args[]){
        PhoneBuilder phoneBuilder=new PhoneBuilder();
        phoneBuilder.setOs("IOS").setModel("Iphone 12").setManufacturer("Apple");
        Phone phone=phoneBuilder.getPhone();
        System.out.println("New Phone Created "+phone);

    }
}
