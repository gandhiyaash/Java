/** Method 2: Iterative Approach
 * Initialize the first and second numbers to 0 and 1.
 * Following this, we print the first and second numbers.
 * Then we send the flow to the iterative while loop where we get the next number by adding the previous two numbers and simultaneously we swap the first number
 */

public class FibonacciIterative {
    // function to print fibonacci series
    static void Fibonacci(int N){
        // initialize int num1 to 0 and int num2 to 0
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N){
            //Print the number
            System.out.println(num1 + " ");

            //Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }

    }
    // Driver Code
    public static void main(String[] args) {
        //Given Number N
        int num = 10;

        //Fibonacci Call
        Fibonacci(num);
    }

}
