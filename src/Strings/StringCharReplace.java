package Strings;

import java.util.Scanner;

public class StringCharReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input: ");
        String line = sc.nextLine();

        String username = "";

        for(int i=0; i<line.length(); i++){
            if(line.charAt(i)== '@'){
                break;
            }
            else {
                username += line.charAt(i);
            }
        }

        System.out.println("Output: " + username);



    }
}
