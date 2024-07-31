public class LongestCommonPrefixOfStrings {

    public static String longestCommonPrefix(String[] arr) {

        StringBuilder str = new StringBuilder("");


        int count = 0;
        int len = arr.length;

        int min_len = Integer.MAX_VALUE;
        String s = "";


        for(int k=0;k<arr.length;k++)
        {
            String m = arr[k];

            if(m.length()<min_len){
                min_len = m.length();
                s = arr[k];
            }
        }


        int i=0;
        int j=0;


        for(i=0;i<s.length();i++)
        {
            count = 0;
            for(j=0;j<arr.length;j++)
            {

                String st = arr[j];

                if(s.charAt(i) == st.charAt(i)){
                    count++;
                }

            }


            if(count==len){
                str.append(s.charAt(i));
            }

            else{
                break;
            }
        }


        String result = str.toString();

        if(result.equals(""))
        {
            return "-1";
        }


        return result;

    }

    public static void main(String[] args) {

        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};

        String res = longestCommonPrefix(arr);

        System.out.println(res);

    }
}
