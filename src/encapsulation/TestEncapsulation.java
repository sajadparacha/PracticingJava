package encapsulation;

public class TestEncapsulation {

    public int sum(int a,int b){
        return a+b;
    }
    private int multiply (int a,int b){
        return a*b;
    }

    public TestEncapsulation() {
        System.out.println("TestEncapsulation Constructor"+sum(1,2));
    }
}
