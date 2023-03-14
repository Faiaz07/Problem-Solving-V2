package Strings;

import java.util.*;

public  class ValidAnagramLeetCode {
    public static boolean isAnagram(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }

        int count[] = new int[26];

        for (int i=0; i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s = sc.nextLine();

        System.out.println("Enter second string: ");
        String t = sc.nextLine();

        System.out.println(isAnagram(s,t));

    }

}
