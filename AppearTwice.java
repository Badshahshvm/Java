package Algoprep;

import java.util.HashMap;

public class AppearTwice {
    public static char findTwiceCharacter(String s)
    {
        HashMap<Character, Integer> m = new HashMap<>();
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m.containsKey(c)) {
                if (result == ' ' || i < m.get(result)) {
                    result = c;
                }
            } else {
                m.put(c, i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char ans=findTwiceCharacter("abbccdeee");
        System.out.println(ans);

    }
}
