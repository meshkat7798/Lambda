import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        // Get the List
        List<String> stringList = Arrays.asList("maktab", "is", "maktab", "sharif", "maktab", "is", "good");

        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
                = stringList.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        // Print the result
        System.out.println(result);
    }
}

