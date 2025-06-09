
/*Hollow inverted pyramid pattern
Problem Description

Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*________* // 8 spaces

**______** // 6 spaces

***____*** // 4 spaces

****__**** // 2 spaces

********** // 0 spaces

NOTE: Here ‘_’ is used to represent spaces. You have to print spaces in your code.

</div>
Problem Constraints

<div id=problem_constraints_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p>2 <= N <= 100</p>
</div>

Input Format

<div id=input_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p>First and only line of input contains a single integer N.</p></div>

Output Format

<div id=output_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p>Output the Full Pyramid pattern corresponding to the given N.</p></div>

Example Input

<div id=example_input_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p>Input 1:</p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p>

 2
Input 2:

 3
</div>

Example Output

<div id=example_output_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p>Output 1:</p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p>

*__* // 2 spaces

**** // 0 spaces
Output 2:

*____* // 4 spaces

**__** // 2 spaces

****** // 0 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.


</div>

Example Explanation

<div id=example_explanation_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><pre> Print the pattern as described.</pre></div>


User Code */

import java.lang.*;
import java.util.*;

public class Attempt_1_Contest_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Input number of rows

        for (int i = 1; i <= N; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces
            int spaces = 2 * (N - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}