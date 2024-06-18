import java.util.*;
import java.util.Stack;
public class Reverse_usingStack {
    static void reverse_stack(String str){

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }

        int len = stack.size();
        char[] ch = new char[len];
        int j=0;

        while(!stack.isEmpty()){
            ch[j] = stack.pop();
            j++;
        }

        String s = new String(ch);

        System.out.println("The reversed String is: " + s);
    }
    public static void main(String[] args) {
        String str = new String("Sample");

        reverse_stack(str);

    }
}
