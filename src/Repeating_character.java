import java.util.*;
import java.util.HashSet;

public class Repeating_character {
    public static int leftmost_repeat(String str){

        HashSet<Character> set = new HashSet<Character>();
        HashSet<Character> h = new HashSet<Character>();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(set.contains(ch)){
                 h.add(ch);
            }
            else{
                set.add(ch);
            }
        }

        for(int i=0;i<str.length();i++){
            if(h.contains(str.charAt(i))){
                int index = i;
                return index;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
         //Repeating Character Leftmost

         String str = new String("abcd");

        int res = leftmost_repeat(str);

        if(res==-1){
            System.out.println("There is no repeating character");
        }
        else{
            System.out.println("The index of the leftmost repeating character is: " + res);
        }


    }
}
