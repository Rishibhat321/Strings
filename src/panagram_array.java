import java.util.*;
public class panagram_array {
    public static boolean check_panagram(String str){

        boolean[] arr = new boolean[26];
        int index=0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z'){
             index = ch-'A';
            }
            else if(ch>='a' && ch<='z'){
                index = ch - 'a';
            }
            else{
                continue;
            }

            arr[index] = true;
        }


        for(boolean ele:arr){
            if(!ele){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = new String("abdfrghrikde");

        boolean res = check_panagram(str);

        if(res){
            System.out.println("Panagram String");
        }
        else{
            System.out.println("Not Panagram");
        }

    }
}
