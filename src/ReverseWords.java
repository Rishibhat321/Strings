public class ReverseWords {

    public static void reverse(char[] str, int low, int high){

        while(low<high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            low++;
            high--;
        }
    }

    public static String reverseWords(String S)
    {
        int len = S.length();
        int start=0;
        char[] str= new char[len];

        for(int i=0;i<len;i++)
        {
            str[i]  = S.charAt(i);
        }


        for(int end=0;end<str.length;end++)
        {
            if(str[end]=='.'){
                reverse(str,start,end-1);
                start=end+1;
            }
        }

        reverse(str,start,len-1);
        reverse(str,0,len-1);


        String st = new String(str);

        return st;
    }
    public static void main(String[] args) {

        String S = "i.like.this.program.very.much";

        String res = reverseWords(S);

        System.out.println(res);

    }
}
