package Algoprep;

public class Search {

    public static boolean binarysearch(int a[], int k)
    {

        int s=0;
        int e=a.length-1;
        while(s<=e)
        {
            int m=(s+e)/2;

            if(a[m]==k)
            {
                return true;
            }
            else if(a[m]<k)
            {
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={12,34,56,78,90};
        boolean ans=binarysearch(a,56);
        System.out.println(ans);

    }
}
