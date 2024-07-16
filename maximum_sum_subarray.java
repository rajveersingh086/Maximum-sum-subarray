package geeks.array;

import java.util.*;
/*It is a MAXIMUM SUM SUBARRAY  */
//TIME COMPLEXITY IS ; O(N)  IT IS AN EFFICIENT APPROACH.

public class maximum_sum_subarray {
    static int maxSum (int arr[],int n){
        int maxEnding = arr[0];
        int res = arr[0];

        for (int i =1 ;i<n;i++){
            maxEnding=Math.max(maxEnding + arr[i],arr[i]);
            res = Math.max(res,maxEnding);

        }
        return res;
    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no ");
        int n = sc.nextInt();

        System.out.println("Enter a array");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int subarray = maxSum(arr,n);
        System.out.println(subarray);
    }
    
}
