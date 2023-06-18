package Java;

public class repeat {
    public static int firstRepeatElement(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    return a[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[]={1,2,1,3,5};
        System.out.println(firstRepeatElement(a));

    }
}
