package ReplaceSpace;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
class Solution {
    public String replaceSpace(String s) {
        String s1 = "";
        for(char c : s.toCharArray()){
            if(Character.isWhitespace(c)){
                s1 = s1+"%20";
            }
            else{
                s1 = s1+c;
            }
        }
        return s1;
    }
}