import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex8 {
    
    public static void main(String []args){

        // find first non-repeating character from string
        String str="Ehllo World";
        // Stream<String> stream = Arrays.stream(str.split(""));
        // Optional<String> first = stream.distinct().findFirst();
        // first.ifPresent(System.out::print);

        Map<String, long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
        collect.forEach(System.out::println);
    }
}
