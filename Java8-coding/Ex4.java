import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4 {

    public static void main(String args[]){

        // find the word having vowels=2

        String s="I am learning stream api in java";
        Stream<String> stream = Arrays.stream(s.split(" "));
        stream.forEach(word->{

            int count= Ex4.checkVowels(word);
            if(count==2)
            System.out.println(word);
            

        });
    }
    
    public static int checkVowels(String word){

        char []chars=word.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]==('a')||chars[i]==('e')||chars[i]==('i')||chars[i]==('o')||chars[i]==('u'))
            count ++;
        }
        return count;
    }
}