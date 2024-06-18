import java.util.*;

public class Check_palindrome {
   static public boolean palindrome_string(String str){

        int len = str.length();
        int low=0;
        int high = len-1;

        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }

            low++;
            high--;
        }

        return true;
    }

    public static void main(String[] args) {

        // Run-Time Input

        String str = new String("madam");
        boolean res = palindrome_string(str);

        if(res){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
