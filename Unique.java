package Algoprep;

import java.util.HashMap;

public class Unique {
    public static int findUnique(int a[])
    {

        HashMap<Integer, Integer> m=new HashMap<>();

        for(int i=0;i<a.length;i++)
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
        for(int i=0;i<a.length;i++)
        {
            if(m.get(a[i])==1)
            {
                return a[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[]={12,13,2,12,13,14,14,15,16,16};
        int ans=findUnique(a);
        System.out.println(ans);
    }
}
