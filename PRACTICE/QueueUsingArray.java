package PRACTICE;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingArray {
    static int[] firstNegativeNumber(int[] arr , int k){
        int n = arr.length;
        int[] ans = new int[n-k+1];
        int idx =0;
        for (int i = 0 ; i < n-k+1 ; i++){
            int firsNegativeNUmber = 0;
            for(int j= i ; j < i+k; j++){
                if (arr[j]< 0){
                    firsNegativeNUmber = arr[j];
                    break;
                }
            }
            ans[idx++] = firsNegativeNUmber;
        }
        return ans;
    }

    static int[] solution2(int[] arr , int k){
        int windowEnd = 0;
        int windowStart = 0;
        int n =arr.length;
        int[] ans = new int[n-k+1];
        int idx =0;
        Queue<Integer> queue = new LinkedList<>();
        for(windowEnd = 0 ; windowEnd < n ; windowEnd++){
            queue.add(arr[windowEnd]);
            if ((windowEnd - windowStart+1) == k){
                if (queue.isEmpty()){
                    ans[idx++] = 0;
                }else{
                    int num = queue.peek();
                    ans[idx++] = num;
                    if (num == arr[windowStart]){
                        queue.remove();
                    }
                }
                windowStart++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[] { -5, 1, 2, -6, 9 };
        int[] ans = solution2(arr, 2);
        System.out.println(Arrays.toString(ans));
    }
}
