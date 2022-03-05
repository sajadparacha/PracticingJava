package designpatterns.builder;

public class PhoneBuilder {
    private String os;
    private String manufacturer;
    private String model;


    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,manufacturer,model);
    }
}
