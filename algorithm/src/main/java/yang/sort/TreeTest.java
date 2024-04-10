package yang.sort;


//


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeTest {


    /***
     *
     * @param args
     *
     *
     * lj
     *     1                     0 * 10 + 1
     *   2   3            1 * 10 + 2         1*10 + 3
     * 4  5        12 * 10 + 4   12 * 10 + 5
     *
     *
     *
     * 124 + 125 + 13
     *
     *
     */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));

        execute(root,0);
        System.out.println(sum);
    }

    //static List<Integer> items = new ArrayList<Integer>();
    static int sum = 0;

    public static void execute(TreeNode node, int pre_value) {
        if (null == node) return;

        TreeNode left = node.left;
        TreeNode right = node.right;
        int val = node.val;
        int v = pre_value * 10 + val;
        if(null == left && null == right){
            sum+=v;
            return;
        }

        execute(left, v);
        execute(right, v);
    }


    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val = val;
        }

        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }


}
