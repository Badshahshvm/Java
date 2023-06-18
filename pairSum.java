package Java;

public class pairSum {
    public static int pairSum(int a[], int target)
    {  int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println(a[i]+","+a[j]);
                    return i+j;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[]={12,33,9,10};
        System.out.println(pairSum(a,22));
    }
}
