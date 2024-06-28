import java.util.*;
import java.util.Stack;
public class reverseVowels_lowercase {

    public static String modify (String s)
    {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                stack.push(ch);
            }
        }

        char[] arr = s.toCharArray();

        if(stack.isEmpty()){
            return s;
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]=='a'|| arr[i]=='e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u')
            {
                arr[i] = stack.pop();
            }
        }

        String str = new String(arr);

        return str;
    }
    public static void main(String[] args) {
        String s = new String("practice");

        String res = modify(s);

        System.out.println(res);
    }
}
