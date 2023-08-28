package CountPrimeSetBits;

/**
 * 给你两个整数 left 和 right ，在闭区间 [left, right] 范围内，统计并返回 计算置位位数为质数 的整数个数。
 */
class Solution {
    public static int countPrimeSetBits(int left, int right) {
        int prime = 0;
        for(int i=left;i<=right;i++){
            String b = Integer.toBinaryString(i);
            int count = 0;
            for(int n = 0; n < b.length(); n++) {
                char c = b.charAt(n);
                if(c=='1'){
                    count++;
                }
            }
            boolean flag=true;
            if(count==1){
                flag = false;
            }
            else{
                for (int j = 2; j <= Math.sqrt(count); j++) {
                    if (count % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                prime++;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=countPrimeSetBits(a,b);
        System.out.println(c);
    }
}