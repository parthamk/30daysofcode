// Hacker Rank #30daysofcode Day 0- Hello, World
// https://www.hackerrank.com/challenges/30-hello-world/problem?isFullScreen=true

// solution

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello, World."); //greeting text
        
        String inputString = sc.nextLine();
        System.out.print(inputString);
    }
}
