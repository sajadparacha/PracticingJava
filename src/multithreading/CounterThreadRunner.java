package multithreading;

public class CounterThreadRunner {

    public static void main (String args[]){


        Counter counter=new Counter();
        Thread thread= new Thread(counter);
        thread.setName("Counter Thread ");
        thread.start();

    }
}
