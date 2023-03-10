package Strings;
import java.util.*;

public class StringCharacterReplace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input: ");
        String line =sc.nextLine();

        String new_line = "";

        for(int i=0; i<line.length(); i++){
            if(line.charAt(i)== 'e'){
                new_line+='i';
            }
            else {
                new_line+= line.charAt(i);
            }
        }

        System.out.println("Output: " + new_line);

    }
}
