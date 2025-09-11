import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");   
        String str = sc.nextLine();
        sc.close();
        String result = str.replaceAll("\\s+", "");
        System.out.println("Original String: \"" + str + "\"");
        System.out.println("String after removing white spaces: \"" + result + "\"");
    }
}
