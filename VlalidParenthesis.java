package Algoprep;

import java.util.Stack;

public class VlalidParenthesis {

    public static boolean isValid(String s)
    {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(st.size()==0)
            {
                st.push(s.charAt(i));
            }
            else {
                char ch=s.charAt(i);

                if(ch=='(' || ch=='{' || ch=='[')
                {
                    st.push(ch);
                }

                else {
                    if(ch==')')
                    {
                        if(st.peek()=='(')
                        {
                            st.pop();
                        }
                        else {
                            return false;
                        }

                    }
                    if(ch==']')
                    {
                        if(st.peek()=='[')
                        {
                            st.pop();
                        }
                        else {
                            return false;
                        }

                    }
                    if(ch=='{')
                    {
                        if(st.peek()=='}')
                        {
                            st.pop();
                        }
                        else {
                            return false;
                        }

                    }
                }
            }
        }


        if(st.size()==0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans=isValid("[{{()}}}]");
        System.out.println(ans);
    }
}
