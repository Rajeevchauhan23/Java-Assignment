public class PrintDigit {
    static void printDigit(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        printDigit(num - 1);
    }
    static void printDigitReverse(int num) {
        if (num <= 0) {
            return;
        }
        printDigitReverse(num - 1);//Tail Recursion means function call is the last statement in the function
        System.out.println(num);
    }

    public static void main(String[] args) {
        printDigit(5);
        printDigitReverse(5);
    }
}
