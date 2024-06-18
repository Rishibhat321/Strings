import java.util.*;

public class Reverse_string {
    public static void main(String[] args) {

        // Run-Time Input

        String str  = new String("Hello");

        int len = str.length();
        char[] s = str.toCharArray();

        int low=0;
        int high = len-1;

        while(low<high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
        }

        String st = new String(s);

        System.out.println("The reversed String is: " + st);

    }
}
