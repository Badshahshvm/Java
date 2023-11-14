package Algoprep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElements {
    public static Queue<Integer> reverseK(Queue<Integer> q, int k)
    {
        Stack<Integer> s=new Stack<>();
         for(int i=1;i<=k;i++)
         {
             s.push(q.remove());
         }

         for(int i=1;i<=k;i++)
         {
             q.add(s.pop());
         }
         int n=q.size();


         for(int i=1;i<=n-k;i++)
         {
             q.add(q.remove());
         }


         return q;
    }


    public static void main(String[] args)
    {

   Queue<Integer> q=new LinkedList<>();

   q.add(12);
   q.add(11);
   q.add(45);
   q.add(56);
   q.add(38);

   Queue<Integer> ans=reverseK(q,4);
        System.out.println(ans);


    }
}
