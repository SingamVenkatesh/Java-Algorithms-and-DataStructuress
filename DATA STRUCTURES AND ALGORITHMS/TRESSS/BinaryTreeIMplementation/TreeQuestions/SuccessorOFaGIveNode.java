package RecursionLearning.TRESSS.BinaryTreeIMplementation.TreeQuestions;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class SuccessorOFaGIveNode
{

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args)
    {

    }
    // successort node means immediate right side value considerring bfs order
    // bfs order raasaka echina target ki right side  value is the successor node.

    public static TreeNode FIndSUceessNode(TreeNode root,int target)
    {
        if(root==null)
        {
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            TreeNode currentnode=queue.poll();

            if(currentnode.left!=null)
            {
                queue.offer(currentnode.left);
            }
            if(currentnode.right!=null)
            {
                queue.offer(currentnode.right);
            }
            if(currentnode.val==target)
            {
                break;
            }
        }
        return queue.peek();
    }

}


