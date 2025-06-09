import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {
    
    public static void main(String []args){

        // find the occurance of each word
        String s="I am learning stream api in java java";
        Map<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(collect);

        

        // Find the occurance of each character of word;
        String str="sajiya";
        Stream<String> stream = Arrays.stream(str.split(""));
        Map<String, Long> collect2 = stream.collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(collect2);

    }
}
