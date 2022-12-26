package multithreading;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DoubleEachElementThreadRunner {

    public void doubleSetsThroughMultiThreading(int noOfThreads){


        for(int i=0;i<noOfThreads;i++) {
            Set<Integer> s = new HashSet<Integer>();
            for (int j = i*10; j <= (i*10+10); j++) {

                s.add(j);
            }


            DoubleEachElementInSet doubleEachElementThreadRunner =
                    new DoubleEachElementInSet(s);
            Thread thread = new Thread(doubleEachElementThreadRunner);
            thread.setName("Thread "+i);
            thread.start();
        }
    }
    public static void main(String args[]){
        DoubleEachElementThreadRunner doubleEachElementThreadRunner=new DoubleEachElementThreadRunner();
        doubleEachElementThreadRunner.doubleSetsThroughMultiThreading(2);
    }
}
