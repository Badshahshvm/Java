package Algoprep;

import java.util.HashMap;

public class UniqueCharacter {

    public static int findUniqueCharacter(String s)
    {
        int n=s.length();

        HashMap<Character,Integer> m=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(m.containsKey(s.charAt(i))==true)
            {
                int temp=m.get(s.charAt(i));
                m.put(s.charAt(i),temp+1);
            }
            else {
                m.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<n;i++)
        {
            if(m.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nas=findUniqueCharacter("leetcode");
        System.out.println(nas);

    }
}
