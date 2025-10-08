package arraysAndStrings;

public class GreatestCommonDivisorofStrings {

    public static String gcdOfStrings(String str1, String str2) {
      if(!(str1+str2).equals(str2+str1))
          return "";
      //find gcd of lengths
        int i = gcd(str1.length(),str2.length());

        return str1.substring(0,i);
    }

    //finding gcd by subtraction approach we can also use various other methods like Eucledian
    public static int gcd(int l1,int l2){
        if(l1==0) return 0;
        if(l2==0) return 0;
        while(l1!=l2){
            if(l1>l2)
                l1 = l1-l2;
            if(l2>l1)
                l2 = l2-l1;
        }
        return l1;
    }

    public static void main(String[] args) {
        //String  str1 = "ABCABC", str2 = "ABC";
        //String  str1 = "ABABAB", str2 = "ABAB";
        String str1 = "LEET", str2 = "CODE";
        String divisor = gcdOfStrings(str1,str2);
        System.out.println(divisor);
    }
}

/**
 * 1071. Greatest Common Divisor of Strings
 * Easy
 * Topics
 * premium lock icon
 * Companies
 * Hint
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 *
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 *
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 *
 * Constraints:
 *
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */