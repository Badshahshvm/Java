package Algoprep;

import java.util.Arrays;

public class Floor {

    public static int binaryFloor(int a[], int k)
    {
        Arrays.sort(a);

        int s=0;
        int e=a.length-1;
        int ans=0;

        while(s<=e)
        {
            int m=(s+e)/2;
            if(a[m]==k)
            {
                return m;
            }

            else if(a[m]<k)
            {
                ans=a[m];
                s=m+1;
            }
            else {
                e=m-1;

            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int a[]={12,3,4,56,78,19};
        int ans=binaryFloor(a,5);
        System.out.println(ans);

    }
}
