import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex5 {

    public static void main(String []args){

        // find even and odd from given array

        int []arr={10,13,15,24,16,73};
    //    IntStream stream = Arrays.stream(arr);
    //    IntStream filter = stream.filter(n-> n%2==0);
    //    List<Integer> collect = filter.mapToObj(Integer::valueOf).collect(Collectors.toList());
    //    System.out.println(collect);

       Map<Boolean, List<Integer>> collect = Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.partitioningBy(n-> n%2==0));
       System.out.println("Even Numbers :"+collect.get(true));
       System.out.println("Odd Numbers :"+collect.get(false));


       // Find Even and Odd from List
       List<Integer> list=Arrays.asList(10,13,15,24,16,73);
       Map<Boolean, List<Integer>> collect2 = list.stream().collect(Collectors.partitioningBy(n-> n%2==0));
       System.out.println("Even Numbers :"+collect2.get(true));
       System.out.println("Odd Numbers :"+collect2.get(false));
    }
    
}
