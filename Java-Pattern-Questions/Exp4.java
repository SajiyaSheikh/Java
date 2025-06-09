public class Exp4 {

    public static void main(String []args)
    {

        // Pyramid Pattern

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=2-i;k<=2+i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
