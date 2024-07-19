import java.util.HashSet;

public class CheckIfAStringIsAIsogramOrNot {

   public static boolean isIsogram(String data) {

       HashSet<Character> set = new HashSet<Character>();
       HashSet<Character> h = new HashSet<Character>();

       for (int i = 0; i < data.length(); i++) {
           if (set.contains(data.charAt(i))) {
               h.add(data.charAt(i));
           } else {
               set.add(data.charAt(i));
           }
       }

       if (h.isEmpty()) {
           return true;
       }

       return false;
   }

    public static void main(String[] args) {

        String data = "machine";

        boolean res = isIsogram(data);

        System.out.println(res);


    }
}
