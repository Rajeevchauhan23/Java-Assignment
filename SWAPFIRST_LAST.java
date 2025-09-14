
import java.util.Scanner;

public class SWAPFIRST_LAST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;
        int digits = 0;
        int first = 0, last = 0;

        last = num % 10;
        while (num >= 10) {
            num /= 10;
            digits++;
        }
        first = num;
        digits++; // total number of digits

        // If only one digit, no swap needed
        if (digits == 1) {
            System.out.println("Swapped number: " + n);
            sc.close();
            return;
        }

        // Remove first and last digit from n
        int middle = n % (int)Math.pow(10, digits - 1);
        middle = middle / 10;

        // Build swapped number
        int swapped = last * (int)Math.pow(10, digits - 1) + middle * 10 + first;
        System.out.println("Swapped number: " + swapped);
        sc.close();
    }
}



           
