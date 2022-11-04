package _2022._11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/11/4 15:53
 * @description：754. 到达终点数字
 * @modified By：qing-chen
 * @version: $
 * 
 * 在一根无限长的数轴上，你站在0的位置。终点在target的位置。
 * 你可以做一些数量的移动 numMoves :
 * 每次你可以选择向左或向右移动。
 * 第 i次移动（从 i == 1开始，到i == numMoves ），在选择的方向上走 i步。
 * 给定整数target ，返回 到达目标所需的 最小移动次数(即最小 numMoves )。
 *
 */
public class _754 {
    public static void main(String[] args) {
//        System.out.println(reachNumber(2));
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.get(0) == 2);
    }

    /*
    输入: target = 2
    输出: 3
    解释:
    第一次移动，从 0 到 1 。
    第二次移动，从 1 到 -1 。
    第三次移动，从 -1 到 2 。
     */

    public static int reachNumber(int target) {
        int sum = 0, index = 0;
        int t = Math.abs(target);
        while(sum < t) {
            index++;
            sum += index;
        }
        int dt = sum - t;
        if (dt%2 ==0) return index;
        else {
            if (index%2==0) return index+1;
            else return index+2;
        }
    }
}
