package Algoprep;

import java.util.PriorityQueue;

public class KthLargest {

    public static int kthLargeNumber(int a[], int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<k;i++)
        {
            pq.add(a[i]);
        }

        for(int i=k;i<a.length;i++)
        {
            if(a[i]>pq.peek())
            {
                pq.remove();
                pq.add(a[i]);
            }
        }
        

        return pq.peek();

    }


    public static void main(String[] args) {
        int a[]={1,34,5,6,7,89,10};

        System.out.println(kthLargeNumber(a,3));
    }
}
