package com.song.leetcode.leetcode703;

import java.util.Arrays;

/**
 * @Author Jeremy
 * @Description 703. 数据流中的第K大元素
 * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 * <p>
 * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
 * <p>
 * 示例:
 * <p>
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 * 说明:
 * 你可以假设 nums 的长度≥ k-1 且k ≥ 1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date 2020-10-20 16:25
 **/
public class Leetcode703 {
    Integer[] minHeap = null;
    int k = 0;
    int minHeapCount = 0;
    public Leetcode703(int k, Integer[] nums) {
            this.k = k;
            for (int i = 0; i < nums.length && i < k; i++) {
                add(nums[i]);
            }
    }

    public int add(int val) {
        if (minHeap == null || minHeap.length == 0) {
            minHeap = new Integer[k];
            minHeap[0] = val;
            minHeapCount++;
            return val;
        }
        if (minHeapCount <= k) {
            minHeap[--minHeapCount] = val;
            minHeap = sort(minHeap);
            minHeapCount++;
        } else if (val > minHeap[0]){
            minHeap[0] = val;
            minHeap = sort(minHeap);
        }
        return minHeap[0];
    }

    public Integer[] sort(Integer[] minHeap) {
        for (int i = 0; i < minHeapCount; i++) {
            if (minHeap[0] > minHeap[i]) {
                int temp = minHeap[0];
                minHeap[0] = minHeap[i];
                minHeap[i] = temp;
            }
        }
        return minHeap;
    }

    public static void main(String[] args) {
        Integer[] s = new Integer[1];
        s[0] = 0;
        Leetcode703 leetcode703 = new Leetcode703(2,s);
        System.out.println("leetcode703.add(-3) = [" + leetcode703.add(-1) + "]");
        System.out.println("leetcode703.add(-3) = [" + leetcode703.add(1) + "]");
        System.out.println("leetcode703.add(-3) = [" + leetcode703.add(-2) + "]");
        System.out.println("leetcode703.add(-3) = [" + leetcode703.add(-4) + "]");
        System.out.println("leetcode703.add(-3) = [" + leetcode703.add(3) + "]");
    }
}
