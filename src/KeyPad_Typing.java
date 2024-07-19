public class KeyPad_Typing {

    public static String printNumber(String s, int n)
    {
        int len = s.length();

        char[] arr = new char[len];

        for(int i=0;i<len;i++)
        {
            char ch1 = s.charAt(i);
            char ch = Character.toLowerCase(ch1);

            if(ch == 'a' || ch == 'b' || ch == 'c'){
                arr[i] = '2';
            }

            else if(ch == 'd' || ch == 'e' || ch == 'f'){
                arr[i] = '3';
            }

            else if(ch == 'g' || ch == 'h' || ch == 'i'){
                arr[i] = '4';
            }

            else if(ch == 'j' || ch == 'k' || ch == 'l'){
                arr[i] = '5';
            }

            else if(ch == 'm' || ch == 'n' || ch == 'o'){
                arr[i] = '6';
            }

            else if(ch == 'p' || ch == 'q' || ch == 'r' || ch == 's'){
                arr[i] = '7';
            }

            else if(ch == 't' || ch == 'u' || ch == 'v'){
                arr[i] = '8';
            }

            else{
                arr[i] = '9';
            }
        }

        String st = new String(arr);

        return st;

    }
    public static void main(String[] args) {

        String s = "geeksquiz";

        String res = printNumber(s, s.length());

        System.out.println(res);

    }
}
