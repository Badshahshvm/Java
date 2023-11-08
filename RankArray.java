package Algoprep;

import java.util.Arrays;
import java.util.HashMap;

public class RankArray {
    public static int[] findRank(int a[])
    {
        int c[]=new int[a.length];
        for(int i=0;i<c.length;i++)
        {
            c[i]=a[i];
        }

        Arrays.sort(c);
        int rank=1;

        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<c.length;i++)
        {
            if(!m.containsKey(c[i]))
            {
                m.put(c[i],rank);
                rank++;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            a[i]=m.get(a[i]);
        }

        return a;
    }

    public static void main(String[] args) {
        int a[]={40,10,20,30};
        int ans[]=findRank(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }

}
