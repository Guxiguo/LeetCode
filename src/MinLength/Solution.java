package MinLength;

/**
 * 给你一个仅由 大写 英文字符组成的字符串 s 。
 *
 * 你可以对此字符串执行一些操作，在每一步操作中，你可以从 s 中删除 任一个 "AB" 或 "CD" 子字符串。
 *
 * 通过执行操作，删除所有 "AB" 和 "CD" 子串，返回可获得的最终字符串的 最小 可能长度。
 */

public class Solution {
    public static int minLength(String s) {
        StringBuilder s1 = new StringBuilder(s);
        int i = 0;
        while(i<s1.length()-1){
            if(s1.charAt(i)=='A'&&s1.charAt(i+1)=='B'){
                System.out.println(i);
                s1.deleteCharAt(i+1);
                //System.out.println(i);
                s1.deleteCharAt(i);
                if(i!=0){
                    i--;
                }
                else if(i==0){
                    continue;
                }
                else{
                    i++;
                }
            }
            else if((s1.charAt(i)=='C'&&s1.charAt(i+1)=='D')) {
                s1.deleteCharAt(i+1);
                //System.out.println(i);
                s1.deleteCharAt(i);
                if (i != 0) {
                    i--;
                } else if(i==0){
                    continue;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }

        }
        //System.out.println(s1);
        return s1.length();

    }

    public static void main(String[] args) {
        String s = "CABDCABDAB";
        System.out.println(minLength(s));
    }
}
