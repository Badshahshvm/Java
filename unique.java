package Java;

import java.sql.SQLOutput;

public class unique {
    public static int findUnique(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                ans=a[i];
            }
        }
        return ans;
    }
    public static void main(String[]args)
    {
        int aa[]={1,1,2,4,2,5,8,5,6};
        System.out.println(findUnique(aa));

    }
}
