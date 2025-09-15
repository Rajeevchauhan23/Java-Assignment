public class RecursionDemo {
    static void printData (int count) // Function to demonstrate recursion
    {
        if (count == 5) //this is callled the base case where the recursion stops
        {
            return;
        }
        System.out.println("JAVA");//this is called business logic and this is executed in each function call
        printData(count + 1); // Recursive call
    }
    public static void main(String[] args) 
    {
        printData(0); // Initial call to the recursive function
        
    }

}
