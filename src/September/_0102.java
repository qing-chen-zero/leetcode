package September;

import java.util.Arrays;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/9/27 16:02
 * @description：面试题 01.02. 判定是否互为字符重排
 * @modified By：
 * @version: $
 */
public class _0102 {
    /*
    给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。

    输入: s1 = "abc", s2 = "bca"
    输出: true

    输入: s1 = "abc", s2 = "bad"
    输出: false
     */
    public static void main(String[] args) {
        System.out.println(CheckPermutation("abc","bca"));
    }

    public static boolean CheckPermutation(String s1, String s2) {

        /*
        执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
        内存消耗：39 MB, 在所有 Java 提交中击败了84.16%的用户
         */
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        return Arrays.equals(c1,c2);

        if (s1.length() != s2.length()) return false;
        char c1 = 0;
        char c2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            c1 += s1.charAt(i);
            c2 += s2.charAt(i);
        }
        return c1 == c2;
    }
}
