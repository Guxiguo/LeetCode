package LenLongestFibSubseq;

class Solution {
//    public static int lenLongestFibSubseq(int[] arr) {
//        if(arr.length<=3){
//            return 0;
//        }
//        int i=0;
//        int max = 0;
//        while(i<arr.length){
//            int left = i;
//            int middle = left+1;
//            int right = middle+1;
//            int count = 0;
//            while(right<arr.length){
//                if(arr[left]+arr[middle]<arr[right]){
//                    middle++;
//                    right++;
//                }
//                else if(arr[left]+arr[middle]>arr[right]){
//                    right++;
//                }
//                else if(arr[left]+arr[middle]==arr[right]){
//                    if(count == 0){
//                        i=left;
//                    }
//                    left=middle;
//                    middle = right;
//                    right++;
//                    count++;
//                }
//                max = Math.max(max,count);
//            }
//        }
//
//        return max;
//    }


    public static int lenLongestFibSubseq(int[] arr) {
        short n=(short)arr.length;
        int max=2;
        for(int i=0;i<n-2 && (n-i>max);i++){
            for(int j=i+1;j<n-1 && (n-i+1>max);j++){
                int tempi=i;
                int tempj=j;
                int count=2;
                for(int k=j+1;k<n && ((n-i+2+count>max));k++) {
                    if(arr[tempi] + arr[tempj] < arr[k]){
                        break;
                    }
                    if (arr[tempi] + arr[tempj] == arr[k]){
                        count++;
                        tempi=tempj;
                        tempj=k;
                    }
                }
                max=max>count ? max:count;
            }
        }
        return max>=3? max:0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(lenLongestFibSubseq(arr));
    }
}
