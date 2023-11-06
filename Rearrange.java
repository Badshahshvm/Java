package Algoprep;

public class Rearrange {

    public static void rearrangArray(int a[])
    {
        int p1=1;
        int p2=a.length-1;
        while(p1<=p2)
        {
            if(a[p1]<=a[0])
            {
                p1++;
            }
            else if(a[p2]>a[0])
            {
                p2--;
            }
            else {
                int temp=a[p1];
                a[p1]=a[p2];
                a[p2]=temp;
            }
        }

        int temp=a[0];
        a[0]=a[p2];
        a[p2]=temp;
    }
    public static void main(String[] args)
    {
                         int a[]={10,3,8,6,12,2,18,7,15};
                         rearrangArray(a);
                         for(int i=0;i<a.length;i++)
                         {
                             System.out.print(a[i]+" ");
                         }

    }
}
