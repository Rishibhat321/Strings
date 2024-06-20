import java.util.*;
import java.util.HashSet;

public class panagramCheck {
    public static boolean check_Panagram(String str){

        HashSet<Character> set = new HashSet<>();
        char ch = 'a';

        while(ch<='z'){
            set.add(ch);
            ch++;
        }

        for(int i=0;i<str.length();i++){

             ch = Character.toLowerCase(str.charAt(i));
            if(set.contains(ch)){
                 set.remove(ch);
            }
        }


        return (set.isEmpty());
    }
    public static void main(String[] args) {
        String input = new String("Bawds jog, flick quartz, vex nymph");

        boolean res = check_Panagram(input);

        if(res){
            System.out.println("String is Panagram");
        }else{
            System.out.println("String is not Panagram");
        }

    }
}
