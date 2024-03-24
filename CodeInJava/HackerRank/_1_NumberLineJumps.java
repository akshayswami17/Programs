// You are choreographing a circus show with various animals. For one act, you
// are given two kangaroos on a number line ready to jump in the positive
// direction (i.e, toward positive infinity).

// The first kangaroo starts at location and moves at a rate of meters per jump.
// The second kangaroo starts at location and moves at a rate of meters per
// jump.
// You have to figure out a way to get both kangaroos at the same location at
// the same time as part of the show. If it is possible, return YES, otherwise
// return NO.

// Example

// After one jump, they are both at , (, ), so the answer is YES.

// Function Description

// Complete the function kangaroo in the editor below.

// kangaroo has the following parameter(s):

// int x1, int v1: starting position and jump distance for kangaroo 1
// int x2, int v2: starting position and jump distance for kangaroo 2
// Returns

// string: either YES or NO
// Input Format

// A single line of four space-separated integers denoting the respective values
// of , , , and .

// Constraints

// Sample Input 0

// 0 3 4 2
// Sample Output 0

// YES
// Explanation 0

// The two kangaroos jump through the following sequence of locations:

// image

// From the image, it is clear that the kangaroos meet at the same location
// (number on the number line) after same number of jumps ( jumps), and we print
// YES.

// Sample Input 1

// 0 2 5 3
// Sample Output 1

// NO
// Explanation 1

// The second kangaroo has a starting location that is ahead (further to the
// right) of the first kangaroo's starting location (i.e., ). Because the second
// kangaroo moves at a faster rate (meaning ) and is already ahead of the first
// kangaroo, the first kangaroo will never be able to catch up. Thus, we print
// NO.

// Language
// Java 8
// More
// 404142434445464748495051525354555657585960
// * 2. INTEGER v1
// * 3. INTEGER x2
// * 4. INTEGER v2
// */

// public static String kangaroo(int x1, int v1, int x2, int v2) {
// // If both kangaroos start at the same position and have the same jump
// distance, they will meet.
// if (x1 == x2 && v1 == v2)
// return "YES";

// Line: 24 Col: 8

// Test against custom input
// Congratulations!

// You have passed the sample test cases. Click the submit button to run your
// code against all the test cases.

// Sample Test case 0

// Sample Test case 1
// Input (stdin)
// 0 3 4 2
// Your Output (stdout)
// YES
// Expected Output
// YES

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. INTEGER x1
     * 2. INTEGER v1
     * 3. INTEGER x2
     * 4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // If both kangaroos start at the same position and have the same jump distance,
        // they will meet.
        if (x1 == x2 && v1 == v2)
            return "YES";

        // If both kangaroos start at different positions and have the same jump
        // distance, they will never meet.
        if (x1 != x2 && v1 == v2)
            return "NO";

        // If one kangaroo starts ahead of the other and also jumps faster, they will
        // never meet.
        if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1))
            return "NO";

        // Calculate the number of jumps required for both kangaroos to meet.
        int jumps = Math.abs((x1 - x2) / (v1 - v2));

        // If the positions match after the same number of jumps, they meet.
        if (x1 + jumps * v1 == x2 + jumps * v2)
            return "YES";
        else
            return "NO";
    }

}

public class _1_NumberLineJumps {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
 * Problem Statement:
 * You are given two kangaroos positioned on a number line, each starting at a
 * specific location and with a specific jump distance. The objective is to
 * determine whether both kangaroos will meet at the same location after the
 * same number of jumps. If it is possible for them to meet, return "YES";
 * otherwise, return "NO".
 * 
 * Explanation of Code:
 * kangaroo Method:
 * 
 * The kangaroo method takes four parameters: x1, v1, x2, and v2.
 * x1 and x2 represent the initial positions of the first and second kangaroos,
 * respectively.
 * v1 and v2 represent the jump distances of the first and second kangaroos,
 * respectively.
 * Edge Cases Handling:
 * 
 * The first if statement checks if both kangaroos start at the same position
 * and have the same jump distance. In this case, they will meet regardless of
 * their positions, so it returns "YES".
 * The second if statement checks if both kangaroos start at different positions
 * but have the same jump distance. In this case, they will never meet, so it
 * returns "NO".
 * The third if statement checks if one kangaroo starts ahead of the other and
 * also jumps faster. In such cases, they will never meet, so it returns "NO".
 * Calculation of Number of Jumps:
 * 
 * If none of the above conditions are met, it calculates the number of jumps
 * required for both kangaroos to meet. This is done by finding the absolute
 * difference between their starting positions and dividing it by the absolute
 * difference between their jump distances.
 * Checking if Kangaroos Meet:
 * 
 * It then checks if the positions match after the same number of jumps for both
 * kangaroos. If they do, it means they will meet at that position, so it
 * returns "YES".
 * If the positions don't match after the same number of jumps, it returns "NO"
 * because they won't meet.
 * Example:
 * Let's consider an example input: 0 3 4 2.
 * 
 * First kangaroo starts at position 0 and jumps 3 units each time.
 * Second kangaroo starts at position 4 and jumps 2 units each time.
 * According to the logic in the code:
 * 
 * The first kangaroo will jump 0, 3, 6, 9, ... units.
 * The second kangaroo will jump 4, 6, 8, 10, ... units.
 * After one jump, both kangaroos are at position 3, so they meet. Hence, the
 * function will return "YES".
 * 
 * This code efficiently handles various scenarios and returns the correct
 * result based on the inputs provided.
 */
