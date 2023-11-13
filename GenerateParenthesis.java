package Algoprep;

import java.util.ArrayList;

public class GenerateParenthesis {

    public static ArrayList<String>  generateValid(int n)
    {
        ArrayList<String> result=new ArrayList<>();
        helper(n,0,0,"",result);
        return result;

    }

    public static  void helper(int n, int open, int close, String curr, ArrayList<String> result)
    {
        if(curr.length()==2*n)
        {
            result.add(curr);
            return;
        }

        if(open<n)
        {
            helper(n,open+1, close, curr+"(",result);
        }
        if(close<open)
        {
            helper(n,open,close+1,curr+")",result);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> ans=generateValid(4);
        System.out.println(ans);

    }
}
