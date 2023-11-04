package Algoprep;

public class MergeSort {
    public static void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int[] temp = new int[r-l+1];
        int p1 =l;
        int p2 = m+1;
        int p3 = 0;
        while(p1<=m && p2<=r){
            if(arr[p1] < arr[p2]){
                temp[p3] = arr[p1];
                p1++;
                p3++;
            }else{
                temp[p3] = arr[p2];
                p2++;
                p3++;
            }
        }

        while(p1<=m){
            temp[p3] = arr[p1];
            p1++;
            p3++;
        }

        while(p2 <= r){
            temp[p3] = arr[p2];
            p2++;
            p3++;
        }

        int i=l;
        int j = 0;

        while(j < temp.length){
            arr[i] = temp[j];
            i++;
            j++;
        }

    }
     public static void mergeSorti(int arr[], int l, int r)
    {
        //code here
        if(l==r){
            return;
        }
        int m = (l+r)/2;
        mergeSorti(arr,l,m);
        mergeSorti(arr,m+1,r);

        merge(arr,l,m,r);
    }


    public static void main(String[] args) {
        int a[]={12,3,1,56,47,89,10,70,45,38};

        mergeSorti(a,0,a.length-1);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
