public class Exp9 {
    
    public static void main(String []args)
    {
        // Floyd's Triangle
        int number=1;

        for(int i=1;i<4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number +" ");
                 number++;
            }
           
            System.out.println();
        }
    }
}
