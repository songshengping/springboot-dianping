package com.song.leetcode.leetcode20;

import java.util.HashMap;
import java.util.Map;

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
public class Leetcode20 {
    public boolean isValid(String s) {
        if (s == null || "".equals(s)){
            return true;
        }
        int i = 0;
        do {
            i = s.length();
            if (s.contains("{}")) {
                s = s.replaceAll("\\{}","");
            }
            if (s.contains("[]}")) {
                s = s.replaceAll("\\[]","");
            }
            if (s.contains("()")) {
                s = s.replaceAll("\\(\\)","");
            }
        }while(i != s.length());

        return "".equals(s);
    }
}
