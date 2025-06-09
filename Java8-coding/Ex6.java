import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {

    public static void main(String []args){

        // sort elements in ascending and descending order

        List<Integer>list=Arrays.asList(10,50,2,6,1,40);
        List<Integer> ascendingOrder = list.stream().sorted().collect(Collectors.toList());
        List<Integer> descendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Ascending Order :"+ascendingOrder);
        System.out.println("Descending Order :"+descendingOrder);
    }
    
}
