package Algoprep;

public class SelectionSort {

    public static void sort(int a[])
    {

        for(int i=0;i<a.length-1;i++)
        {
            int minEle=a[i];
            int minIdx=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<minEle)
                {
                    minEle=a[j];
                    minIdx=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIdx];
            a[minIdx]=temp;

        }
    }

    public static void main(String[] args) {
        int a[]={23,1,35,6,7,89,11};
        sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
