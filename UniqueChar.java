package Java.Java;

public class UniqueChar {
    public static int firstUniqChar(String s) {

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
                if(s.charAt(i)!=s.charAt(j))
                {
                    return i;
                }
        }
        return -1;

    }

    public static void main(String[] args) {
        int ans=firstUniqChar("leetcode");
        System.out.println(ans);
        int b=firstUniqChar("loveleetcode");
        System.out.println(b);
        int c=firstUniqChar("aabb");
        System.out.println(c);
    }
}
