public class Exp5 {

    public static void main(String []args)
    {
        //Inverted Pyramid Pattern

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int k=i;k<=4-i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
