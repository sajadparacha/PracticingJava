package java8.streams.tradersExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

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
        //OR
//        prepareTransactions().stream().filter(t -> t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(t-> System.out.println(t.getValue()));

    }
    private void displayUniqueCities(){
        prepareTransactions().stream().map(t -> t.getTrader().getCity()).distinct().collect(Collectors.toList()).stream().forEach(System.out::println);

        //OR

        //prepareTransactions().stream().map(t -> t.getTrader().getCity()).collect(Collectors.toSet()).stream().forEach(System.out::println);

    }
    private void displayAllTradersFromCambridgeAndSortByName(){
        prepareTransactions().stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(t->t.getTrader().getName()).distinct().sorted()
                .collect(Collectors.toList()).stream().forEach(System.out::println);

    //OR
//        prepareTransactions().stream()
//                .map(Transaction::getTrader)
//                .filter(trader -> trader.getCity().equals("Cambridge"))
//                .distinct()
//                .sorted(comparing(Trader::getName))
//
//                .collect(Collectors.toList()).stream().forEach(System.out::println);


    }
    private  void displayStringOfAllTraderNamesSortedAlphabatically(){

        //This is an inefficient solution as it creates a new String object on each iteration
        //We will use joining instread
 /*       System.out.println(
                prepareTransactions().stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted()
                .reduce("" , (a,b)-> a+b)
        );
*/
        //joining internally uses StringBuilder
        System.out.println(
                prepareTransactions().stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted()
                        .collect(Collectors.joining())
        );
    }
    private boolean isThereAnyTraderBasedInMilan(){
        //System.out.println("Is there any trader from Milan" );
//        return  prepareTransactions().stream().filter(t -> t.getTrader().getCity().equals("Milan")).findFirst().isPresent();

        //OR
        //This is a better approach
        return prepareTransactions().stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    private void printValuesOfAllTransactionsFromTradersLivingInCambridge(){

        prepareTransactions().stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(transaction->transaction.getValue())
                .forEach(System.out::println);

    }

    private void printHighestValueOfAllTransactions(){
        System.out.println(
            prepareTransactions().stream().map(transaction -> transaction.getValue()).reduce(Integer::max).get()
        );
    }

    private void printSmallestValueOfAllTransactions(){
        System.out.println(
                prepareTransactions().stream().map(transaction -> transaction.getValue()).reduce(Integer::min).get()
        );


    }

    private  void printTheTransactionWithSmallestValue(){
        System.out.println(
                prepareTransactions().stream().reduce((t1,t2)-> t1.getValue()<t2.getValue()?t1:t2).get()
        );

        //OR

        System.out.println(
                prepareTransactions().stream().min(comparing(Transaction::getValue)).get()
                        //.reduce((t1,t2)-> t1.getValue()<t2.getValue()?t1:t2).get()
        );
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

        System.out.println("displayStringOfAllTraderNamesSortedAlphabatically");
        practiceStream.displayStringOfAllTraderNamesSortedAlphabatically();
        System.out.println("displayStringOfAllTraderNamesSortedAlphabatically \n");

        System.out.println("isThereAnyTraderBasedInMilan");
        System.out.println(practiceStream.isThereAnyTraderBasedInMilan());
        System.out.println("isThereAnyTraderBasedInMilan \n");

        System.out.println("printValuesOfAllTransactionsFromTradersLivingInCambridge");
        practiceStream.printValuesOfAllTransactionsFromTradersLivingInCambridge();
        System.out.println("printValuesOfAllTransactionsFromTradersLivingInCambridge \n");

        System.out.println("printHighestValueOfAllTransactions");
        practiceStream.printHighestValueOfAllTransactions();
        System.out.println("printHighestValueOfAllTransactions \n");

        System.out.println("printSmallestValueOfAllTransactions");
        practiceStream.printSmallestValueOfAllTransactions();
        System.out.println("printSmallestValueOfAllTransactions \n");


        System.out.println("printTheTransactionWithSmallestValue");
        practiceStream.printTheTransactionWithSmallestValue();
        System.out.println("printTheTransactionWithSmallestValue \n");







    }
}
