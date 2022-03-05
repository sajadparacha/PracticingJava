import java.util.function.Predicate;

public class PredicateFunctionPractice {

    public static void main (String args[]){

        Predicate<String> stringPredicate= s-> s.length()>=5;
        System.out.println("The length of the String parameter is greater then or equalto 5 =" +stringPredicate.test("Good Morning"));
        System.out.println("The length of the String parameter is greater then or equalto 5 =" +stringPredicate.test("Good"));
//       System.out.println("The length of the String parameter is greater then or equalto 5 =" +stringPredicate.test(null));

        System.out.println("Check Length method called, the result is true"+checkLength("abcdrtu"));
//        System.out.println("Check Length method called, the result is true"+checkLength(null));
    }

    public static boolean checkLength(String a){
        if(a.length()>=5){
            return true;
        }else
            return false;
    }
}
