package multithreading;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DoubleEachElementInSet implements  Runnable{
    Set<Integer> s =new HashSet<Integer>();

    public DoubleEachElementInSet(Set<Integer> s) {
        this.s = s;
    }

    @Override
    public void run() {

        Iterator<Integer> i= s.iterator();
        while(i.hasNext() ){
            Integer a=i.next()*2;
            System.out.println("From Thread "+Thread.currentThread().getName()+" "+a);
        }
    }
}
