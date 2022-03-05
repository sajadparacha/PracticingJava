import java.util.function.BiConsumer;

public class LambdaDemo {


    public static void main (String args[]){
//        LambdaDemo lambdaDemo=new LambdaDemo();
//        System.out.println(lambdaDemo.sum(10,20));

        BiConsumer<Integer,Integer> biConsumer=        (  a,  b)->System.out.println(a+b);

        biConsumer.accept(20,20);



    }

//    public Integer sum(Integer a,Integer b){
//        return a+b;
//    }
}
