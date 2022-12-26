package java8.streams.dishExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class PracticeStreams {
    int[] a={1,5,7,3,2,22,23,25,90};

    public List<Dish> prepareDishBeanList(){
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
        return menu;

//        List<DishBean> dishBeanList= new ArrayList<DishBean>();
//        //Meat
//        DishBean dish1= new DishBean();
//        dish1.setType(DishBean.Type.MEAT);
//        dish1.setName("Mutton");
//        DishBean dish2= new DishBean();
//        dish2.setType(DishBean.Type.MEAT);
//        dish2.setName("Beef");
//        DishBean dish3= new DishBean();
//        dish3.setType(DishBean.Type.MEAT);
//        dish3.setName("Chicken");
//
//        //Other
//        DishBean dish4= new DishBean();
//        dish4.setType(DishBean.Type.OTHER);
//        dish4.setName("Rice");
//
//        DishBean dish5= new DishBean();
//        dish5.setType(DishBean.Type.OTHER);
//        dish5.setName("Lentil");
//        DishBean dish6= new DishBean();
//        dish6.setType(DishBean.Type.OTHER);
//        dish6.setName("Beans");
//        DishBean dish7= new DishBean();
//        dish7.setType(DishBean.Type.OTHER);
//        dish7.setName("Soup");
//        //Fish
//        DishBean dish8= new DishBean();
//        dish8.setType(DishBean.Type.FISH);
//        dish8.setName("Prawn");
//
//        DishBean dish9= new DishBean();
//        dish1.setType(DishBean.Type.FISH);
//        dish1.setName("Salmon");
//
//        dishBeanList.add(dish1);
//        dishBeanList.add(dish2);
//        dishBeanList.add(dish3);
//        dishBeanList.add(dish4);
//        dishBeanList.add(dish5);
//        dishBeanList.add(dish6);
//        dishBeanList.add(dish7);
//        dishBeanList.add(dish8);
//        return dishBeanList;
    }

    private void filterListUsingStreams(){
        List<Dish> dishList = prepareDishBeanList();
        //Arrays.stream(a).sorted(comparing(a:i));
        List<String> dishListFiltered=
                dishList.stream()
                        .filter(dish -> dish.getCalories()>300)
                        .map(Dish::getName).limit(5)
                        .collect(Collectors.toList());
                System.out.println(dishListFiltered);
        //Stream<String> s= dishListFiltered.stream();
        //s.forEach(System.out::println);
        //s.forEach(System.out::println);

    }
    private void traverseStream(){
        List<String> names=Arrays.asList("Sajjad","Ahmed","Paracha");
        names.stream().forEach(System.out::println);
    }

    private void showAllDishesByGivenType(Dish.Type type){
        prepareDishBeanList().stream()
                .filter(dish -> dish.getType()==type)
                .collect(Collectors.toList())
                .stream()
                .forEach(dish -> System.out.println(dish.getName()));
    }

    private void usingTakeWhile(){
        //If a list is already sorted use takeWhile instead of filter as it will stop ASA your predicate/boolean operation becomes false
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));
        specialMenu.stream().
                takeWhile(dish -> dish.getCalories()<450).
                collect(Collectors.toList()).stream().
                forEach(dish -> System.out.println(dish.getName()));
    }
    private void usingDropWhile(){
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));
        specialMenu.stream().
                dropWhile(dish -> dish.getCalories()>120).
                collect(Collectors.toList()).stream().
                forEach(dish -> System.out.println(dish.getName()));
    }
     private void usingLimitOperation(){
        //Get first 3 dishes which have more then 300 calories
        prepareDishBeanList().stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(4)
                .collect(Collectors.toList())
                .stream()
                .forEach(dish -> System.out.println(dish.getName()));
     }
     private void filterFirst2MeatDishes(){
        prepareDishBeanList().stream()
                .filter(dish -> dish.getType()== Dish.Type.MEAT)
                .limit(2)
                .forEach(dish -> System.out.println(dish.getName()));
     }

     private void displayLengthOfEachWordinAList(){
        List<String> list=Arrays.asList("Hello","Pakistan");

        list.stream().map(item-> item.length())
                //or .map(String::length) same as .map(item-> item.length())
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);
     }
     private void displayLengthOfNameOfEachDish(){
        prepareDishBeanList().stream()
                .map(Dish::getName)
                .sorted()
                .map(String::length)
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);
     }
     private void displayListOfUniqueCharactersFromAListOfWords(){
         List<String> list=Arrays.asList("Hello","Pakistan");
         list.stream()
                 //This will return 2 stream<String[]> items , applying distinct to it will ead to undesirable
                 //result as both items are distinct to each other but we need distinct letters in both Strings
                 .map(word-> word.split(""))
                 //This will covert each array into a seperate stream
                 //hence we will have one Stream<String>
                 .flatMap(Arrays::stream)
                 .distinct()
                 .collect(Collectors.toList())
                 .stream()
                 .forEach(System.out::println);
     }
     private void displaySquareOfEachNumberInAList(){
        List<Integer> list= Arrays.asList(2,3,4,5,6);
        list.stream().map(a->a*a)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);
     }

     private void createAndDisplayPairsOfNumberOfTwoArrays(){
        List<Integer> numbers1=Arrays.asList(1,2,3);
        List<Integer> numbers2 =Arrays.asList(4,5);

        /*
        * Create pairs like below
        *   {1,4}
            {1,5}
            {2,4}
            {2,5}
            {3,4}
            {3,5}
        * */
        //**We will have to call flatMap to convert Stream<Stream<Integer[]>> to Stream<Integer[]>
        numbers1.stream().flatMap(i ->
            //**This mapping will result in 3 Stream<Stream<Integer[]>>
            numbers2.stream().map(j-> {
                //System.out.println("New Pair = {"+i+","+j+"}");
               return new int[]{i, j};
            })
        ).collect(Collectors.toList()).stream()
                .forEach(a-> System.out.println("{"+a[0]+","+a[1]+"}"));
     }

    private void createAndDisplayPairsOfNumberOfTwoArraysWhoseSumIsDevisibleBy3(){
        List<Integer> numbers1=Arrays.asList(1,2,3);
        List<Integer> numbers2 =Arrays.asList(4,5);


        //**We will have to call flatMap to convert Stream<Stream<Integer[]>> to Stream<Integer[]>
        numbers1.stream().flatMap(i ->
                        //**This mapping will result in 3 Stream<Stream<Integer[]>>
                        numbers2.stream().filter(j-> (i+j)%3==0)
                                .map(j-> new int[] {i,j})
                ).collect(Collectors.toList()).stream()
                .forEach(a-> System.out.println("{"+a[0]+","+a[1]+"}"));
    }

    private void findVegitarianDishIfPresentPrint(){
        prepareDishBeanList().stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish-> System.out.println(dish.getName()));
    }
    private void displayCountOfMemmbersInAStream(){
        //This is not an efficient way
        System.out.println("Count Of Members in a stream -- > "+prepareDishBeanList().stream().collect(Collectors.toList()).size());


        System.out.println("Count Of Members in a stream using count method-- > "+prepareDishBeanList().stream().count());

        System.out.println("Count Of Members in a stream using map and reduce methods-- > "+prepareDishBeanList().stream().map(d->1).reduce(Integer::sum).get());


    }

    private void displayTotalNumberOfCaloriesinMenue(){
        System.out.println("Total Number Of Calories in the Maneu ==> "+prepareDishBeanList().stream().map(Dish::getCalories).reduce(Integer::sum).get());
    }
    private void useOfReduceinStreams(){

        List<Integer> numbers1 = Arrays.asList();
        //If array is empty sice reduce returns Optional there will be no NullPointerException nad we can cleanly print the value if it is present
        numbers1.stream().reduce(Integer::max).ifPresent(a-> System.out.println("Max Of Array -->"+a));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Sum Of Array using Lambda -->"+numbers.stream().reduce(0,(a,b)->a+b));
        System.out.println("Sum Of Array using Integer::sum -->"+numbers.stream().reduce(Integer::sum).get());

        //Both Of below lines are similar operations but first line is more readable
        System.out.println("Max Of Array using Integer::max -->"+numbers.stream().reduce(Integer::max).get());
        System.out.println("Max Of Array Using Lambda-->"+numbers.stream().reduce((a,b) -> (a>b)?a:b).get());

        //Both Of below lines are similar operations but first line is more readable
        System.out.println("Min Of Array Integer::min-->"+numbers.stream().reduce(Integer::min).get());
        System.out.println("Min Of Array Using Lambda -->"+numbers.stream().reduce((a,b) -> (a<b)?a:b).get());

        System.out.println("Multiplication Of Array Using Lambda -->"+numbers.stream().reduce((a,b)-> a*b).get());
        System.out.println("Multiplication Of Array -->"+numbers.stream().reduce(1,(a,b)-> a*b));




    }
    private void printSumOfCaloriesUsingMapToIntStream(){
        System.out.println(
        prepareDishBeanList().stream().mapToInt(Dish::getCalories).sum()
        );
    }

    public static void main (String args[]){
        PracticeStreams practiceStreams=new PracticeStreams();
        System.out.println("Filter a Stream");
        practiceStreams.filterListUsingStreams();
        System.out.println("Filter a Stream \n");

        System.out.println("Traverse a Stream ");
        practiceStreams.traverseStream();
        System.out.println("Traverse a Stream \n");

        System.out.println("Show "+Dish.Type.FISH+" Dishes");
        practiceStreams.showAllDishesByGivenType(Dish.Type.FISH);
        System.out.println("Show "+Dish.Type.FISH+" Dishes \n");

        System.out.println("Show "+Dish.Type.MEAT+" Dishes");
        practiceStreams.showAllDishesByGivenType(Dish.Type.MEAT);
        System.out.println("Show "+Dish.Type.MEAT+" Dishes \n");

        System.out.println("Show "+Dish.Type.OTHER+" Dishes");
        practiceStreams.showAllDishesByGivenType(Dish.Type.OTHER);
        System.out.println("Show "+Dish.Type.OTHER+" Dishes \n");


        System.out.println("usingTakeWhile");
        practiceStreams.usingTakeWhile();
        System.out.println("usingTakeWhile \n");

        System.out.println("usingDropWhile");
        practiceStreams.usingDropWhile();
        System.out.println("usingDropWhile \n");

        System.out.println("usingLimitOperation");
        practiceStreams.usingLimitOperation();
        System.out.println("usingLimitOperation \n");

        System.out.println("filterFirst2MeatDishes");
        practiceStreams.filterFirst2MeatDishes();
        System.out.println("filterFirst2MeatDishes \n");


        System.out.println("displayLengthOfEachWordinAnArray");
        practiceStreams.displayLengthOfEachWordinAList();
        System.out.println("displayLengthOfEachWordinAnArray \n");

        System.out.println("displayLengthOfNameOfEachDish");
        practiceStreams.displayLengthOfNameOfEachDish();
        System.out.println("displayLengthOfNameOfEachDish \n");


        System.out.println("displayListOfUniqueCharactersFromAListOfWords");
        practiceStreams.displayListOfUniqueCharactersFromAListOfWords();
        System.out.println("displayListOfUniqueCharactersFromAListOfWords \n");



        System.out.println("displaySquareOfEachNumberInAList");
        practiceStreams.displaySquareOfEachNumberInAList();
        System.out.println("displaySquareOfEachNumberInAList \n");

        System.out.println("createAndDisplayPairsOfNumberOfTwoArrays");
        practiceStreams.createAndDisplayPairsOfNumberOfTwoArrays();
        System.out.println("createAndDisplayPairsOfNumberOfTwoArrays \n");

        System.out.println("createAndDisplayPairsOfNumberOfTwoArraysWhoseSumIsDevisibleBy3");
        practiceStreams.createAndDisplayPairsOfNumberOfTwoArraysWhoseSumIsDevisibleBy3();
        System.out.println("createAndDisplayPairsOfNumberOfTwoArraysWhoseSumIsDevisibleBy3 \n");

        System.out.println("findVegitarianDishIfPresentPrint");
        practiceStreams.findVegitarianDishIfPresentPrint();
        System.out.println("findVegitarianDishIfPresentPrint \n");

        System.out.println("useOfReduceinStreams");
        practiceStreams.useOfReduceinStreams();
        System.out.println("useOfReduceinStreams \n");

        System.out.println("disbplayCountOfMemmbersInAStream");
        practiceStreams.displayCountOfMemmbersInAStream();
        System.out.println("disbplayCountOfMemmbersInAStream \n");


        System.out.println("displayTotalNumberOfCaloriesinMenue");
        practiceStreams.displayTotalNumberOfCaloriesinMenue();
        System.out.println("displayTotalNumberOfCaloriesinMenue \n");

        System.out.println("printSumOfCaloriesUsingMapToIntStream");
        practiceStreams.printSumOfCaloriesUsingMapToIntStream();
        System.out.println("printSumOfCaloriesUsingMapToIntStream \n");



    }
}

