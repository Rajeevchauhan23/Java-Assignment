import java.util.*;
public class RemoveWhiteSpace 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String s = str.replaceAll(" ","");
    System.out.println("String after removing white spaces: " + s );

    }
       
}