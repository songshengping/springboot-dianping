package com.song.leetcode.leetcode103;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jeremy
 * @Description
 * 103. 二叉树的锯齿形层次遍历
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 *   /  \
 *  15   7
 * 返回锯齿形层次遍历如下：
 * <p>
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 * <p>
 * @Date 2020-11-12 15:54
 **/
public class Leetcode {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        while (root.left != null || root.right != null) {
            List<Integer> level = new ArrayList<>();
            if (root.left != null) {
                level.add(root.left.val);
            }
            if (root.right != null) {
                level.add(root.right.val);
            }
            result.add(level);
        }
        return result;
    }

    public List<Integer> addLevel(TreeNode left, TreeNode right){
        return null;
    }

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
