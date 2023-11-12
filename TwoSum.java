package Algoprep;

public class TwoSum {

   public static boolean isCheckTarget(int a[], int k)
   {
      
       int i = 0;
       int j = a.length - 1;
       while (i <= j) {
           if (a[i] + a[j] == k) {
               return true;
           } else if (a[i] + a[j] > k) {
               j--;
           } else {
               i++;
           }
       }
       return false;
   }

    public static void main(String[] args) {
        int a[]={12,34,56,7,89,9};
        boolean ans=isCheckTarget(a,16);
        System.out.println(ans);
    }
}
