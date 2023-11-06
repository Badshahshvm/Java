package Algoprep;

import java.util.HashSet;

public class NonRepeating {
    public static int distinctNumber(int a[])
    {
        HashSet<Integer> hs=new HashSet<>();

        int n=a.length;
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        return hs.size();


    }
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,4,5};
      int ans=distinctNumber(a);
        System.out.println(ans);

    }
}
