package Algoprep;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {


    public static void kthsmalleNumber(int a[],int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<k;i++)
        {
            pq.add(a[i]);
        }

        for(int i=k;i<a.length;i++)
        {
            if(a[i]<pq.peek())
            {
                pq.remove();
                pq.add(a[i]);
            }
        }
        while(pq.size()>0)
        {
            System.out.println(pq.remove());
        }
    }

    public static void main(String[] args) {
        int a[]={12,3,4,5,6,78,90,11};
        kthsmalleNumber(a,4);
    }
}
