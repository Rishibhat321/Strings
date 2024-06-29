public class EqualSum {
    public static String equilibrium(int arr[], int n) {

        if(n==0){
            return "N0";
        }

        if(n==1){
            return "YES";
        }

        int suffix = 0;
        int prefix = 0;

        for(int i=0;i<n;i++){
            suffix += arr[i];
        }

        for(int i=0;i<n;i++)
        {
            suffix -= arr[i];

            if(suffix==prefix){
                return "YES";
            }
            else{
                prefix += arr[i];
            }
        }

        return "NO";
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3};
        int n = arr.length;

        String res = equilibrium(arr,n);

        System.out.println(res);

    }
}
