package Algoprep;

public class StringToInteger {

    public static int converTo(String str)
    { if (str == null || str.isEmpty()) {
        return 0;
    }

        str = str.trim(); // Remove leading and trailing whitespaces

        int sign = 1; // Initialize the sign as positive
        int index = 0;
        int result = 0;

        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';

            // Check for integer overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;

    }

    public static void main(String[] args) {
        int ans =converTo("124");
        System.out.println(ans);

    }
}
