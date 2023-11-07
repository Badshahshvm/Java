package Algoprep;

import java.util.HashMap;

public class LuckyNumber {

    public static int findLuckNumber(int a[])
    {
        int n=a.length;
        HashMap<Integer, Integer> m=new HashMap<>();
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

        int ans=-1;

        for(int val:m.keySet())
        {
            if(m.get(val)==val)
            {
                ans=Math.max(ans,val);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int  arr[]={  2,2,3,4};
        int ans=findLuckNumber(arr);
        System.out.println(ans);


    }

}
