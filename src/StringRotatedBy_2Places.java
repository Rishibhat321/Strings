public class StringRotatedBy_2Places {


    public static void left_rotate(char arr1[], int len, int d)
    {
        reverse(arr1,0,d-1);
        reverse(arr1,d,len-1);
        reverse(arr1,0,len-1);
    }

    public static void reverse(char arr[], int low, int high)
    {
        while(low<high)
        {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }


    public static void right_rotate(char arr2[], int len, int d)
    {

        reverse(arr2,0,len-1);
        reverse(arr2,0,d-1);
        reverse(arr2,d,len-1);
    }

    public static boolean isRotated(String str1, String str2)
    {

        int len = str1.length();

        char[] arr1 = new char[len];
        char[] arr2 = new char[len];

        for(int i=0;i<len;i++)
        {
            arr1[i] = str1.charAt(i);
            arr2[i] = str1.charAt(i);
        }

        int d=2;
        d = d%len;

        if(len<=0)
        {
            return false;
        }

        left_rotate(arr1,len,d);

        String string1 = new String(arr1);

        if(string1.equals(str2)){
            return true;
        }

        right_rotate(arr2,len,d);

        String string2 = new String(arr2);

        if(string2.equals(str2))
        {
            return true;
        }


        return false;

    }

    public static void main(String[] args) {

        String str1 = "amazon";
        String str2  = "azonam";

        boolean res = isRotated(str1, str2);

        System.out.println(res);

    }
}
