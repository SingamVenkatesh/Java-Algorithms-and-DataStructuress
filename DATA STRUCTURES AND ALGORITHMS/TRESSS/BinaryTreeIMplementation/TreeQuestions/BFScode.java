package RecursionLearning.TRESSS.BinaryTreeIMplementation.TreeQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFScode {

    public class TreeNode {
       int val;
       TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val)
      { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args)
    {
        BFScode tree=new BFScode();


    }




    public List<List<Integer>> levelOrder(TreeNode root)
    {
        //  List<List<Integer>> result=new ArrayList<>()---->You're telling Java: "Hey, I want a list (List), and I'm choosing ArrayList to do the job right now."
        List<List<Integer>> result;
        result = new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++)
            {
                TreeNode currentNode=queue.poll(); // here we took the first node form queeue
                currentLevel.add(currentNode.val); //here we adding the current
                if(currentNode.left!=null)
                {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.offer(currentNode.right);
                }

            }
            result.add(currentLevel);
        }
        return result;



    }
}
