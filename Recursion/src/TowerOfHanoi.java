/**
 *
 * Create a function towerOfHanoi where pass int N(current number of disk), from_rod, to_rod, aux_rod.
 * Make a function call for N - 1 the disk
 * Then print the current the disk along with from_rod and to_rod
 * Again make function call for N - 1 th disk
 * Below is the implementation of the above approach.
 * Time Complexity : O(2^N), There are two possibilities for every disk. Therefore, 2*2*2*.....*2(N times) is 2^N
 * Auxiliary Space: O(N), Function call stack space
 */

public class TowerOfHanoi {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
        //Base condition
        if(n == 0){
            return;
        }
        // Recursive Case
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move Disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    // Driver Code
    public static void main(String[] args) {
        int N = 3;

        // A,B and C are names of the rods
        towerOfHanoi(N, 'A','C','B');
    }
}
