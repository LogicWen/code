import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Andy on 2017/4/6.
 *
 * 判断一个树是否为完全二叉树
 */
public class CheckBalance {

    public boolean chk(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        boolean flag = true;

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(flag) {
                if(cur.right!=null&&cur.left!=null) {
                    queue.add(cur.left);
                    queue.add(cur.right);
                }else {
                    flag = false;
                    if(cur.left!=null) {
                        queue.add(cur.left);
                    }else if(cur.right!=null) {
                        queue.add(cur.right);
                    }
                }
            }else {
                if(cur.right!=null||cur.left!=null) {
                    return false;
                }
            }
        }

        return true;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}