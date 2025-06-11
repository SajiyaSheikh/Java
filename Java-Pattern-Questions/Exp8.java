public class Exp8 {
    
    public static void main(String []args)
    {
        // inverted Number Triangle Pattern

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
