public class K_Pangrams {

    public static boolean isCharacter(char ch)
    {
        if(ch>='a' && ch<='z'){
            return true;
        }

        return false;
    }

    public static boolean kPangram(String str, int k) {


        int[] arr = new int[26];

        int c=0;
        int count=0;

        char temp = ' ';

        for(int i=0;i<str.length();i++)
        {
            temp = Character.toLowerCase(str.charAt(i));

            if(isCharacter(temp)){
                arr[temp - 'a']++;

                count++;
            }
        }


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                c++;
            }
        }


        if((count>=26) && (c<=k))
        {
            return true;
        }


        return false;

    }
    public static void main(String[] args) {

        String str = "a b c d e f g h i j k l m";
        int k = 20;

        boolean res= kPangram(str,k);

        System.out.println(res);
    }
}
