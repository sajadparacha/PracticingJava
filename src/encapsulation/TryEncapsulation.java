package encapsulation;

public class TryEncapsulation extends TestEncapsulation{
//    public int sum(int a,int b){
//        return 0;
//    }

    public TryEncapsulation() {
        super();
    }

    public static void main (String args[]){
        TryEncapsulation tryEncapsulation=new TryEncapsulation();
        System.out.println("TryEncapsulation.main "+tryEncapsulation.sum(1,2));
    }
}
