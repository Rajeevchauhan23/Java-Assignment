import java.util.*;
public class RhombusPattern {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rhombus: ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
