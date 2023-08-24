package AddBinary;

/**
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
class Solution {
    public static String addBinary(String a, String b) {
        boolean flag = false;
        String s1 = new StringBuffer(a).reverse().toString();

        String s2 = new StringBuffer(b).reverse().toString();
        //System.out.println(s1);
        int len1 = s1.length();
        int len2 = s2.length();
        String s3 = new String();
        //System.out.println(len1);
        int maxLen = Math.max(len1, len2);

        for (int i = 0; i < maxLen; i++) {

            char ch1 = i < len1 ? s1.charAt(i) : '0';
            char ch2 = i < len2 ? s2.charAt(i) : '0';
            //System.out.println(ch1);
            if(ch1==49&&ch2==48||ch1==48&&ch2==49){
                if(flag==false){
                    s3 = "1"+s3;
                    flag = false;
                }
                else{
                    s3 = "0"+s3;
                    flag = true;
                }
            }
            else if(ch1==49&&ch2==49){
                if(flag==false){
                    s3 = "0"+s3;

                    flag = true;
                }
                else{
                    s3 = "1"+s3;
                    flag = true;
                }
            }
            else{
                if(flag==false){
                    s3 = "0"+s3;
                    flag = false;
                }
                else{
                    s3 = "1"+s3;
                    flag = false;
                }
            }
        }
        if(flag==true){
            s3 = "1"+s3;
        }
        return s3;
    }

    public static void main(String[] args) {
        String s1 = new String("10");

        String s2 = new String("11");

        System.out.println(addBinary(s1,s2));
    }
}
