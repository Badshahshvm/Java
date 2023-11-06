package Algoprep;

import java.util.HashMap;

public class PairSum {

    public static boolean targetSum(int a[], int k)
    {
        HashMap<Integer, Integer> m=new HashMap<>();

        int n=a.length;
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
        for(int i=0;i<n;i++)
        {
            int val=a[i];
            int b=k-val;
            if(val!=b && m.containsKey(b)==true)
            {
                return true;
            }
            else if(val==b && m.containsKey(b) && m.get(b)>1)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
     boolean nas=targetSum(a,14);
        System.out.println(nas);


    }
}
