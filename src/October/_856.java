package October;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Stack;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/10/9 15:13
 * @description：856. 括号的分数
 * @modified By：qing-chen
 * @version: $
 */
public class _856 {
    /*
    给定一个平衡括号字符串S，按下述规则计算该字符串的分数：

    () 得 1 分。
    AB 得A + B分，其中 A 和 B 是平衡括号字符串。
    (A) 得2 * A分，其中 A 是平衡括号字符串。

    输入： "()"
    输出： 1

    输入： "(())"
    输出： 2    2*1=2

    输入： "()()"
    输出： 2   1+1=2

    输入： "(()(()))"
    输出： 6   2*(1+2*1)=6
     */
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(()(()))"));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(') {
                stack.push(0);
            }else if (temp == ')') {
                int top = stack.pop();
                if (top==0) stack.push(stack.pop() + 1);
                else {
                    stack.push(stack.pop() + 2*top);
                }
            }

        }
        return stack.pop();
    }
}
