import java.util.HashSet;
import java.util.Stack;
public class RemoveCommonCharactersAndConcatenate {


    public static String concatenatedString(String s1,String s2)
    {
        HashSet<Character> set = new HashSet<Character>();

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s2.length();i++){

            set.add(s2.charAt(i));
        }

        for(int i=0;i<s1.length();i++){

            if(!set.contains(s1.charAt(i))){
                stack.push(s1.charAt(i));
            }
        }

        set.clear();

        for(int i=0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }

        for(int i=0;i<s2.length();i++){

            if(!set.contains(s2.charAt(i))){

                stack.push(s2.charAt(i));
            }
        }

        if(stack.isEmpty()){

            return"-1";
        }

        int len = stack.size();

        char[] arr = new char[len];
        int j=len-1;

        while(!stack.isEmpty()){

            arr[j] = stack.pop();
            j--;
        }

        String str = new String(arr);

        return str;
    }
    public static void main(String[] args) {

        String s1 = new String("aacdb");
        String s2 = new String("gafd");

    /*    String s1 = "abcs";
        String s2 = "cxzca";  */


        String res = concatenatedString(s1 , s2);

        System.out.println(res);

    }
}
