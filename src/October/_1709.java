package October;

import java.util.Arrays;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/10/11 21:16
 * @description：1790. 仅执行一次字符串交换能否使两个字符串相等
 * @modified By：qing-chen
 * @version: $
 */
public class _1709 {
    /*
    给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
    如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
    输入：s1 = "bank", s2 = "kanb"
    输出：true
    解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
    输入：s1 = "attack", s2 = "defend"
    输出：false
    解释：一次字符串交换无法使两个字符串相等
    输入：s1 = "kelb", s2 = "kelb"
    输出：true
    解释：两个字符串已经相等，所以不需要进行字符串交换
    输入：s1 = "abcd", s2 = "dcba"
    输出：false
     */
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("kelb", "kelb"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        int count = 0,left = -1, right = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (left == -1) left = i;
                if (right == -1 && left != i) right = i;
            }
        }
        if (count == 0) return true;
        if (count==2 && s1.charAt(left) == s2.charAt(right) && s1.charAt(right) == s2.charAt(left)) return true;
        else return false;
    }
}
