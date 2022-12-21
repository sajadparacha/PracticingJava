package java8.interfacewithmethoddeclaration;

public interface Mathematics {
    void add(int a,int b);
    default int multiply(int a, int b){
        return a/b;
    }

}
