import java.util.Stack;
import java.util.HashSet;
public class RemoveDuplicates {

   public static String removeDups(String str) {

        HashSet<Character> set = new HashSet<Character>();
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<str.length();i++)
        {
            if(!set.contains(str.charAt(i))){

                stack.push(str.charAt(i));
            }

            set.add(str.charAt(i));
        }

        if(stack.isEmpty())
        {
            return str;
        }

        int len = stack.size();

        char[] arr = new char[len];

        int j = len-1;

        while(!stack.isEmpty())
        {
            arr[j] = stack.pop();
            j--;
        }

        String s = new String(arr);

        return s;
    }
    public static void main(String[] args) {

       String str = "zvvo";

       String res = removeDups(str);

        System.out.println("Resultant String is: " + res);

    }
}
