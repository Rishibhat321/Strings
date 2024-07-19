public class Anagram {

    public static boolean isAnagram(String a,String b)
    {

        int len1= a.length();
        int len2= b.length();

        if(len1!=len2)
        {
            return false;
        }

        int ch=256;
        int[] count=new int[ch];

        for(int i=0;i<len1;i++)
        {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";

        boolean res = isAnagram(a, b);

        System.out.println(res);

    }
}
