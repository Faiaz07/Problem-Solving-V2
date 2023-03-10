// RECURSION IS USED IN THIS SOLUTION

package Strings;

import java.util.*;
public class ValidPalindromeLeetCode {
    static boolean validPalindrome(String str,int first, int last ){
        if(first>=last){
        return true;
        }

        if(str.charAt(first) != str.charAt(last)){
            return false;
        }

        return validPalindrome(str, first+1, last-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String line = sc.nextLine();
        String alphanumeric_line = line.replaceAll("[^a-zA-Z0-9]","");
        String str = alphanumeric_line.toLowerCase();

        System.out.println(validPalindrome(str,0, str.length()-1));


    }


}


//---------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------
//                              LEET CODE

/*

class Solution {
    public static boolean validPalindrome(String str,int first, int last ){
        if(first>=last){
            return true;
        }

        if(str.charAt(first) != str.charAt(last)){
            return false;
        }

        return validPalindrome(str, first+1, last-1);

    }
    public static boolean isPalindrome(String s) {
        String alphanumeric_line = s.replaceAll("[^a-zA-Z0-9]","");
        String str = alphanumeric_line.toLowerCase();
        return validPalindrome(str, 0, str.length()-1);

    }


}

 */
