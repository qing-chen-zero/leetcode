package June._07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Qingchen
 * @date ：Created in 2022/7/7 18:43
 * @description：单词替换
 * @modified By：
 * @version: middle$
 */
public class _648 {
//    在英语中，我们有一个叫做词根(root) 的概念，可以词根后面添加其他一些词组成另一个较长的单词
//    我们称这个词为继承词(successor)。例如，词根an，跟随着单词other(其他)，可以形成新的单词another(另一个)。
//    现在，给定一个由许多词根组成的词典 dictionary
//    和一个用空格分隔单词形成的句子 sentence。
//    你需要将句子中的所有继承词用词根替换掉。
//    如果继承词有许多可以形成它的词根，则用最短的词根替换它。
//
//    你需要输出替换之后的句子。
//    输入：dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
//    输出："the cat was rat by the bat"
//
//    输入：dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
//    输出："a a b c"
    public static void main(String[] args) {
        List<String> dic = new ArrayList<>();
        dic.add("a");
        dic.add("b");
        dic.add("c");
        replaceWords(dic, "aadsfasf absbs bbab cadsfafs");
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        List<String> list = Arrays.asList(sentence.split(" "));
        List<String> res = new ArrayList<>();
        for (String s : list) {
            boolean y = true;
            for (String dic : dictionary) {
                if (s.contains(dic)) {
                    res.add(dic);
                    y = false;
                    break;
                }
            }
            if (y) {
                res.add(s);
            }
        }
        System.out.println(res);
        return null;
    }
}
