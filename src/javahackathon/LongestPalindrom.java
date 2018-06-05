package javahackathon;

import java.util.Scanner;

public class LongestPalindrom {
	public static String getLongestPalindrome(final String input) {
        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < input.length()) {
                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = input.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }

    public static void main(String ... args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the String to find the longest palindrom :");
    	String str=scan.nextLine();
       // String str = "HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE";
        String longestPali = getLongestPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Palindrome: " + longestPali);
    }

}

/*
 Output:
 
 Enter the String to find the longest palindrom :
HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE
String: HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE
Longest Palindrome: 12345678987654321
 */
