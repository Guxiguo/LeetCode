package IntToRoman;

/**
 * 将数字转换成罗马数字
 */
public class Solution {
    public static String intToRoman(int num) {
        int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String s = "";
        for(int i=0;i<number.length;i++){
            while(num>=number[i]){
                num=num-number[i];
                s = s+roman[i];
            }
            if(num==0){
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int num =1994;
        System.out.println(intToRoman(num));
    }
}
