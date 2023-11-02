//import java.util.*;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class Main2 {
//
//    public static void main(String[] args) {
//
//        // Get the List
//        List<String> stringList = Arrays.asList("maktab", "is", "maktab", "sharif", "maktab", "is", "good");
//
//        // Collect the list as map
//        // by groupingBy() method
//        Map<String, Long> result
//                = stringList.stream().collect(
//                Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()));
//
//        // Print the result
//        System.out.println(result);
//    }
//}
//
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Sajjad", "Meshkat", "Mahdi", "Mojtaba", "Mohammad", "Ali", "Taher", "Reza", "Mohsen");

        // {"Amir", "Hatef", "Mahdi", "Mojtaba", "Mohammad", "Ali", "Taher", "Reza", "Mohsen"};


        Map<String, Integer> sorted = stringList.stream()
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(" question 1 :");
        System.out.println(sorted);

        Map<Integer, List<String>> groupingBy = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(" question 2 :");

        System.out.println(groupingBy);
    }
}

