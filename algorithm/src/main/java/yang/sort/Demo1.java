package yang.sort;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    List<TreeNode> list = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void match(TreeNode root,int num,int sum){
        if(null == root ) return;
        int v = root.value;
        sum+=v;


        TreeNode left  = root.left;
        match(left,num,sum);
        TreeNode right = root.right;
        match(right,num,sum);
    }



}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
}
