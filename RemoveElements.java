package Algoprep;

public class RemoveElements {

    public static int[] removeValue(int a[], int val)
    {
        int count=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=val)
            {

                count++;
            }
        }
        int b[]=new int[count];
        int res=0;
        for(int i=0;i<a.length;i++)
        {
          if(a[i]!=val)
          {
              b[res]=a[i];
              res++;
          }
        }
        return b;
    }
    public static void main(String[] args)
    {
        int a[]={2,2,3,4,5,6,7,8,6,5};
        int [] ans=removeValue(a,6);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");

        }

    }
}
