public class SumOfNumbersInString {
    public static long findSum(String str)
    {

        String e = "0";

        long sum =0;

        for(int i=0;i<str.length();i++)
        {
            char temp = str.charAt(i);

            if(temp >= '0' && temp <= '9'){
                e += temp;
            }
            else{

                sum +=  Integer.parseInt(e);
                e = "0";
            }
        }

        sum += Integer.parseInt(e);

        return sum;
    }
    public static void main(String[] args) {

        String str = "1abc23";

        long sum = findSum(str);

        System.out.println(sum);

    }
}
