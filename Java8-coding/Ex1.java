import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex1 {
    
    public static void main(String [] args){

        //Given a sentence, find the word which is longest

        String s="I am learning stream api";
        // Stream<String> stream = Arrays.stream(s.split(" "));
        // Stream<String> sorted = stream.sorted(Comparator.comparingInt(String::length).reversed());
        // System.out.println(sorted.findFirst().get());

        Stream<String> stream = Arrays.stream(s.split(" "));
        Optional<String> max = stream.max(Comparator.comparingInt(String::length));
        max.ifPresent(System.out::println);

        // Find the word which has second highest length
        Optional<String> first = Arrays.stream(s.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst();
        first.ifPresentOrElse(System.out::println, null);

        // Find the word which has second highest length and print the length
        Stream<String> sorted = Arrays.stream(s.split(" ")).sorted(Comparator.comparingInt(String::length).reversed());
        Optional<String> first2 = sorted.skip(1).findFirst();
        String second = first2.get();
        System.out.println(second+ ":"+second.length());
    }
}
