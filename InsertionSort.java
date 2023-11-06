package Algoprep;

public class InsertionSort {

    public static void insertionSorting(int a[])
    {

        int n=a.length;
        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,478,9,11,25,16,10};
        insertionSorting(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
