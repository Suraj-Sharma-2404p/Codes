package StreamExmaples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RD {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        int n = arr.length;
        Set<Integer> ds = new HashSet<>();
        int sum = 0;
        subsetSum(0, arr, ds, n,sum);
        System.out.println(ds);

    }

    private static void subsetSum(int i, int[] arr, Set<Integer> ds, int n, int sum) {
        if(i == n){
            ds.add(sum);
            return;
        }
        //if we are choosing the array element
        subsetSum(i+1,arr,ds,n,sum+arr[i]);
        subsetSum(i+1,arr,ds,n,sum);
    }


}
