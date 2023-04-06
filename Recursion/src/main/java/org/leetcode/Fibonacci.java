package src;

/** Method 1: Implementation of Fibonacci Series Using Recursion
 * Fibonacci is the summation of the two previous numbers.
 * We can use recursion as per following condition :
 * Get the number whose Fibonacci series needs to be calculated.
 * Recursively iterate from value N to 1:
 * Base Case: If the value called recursively is less than 1, then return 1 the function
 * Recursive Call: If the base case is not met, then recursively call for previous two value as:
 * recursive_function(N - 1) + recursive_function(N - 2);
 * Return Statement: At each recursive call(except the base case), return the recursive finction for the previous two value as:
 * recursive_function(N - 1) + recursive_function(N - 2);
 */

public class Fibonacci {

    // Function to Print Fibonacci Series
    static int fib(int n){;
        //base case
        if(n <= 1){
            return n;
        }
        //recursive case
        return fib(n - 1) + fib(n - 2);
    }

    // Driver Code
    public static void main(String[] args) {
        //Given Number N
        int N = 10;

        //Print the first N Numbers
        for(int i = 0; i < N; i++){
            System.out.println(fib(i) + " ");
        }
    }

}
