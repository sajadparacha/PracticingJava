package java8.streams.numaricStreams;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class PracticeNumaricStreams {

    private void printNumberOfEvenNumbersInAGivenRange(){
        IntStream intStream=IntStream.rangeClosed(1,100)
                .filter(a->a%2==0)
                ;
        System.out.println("Number of even numbers = "+intStream.count());

    }
    private void printSumOfEvenNumbersInAGivenRange(){
        IntStream intStream=IntStream.rangeClosed(1,10)
                .filter(a->a%2==0)
                ;
        System.out.println("Sum of even numbers = "+intStream.sum());

    }
    private void printSumOfAllElementsInArrayUsingStreams(){
        int[] a= {1,2,3,4,5,6,7};
        //This will convert an array of int to IntStream
        System.out.println(Arrays.stream(a).sum());

    }
    public static void main(String...args){


        PracticeNumaricStreams practiceNumaricStreams=new PracticeNumaricStreams();


        System.out.println("printNumberOfEvenNumbersInAGivenRange");
        practiceNumaricStreams.printNumberOfEvenNumbersInAGivenRange();
        System.out.println("printNumberOfEvenNumbersInAGivenRange \n");


        System.out.println("printSumOfEvenNumbersInAGivenRange");
        practiceNumaricStreams.printSumOfEvenNumbersInAGivenRange();
        System.out.println("printSumOfEvenNumbersInAGivenRange \n");

        System.out.println("printSumOfAllElementsInArrayUsingStreams");
        practiceNumaricStreams.printSumOfAllElementsInArrayUsingStreams();
        System.out.println("printSumOfAllElementsInArrayUsingStreams \n");



    }
}
