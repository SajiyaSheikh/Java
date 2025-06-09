import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex7 {
    
    public static void main(String []args){

        // find the sum of unique elements of an array
        int []arr={2,5,1,2,7,3,5};
        IntStream distinct = Arrays.stream(arr).distinct();
        int sum = distinct.sum();
        System.out.println(sum);


        // Find the sum of unique elements of list
        List<Integer> list= Arrays.asList(2,5,1,2,7,3,5);
        Stream<Integer> distinct2 = list.stream().distinct();
        IntStream mapToInt = distinct2.mapToInt(Integer:: intValue);
        int sum2 = mapToInt.sum();
        System.out.println(sum2);

    }
}
