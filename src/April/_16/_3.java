package April._16;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/4/16 19:03
 * @description：无重复字符的最长子串
 * @modified By：
 * @version: $
 */
public class _3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("") ) return 0;
        List<List<String>> list = new ArrayList<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = i; j < len; j++) {
                String str = s.substring(j,j+1);
                if (!temp.contains(str)){
                    temp.add(str);
                } else {
                    break;
                }
            }
            list.add(temp);
        }
        int size = 0;
        for (List<String> strings : list) {
            size = Math.max(size, strings.size());
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("sdadkslada"));
    }
}
