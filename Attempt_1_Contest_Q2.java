
/*Count-Apples
Problem Description

Rahul has N Apples initially, Karan has M apples initially. Rahul gave 5 apples to Karan and after some time Rahul plucked 2 times Initial apples (N) he had from Tree. Find out the total number of apples Rahul and Karan are left with.


Problem Constraints
1 <= N <= 1000
1 <= M <= 1000


Input Format
First Line is N the initial number of apples Rahul has.
Second Line is M the initial number of apples Karan has.


Output Format
Print the total number of Apples Rahul & Karan has separated by a space.


Example Input
50
30


Example Output
145 35


Example Explanation
N = 50, M = 30

Rahul gave 5 apples to Karan, 
Count of apples (Rahul) = 45 & Count of apples (Karan) = 35

Rahul Plucked 2N apples from tree,
Count of apples (Rahul) = 45 + 100 & Count of apples (Karan) = 35


User Code
 */

import java.lang.*;
import java.util.*;

public class Attempt_1_Contest_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Rahul's initial apples
        int M = sc.nextInt(); // Karan's initial apples

        // Rahul gives 5 apples to Karan
        N = N - 5;
        M = M + 5;

        // Rahul plucks 2 times initial apples (2 * original N)
        N = N + (2 * (N + 5)); // Because original N was N + 5 (before subtraction)

        System.out.println(N + " " + M);
    }
}