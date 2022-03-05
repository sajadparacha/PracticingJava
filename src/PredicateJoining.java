import java.util.function.Predicate;

public class PredicateJoining {

    public static void main (String args[]){

        Predicate<String> stringPredicate= a -> a.length()>=5;
        Predicate<String> stringPredicate1=b -> b.length()%2==0;

        System.out.println("Good Morning has more then 5 characters and has even character = "+ stringPredicate.and(stringPredicate1).test("Good Morning"));
        System.out.println("Good Morning has more then 5 characters or has even character = "+ stringPredicate.and(stringPredicate1).test("Good Morning"));
        System.out.println("Testing Negate "+ stringPredicate.negate().test("1234"));

    }
}
