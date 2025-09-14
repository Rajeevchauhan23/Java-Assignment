
import java.util.*;
public class ScannerDemo
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        System.out.println("your name is " + name);
        System.out.println("your age is " + age);
        System.out.println("your marks is " + marks);

        //next() this is used to read data until a white space occur
        //nextline() this is used to read data until a new line occur
        
    }
    
}
