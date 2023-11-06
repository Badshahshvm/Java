package Algoprep;

import java.util.HashMap;

public class FrequencyQuerry2 {
    public static int [] findFrequency(int a[], int q[])
    {
        int n=a.length;
        int p=q.length;
        int c[]=new int[p];
        HashMap<Integer, Integer>  m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(a[i])==true)
            {
                int temp=m.get(a[i]);
                m.put(a[i],temp+1);
            }
            else {
                m.put(a[i],1);

            }
        }

        for(int i=0;i<p;i++)
        {
            int val=q[i];
            if(m.containsKey(val)==true)
            {
                c[i]=m.get(val);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[]={2, 6,3,8,2,3,5,8,10,6};
        int q[]={2,8,3,5};
        int ans[]=findFrequency(a,q);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
