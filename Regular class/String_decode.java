import java.util.Scanner;
// Problem Statement

// Kamal is well-known in cryptography. So he has been provided with a program that is based on cryptography. Given an encoded string (k), he has to decode it. The pattern in which the strings were encoded was as follows:

// Encoded string: 3[a3[b]1[ab]]

// Original string: abbbababbbababbbab

// Help Kamal to write the code for the same.

// Input format :
// The input is a single line string (k) containing alphanumeric characters, square brackets ('[' and ']'), and digits ('0'-'9').

// Output format :
// The output is a single-line string representing the decoded version of the input string.

// Code constraints :
// 1 <= |k| <= 30

// Sample test cases :
// Input 1 :
// 1[b]
// Output 1 :
// b
// Input 2 :
// 3[b2[ca]]
// Output 2 :
// bcacabcacabcaca
// Input 3 :
// 3[a3[b]1[ab]]
// Output 3 :
// abbbababbbababbbab

public class String_decode {

    // Method to repeat the string
    private static String repeat(String s, int n) {
        return s.repeat(n);  // Using Java's built-in String.repeat() method
    }

    // Recursive method to decode the string
    private static String decode(String s, int i) {
        StringBuilder cur = new StringBuilder();
        int num = 0;
        
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');  // Build the number
            } 
            else if (c == '[') {
                String inner = decode(s, i + 1);  // Recurse to decode inner string
                cur.append(repeat(inner, num));  // Repeat inner string
                num = 0;  // Reset number
                i = s.indexOf(']',i);  // Skip to the end of the bracketed section
            } 
            else if (c == ']') {
                return cur.toString();
            } 
            else {
                cur.append(c);  // Normal characters
            }
        }
        
        return cur.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        System.out.println(decode(s, 0));
    }
}
