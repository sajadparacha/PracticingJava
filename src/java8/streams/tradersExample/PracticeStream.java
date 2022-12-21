package java8.streams.tradersExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeStream {

    private  List<Transaction> prepareTransactions(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }
    private void displayListOfTrasactionsIn2011AndSortByValue(){
        prepareTransactions().stream().filter(t -> t.getYear()==2011).map(Transaction::getValue).sorted().forEach(t-> System.out.println(t.longValue()));
    }
    private void displayUniqueCities(){
        prepareTransactions().stream().map(t -> t.getTrader().getCity()).distinct().collect(Collectors.toList()).stream().forEach(System.out::println);
    }
    private void displayAllTradersFromCambridgeAndSortByName(){
        prepareTransactions().stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(t->t.getTrader().getName()).distinct().sorted()
                .collect(Collectors.toList()).stream().forEach(System.out::println);
    }
    public static void main(String...args){
        PracticeStream practiceStream=new PracticeStream();
        System.out.println("displayListOfTrasactionsIn2011AndSortByValue");
        practiceStream.displayListOfTrasactionsIn2011AndSortByValue();
        System.out.println("displayListOfTrasactionsIn2011AndSortByValue \n");

        System.out.println("displayUniqueCities");
        practiceStream.displayUniqueCities();
        System.out.println("displayUniqueCities \n");


        System.out.println("displayAllTradersFromCambridgeAndSortByName");
        practiceStream.displayAllTradersFromCambridgeAndSortByName();
        System.out.println("displayAllTradersFromCambridgeAndSortByName \n");



    }
}
