import java.math.BigDecimal;
import java.util.Map;
import java.util.Random;
import java.util.function.*;

public class LambdaUtil {

    //1
    public static Supplier<String> helloSupplier() {
        return () -> "Hello";
    }

    //2
    public static Predicate<String> isEmptyPredicate() {
        return String::isEmpty;
    }

    //3
    public static BiFunction<String, Integer, String> stringMultiplier() {
        return (s, number) -> {
            String result = "";
            for (int i = 0; i < number; i++) {
                result += s + " ";
            }
            return result;
        };
    }

    //4
    public static Function<BigDecimal, String> toDollarStringFunction() {
        return bigDecimal -> "$" + bigDecimal;
    }

    //5
    public static Predicate<String> lengthInRangePredicate(int min, int max) {
        return s -> s.length() < max && s.length() > min;
    }

    //6
    public static IntSupplier randomIntSupplier() {
        return () -> new Random().nextInt();
    }

    //7
    public static IntUnaryOperator boundedRandomIntSupplier() {
        return number -> new Random().nextInt(number);
    }

    //8
    public static IntUnaryOperator intSquareOperation() {
        return number -> number * number;
    }

    //9
    public static LongBinaryOperator longSumOperation() {
        return Long::sum;
    }

    //10
    public static ToIntFunction<String> stringToIntConverter() {
        return Integer::parseInt;
    }

    //11
    public static Supplier<IntUnaryOperator> nMultiplyFunctionSupplier(int n) {
        return () -> x -> x*n;
    }

    //12
    public static Supplier<Supplier<Supplier<String>>> trickyWellDoneSupplier() {
        return () -> () -> () -> "WELL DONE";
    }

    //13
    public static UnaryOperator<Function<String, String>> composeWithTrimFunction() {
        return stringStringFunction -> stringStringFunction.compose(String::trim);
    }

    //14
    public static BiFunction<IntUnaryOperator, IntPredicate, IntUnaryOperator> functionToConditionalFunction() {
        return (intUnaryOperator , intPredicate) -> {
            int x =0 ;
            if (intPredicate.test(intUnaryOperator.applyAsInt(x))){
                return intUnaryOperator;
            }
            return intUnaryOperator;
        };
    }

    /**
     * Returns a {@link BiFunction} which first parameter is a {@link Map} where key is a function name, and value is some
     * {@link IntUnaryOperator}, and second parameter is a {@link String} which is a function name. If the map contains a
     * function by a given name then it is returned by high order function otherwise an identity() is returned.
     *
     * @return a high-order function that fetches a function from a function map by a given name or returns identity()
     */
    //15
    public static BiFunction<Map<String, IntUnaryOperator>, String, IntUnaryOperator> functionLoader() {
        //todo :: extra points
        return null;
    }
}
