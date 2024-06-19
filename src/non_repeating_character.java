import java.util.*;
import java.util.HashSet;
public class non_repeating_character {
    public static char nonRepeating(String str){

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

            if(!h.contains(str.charAt(i))){
                char c = str.charAt(i);
                return c;
            }
        }

        return '$';
    }
    public static void main(String[] args) {
        String str = new String("hello");

        char res = nonRepeating(str);

        if(res=='$'){
            System.out.println("There is no Non-Repeating Character");
        }
        else{
            System.out.println("The Non-Repeating Character is: " + res);
        }

    }
}
