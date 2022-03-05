public class FunctionalInterfaceImplementation implements MyFunctionalInterface{
    @Override
    public void abstractMethod() {
        System.out.println("abstract method called");
    }
    public static void main (String args[]){
        FunctionalInterfaceImplementation functionalInterfaceImplementation=new FunctionalInterfaceImplementation();
        System.out.println(functionalInterfaceImplementation.sum(1,2));
        System.out.println(MyFunctionalInterface.multiply(4,2));
    }
}
