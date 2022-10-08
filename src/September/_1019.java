package September;

import java.util.Arrays;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/9/29 12:50
 * @description：面试题 01.09. 字符串轮转
 * @modified By：
 * @version: $
 */
public class _1019 {
    /*
    字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
     输入：s1 = "waterbottle", s2 = "erbottlewat"
     输出：True

     输入：s1 = "aa", s2 = "aba"
     输出：False
     */
    public static void main(String[] args) {
        System.out.println(isFlipedString("ab","ba"));
    }


    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String ss = s2 + s2;
        return ss.contains(s1);
    }
}
