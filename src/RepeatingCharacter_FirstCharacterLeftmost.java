import java.util.HashSet;
public class RepeatingCharacter_FirstCharacterLeftmost {

   public static int repeatedCharacter(String S)
    {
        HashSet<Character> set = new HashSet<Character>();
        HashSet<Character> h= new HashSet<Character>();

        for(int i=0;i<S.length();i++)
        {
            if(set.contains(S.charAt(i))){
                h.add(S.charAt(i));
            }

            else{
                set.add(S.charAt(i));
            }
        }

        for(int i=0;i<S.length();i++)
        {
            if(h.contains(S.charAt(i))){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

       String s = "geeksforgeeks";

       int index = repeatedCharacter(s);

       if(index== -1){
           System.out.println("There is no leftmost repeating character");
       }
       else {
           System.out.println("The leftmost index is: " + index);
       }

    }
}
