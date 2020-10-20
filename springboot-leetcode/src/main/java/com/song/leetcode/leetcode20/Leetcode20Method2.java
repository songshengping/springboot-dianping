package com.song.leetcode.leetcode20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author Jeremy
 * @Description
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2020-10-19 12:34
 **/
public class Leetcode20Method2 {
    public static boolean isValid(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        Map<String,String> map = new HashMap<>();
        map.put(")","(");
        map.put("}","{");
        map.put("]","[");
        Stack<String> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (map.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Object pop = stack.pop();
                if (!map.get(c).equals(pop)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
