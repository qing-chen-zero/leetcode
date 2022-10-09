package October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/10/8 11:57
 * @description：870. 优势洗牌
 * @modified By：
 * @version: $
 */
public class _870 {
    /*
    给定两个大小相等的数组nums1和nums2，nums1相对于 nums的优势可以用满足nums1[i] > nums2[i]的索引 i的数目来描述。
    返回 nums1的任意排列，使其相对于 nums2的优势最大化。

    输入：nums1 = [2,7,11,15], nums2 = [1,10,4,11]
    输出：[2,11,7,15]

    输入：nums1 = [12,24,8,32], nums2 = [13,25,32,11]
    输出：[24,32,8,12]

     */
    public static void main(String[] args) {
        advantageCount(new int[]{2,7,11,15}, new int[]{1,10,4,11});
    }

    public static int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Integer[] index1 = new Integer[n];
        Integer[] index2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            index1[i] = i;
            index2[i] = i;
        }
        Arrays.sort(index1, (i,j) -> nums1[i] - nums1[j]);
        Arrays.sort(index2, (i,j) -> nums2[i] - nums2[j]);
        
        int[] res = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums1[index1[i]] > nums2[index2[left]]) {
                res[index2[left]] = nums1[index1[i]];
                ++left;
            } else {
                res[index2[right]] = nums1[index1[i]];
                --right;
            }
        }
        return res;
    }
}
