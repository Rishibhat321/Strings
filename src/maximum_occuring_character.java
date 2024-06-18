import java.util.*;
import java.util.HashMap;

public class maximum_occuring_character {

    static char max_occuring(String str){

        if(str.length()==1){
            return (str.charAt(0));
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<str.length();i++){

            char temp = str.charAt(i);

            if(!map.containsKey(temp)){
                map.put(temp,1);
            }
            else{
                map.put(temp, map.get(temp)+1);
            }
        }

        int count=0;
        char c = ' ';

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            Character ch = e.getKey();
            Integer val = e.getValue();

            if(val>count){
                count = val;
                c = ch;
            }

            else if(count==val && c>ch){
                c = ch;
            }
        }

        return c;
    }
    public static void main(String[] args) {

        // find the maximum occurring character in the given string.
        // If more than one character occurs the maximum number of time then
        // print the lexicographically smaller character.

     //   String str = new String("t");
        /* Corner Case*/

        String str = new String("testsample");

        char res = max_occuring(str);

        System.out.println("The maximum occuring Character is: " + res);

    }
}
