
public class ModifiedString {
    public static long modified(String a)
    {
        int count=0;
        int c=0;

        for(int i=0;i<a.length()-1;i++){

            if(a.charAt(i)==a.charAt(i+1)){
                count++;

                if(count==2){
                    c++;
                    count=0;
                }
                else{
                    continue;
                }
            }
            else{
                count=0;
            }
        }

        return c;
    }
    public static void main(String[] args) {

        String a = "aaaaa";
        long res = modified(a);

        System.out.println(res);

    }
}