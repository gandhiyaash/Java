/** Method 1 – Using Recursion:
 * Fibonacci Number is the summation of the two previous numbers. We can use recursion as per the following condition:
 *   1. Get the number whose Fibonacci series needs to be calculated.
 *   2. Recursively iterate from value N to 1:
 *      Base case: If the value called recursively is less than 1, the return 1 the function.
 *      Recursive call: If the base case is not met, then recursively call for previous two value as:
 *      recursive_function(N – 1) + recursive_function(N – 2);
 *      Return statement:
 *      At each recursive call(except the base case), return the recursive function for the previous two value as:
 *      recursive_function(N – 1) + recursive_function(N – 2);
 *      Below is the implementation of the above approach
 */

public class Fibonacci {
    // Function to calculate Fibonacci Series:
    static int fib(int n){
        // Base Case
        if(n <= 1){
            return n;
        }
        //Recursive Condition
        return fib(n - 1) + fib(n - 2);
    }

    // Driver Code
    public static void main(String[] args) {
        int N = 10;
        //Print first 10 numbers
        for(int i = 0; i < N; i++){
            System.out.println(fib(i) + " ");
        }

    }
}
