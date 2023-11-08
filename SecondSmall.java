package Algoprep;

public class SecondSmall {

    public static int secondMinimumElement(int a[])
    {
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                smin=min;
                min=a[i];
            }
            else if(smin>a[i])
            {
                smin=a[i];
            }
        }
        return smin;
    }

    public static void main(String[] args) {
        int a[]={12,34,56,78,9,10};
        int ans=secondMinimumElement(a);
        System.out.println(ans);

    }
}
