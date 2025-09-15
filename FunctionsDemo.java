public class FunctionsDemo 
{
    void sum1 ()//this is the first type of function which does not return any value and does not take any parameter
    {
        
    } 
    void sum2 (int a, int b)//this is the second type of function which does not return any value but takes parameters
    {

    }
    int sum3 ()//this is the third type of function which returns a value but does not take any parameter
    {
        return 0;
    }
    int sum4 (int a, int b)//this is the fourth type of function which returns a value and takes parameters of int type
    {
        return a+b;
    }
    static void sum5 (String name)//this is the fifth type of function which does not return any value but takes parameters of String type
    //but this function can only have one string parameter
    {

    }
    public static void main(String[] args) 
    {
        FunctionsDemo.sum5("Hello");
        
        
    }
}