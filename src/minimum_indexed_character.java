import java.util.*;
import java.util.HashSet;

public class minimum_indexed_character {
    public static int min_Indexed(String str, String patt){

        HashSet<Character> set = new HashSet<Character>();

        for(int i=0;i<patt.length();i++){
            set.add(patt.charAt(i));
        }

        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                int index = i;
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String input =  new String("geeksforgeeks");
        String patt = new String("set");

        int res = min_Indexed(input,patt);

        if(res==-1){
            System.out.println("There is no such character");
        }else{
            System.out.println("The index of minimum indexed character is: " + res);
        }


    }
}
