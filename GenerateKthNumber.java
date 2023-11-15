package Algoprep;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateKthNumber {

    public static String generateKth(int k)
    {
        Queue<String> q=new LinkedList<>();
        q.add("1");
        q.add("2");
        String ans=" ";
        for(int i=1;i<=k;i++)
        {
            String temp=q.remove();
            ans=temp;
            q.add(temp+"1");
            q.add(temp+"2");
        }

        return ans;
    }


    public static void main(String[] args) {
        String ans=generateKth(4);
        System.out.println(ans);
    }
}
