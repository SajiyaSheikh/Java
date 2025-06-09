import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {

    public static void main(String []args){

        // remove duplicates from string

        // String s= "abdabbefc";
        // Stream<String> stream = Arrays.stream(s.split(""));
        // List<String> collect = stream.distinct().collect(Collectors.toList());
        // collect.forEach(System.out::print);  
        
        // return the output in sorted order
        String s= "abdabbefc";
        Stream<String> stream = Arrays.stream(s.split(""));
        List<String> collect = stream.distinct().sorted().collect(Collectors.toList());
        collect.forEach(System.out::print); 
    }
    
}
