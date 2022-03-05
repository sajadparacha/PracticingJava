@FunctionalInterface
public interface MyFunctionalInterface {

    void abstractMethod();

    default int sum(int a,int b){
        return a+b;
    }
    static int multiply(int a,int b){
        return a*b;
    }

}
