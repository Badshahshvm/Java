
import java.util.Stack;
public class ValidParenthesis {
    public static boolean isValid(Stack<Character> st, String s)

    {
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' )
                st.push(ch);
            else {
                if(st.size()==0)
                {
                    return false;
                }
                if(st.peek()=='(')
                {
                    st.pop();
                    count++;
                }

            }
        }
        if(st.size()>0)
        {
            return false;
        }

        return true;

    }
    public static int scoreValid(Stack<Character> st, String s)
    {
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' )
                st.push(ch);
            else {
                if(st.size()==0)
                {
                    return 0;
                }
                if(st.peek()=='(')
                {
                    st.pop();
                    count++;
                }

            }
        }
        if(st.size()>0)
        {
            return count;
        }

        return count;

    }

    public static void main(String[] args) {
        String s="(())()()(";
        Stack<Character> st=new Stack();
        System.out.println(isValid(st,s));
        System.out.println(scoreValid(st,s));

    }
}
