public class PrintJava1_5timeByRecursion {
    static void printJava1(int count) {
        if (count == 5) {
            return;
        }

        System.out.println("count"); 
        printJava1(count + 1);
    }
    static void printJava2(int count) {
        if (count <= 0) {
            return;
        }
        System.out.println("JAVA");
        printJava2(count - 1);
    }

    public static void main(String[] args) {
        printJava1(0); 
        printJava2(1);
    }   
}
