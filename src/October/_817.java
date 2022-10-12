package October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/10/12 19:18
 * @description：817. 链表组件
 * @modified By：qing-chen
 * @version: $
 */
public class _817 {
    /*
    给定链表头结点head，该链表上的每个结点都有一个唯一的整型值 。同时给定列表nums，该列表是上述链表中整型值的一个子集。
    返回列表nums中组件的个数，这里对组件的定义为：链表中一段最长连续结点的值（该值必须在列表nums中）构成的集合。

    输入: head = [0,1,2,3], nums = [0,1,3]
    输出: 2
    解释: 链表中,0 和 1 是相连接的，且 nums 中不包含 2，所以 [0, 1] 是 nums 的一个组件，同理 [3] 也是一个组件，故返回 2。

    输入: head = [0,1,2,3,4], nums = [0,3,1,4]
    输出: 2
    解释: 链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
     */
    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        int[] nums = new int[]{0,3,1,4};
        System.out.println(numComponents(node,nums));
    }
    public static int numComponents(ListNode head, int[] nums) {
        int times = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        ListNode node = head;
        while (node != null) {
            if (!list.contains(node.val)) {
                node = node.next;
            } else {
                times++;
                node = node.next;
                while (node != null && list.contains(node.val)){
                    node = node.next;
                }
            }
        }
        return times;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

