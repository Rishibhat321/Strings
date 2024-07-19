public class CheckIfStringIsASubsequenceOfOther {
    public static boolean isSubSequence(String A, String B)
    {

        int i=0,j=0;
        int len_A= A.length();
        int len_B = B.length();

        while(i<len_B && j<len_A)
        {
            if(B.charAt(i)==A.charAt(j))
            {
                j++;
                i++;
            }
            else{
                i++;
            }
        }

        if(j==len_A)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        String A = "AXY";
        String B = "YADXCP";

        boolean res = isSubSequence(A, B);

        System.out.println(res);

    }
}
