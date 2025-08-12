package RecursionLearning.TRESSS.BinaryTreeIMplementation;

public class BinarySearchTreeBST {

    BinarySearchTreeBST()
    {

    }
    public class Node
    {
        private Node left;
        private Node right;
        private int value;
        private int height;

        Node(int value)
        {
            this.value=value;
        }
        public int getValue()
        {
            return value;
        }
    }

    private Node root;


    public int height(Node node)// this function calulates hegiht of the tree and also the node which we provide
    {
        if(node==null)
        {
            return -1;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
       // return node.height;
    }
    /*
    height via recusive method
    public int height(Node node) {
    if (node == null) {
        return -1;
    }
    return Math.max(height(node.left), height(node.right)) + 1;
}

     */



    public boolean isEmpty()
    {
        return root==null;
    }
// if we want insert array and tell to make tree
public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        this.insert(nums[i]);
    }
}






// if the array is sorted array.. if we give sorted array to above function one sided tree will be formed so below function is written
public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
}

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        // recursively calls and add mid item to the tree


        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    //

    public void insert(int value)
    {
       root= insert(value,root);
       // System.out.println("PRinted root" + root.value);// here root remain same first entered value is root

    }
    public Node insert(int value,Node node)
    {
        if(node==null)
        {// in first step when we enter root it will come here and end because intitally node==null so here Root is Set.
            node=new Node(value);
            return node;
        }
// node.left ante node.left value change avvadhu okavela null unte new value assign avuthundhi lekunte malli same node return avuthadhi
        if(value<node.value)
        {
            node.left=insert(value,node.left);
        }
        if(value>node.value)
        {
            node.right=insert(value,node.right);
        }

       node.height=Math.max(height(node.left),height(node.right));
        return node;

    }

    public boolean isBalance()
    {
        return isBalance(root);
    }


    public boolean isBalance(Node node)// same level lo unna 2 nodes left and right subtree differnece <=1 unte  its balance like all the remaining subtrees also need to be there
    {
        if(node==null)
        {
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && isBalance(node.left) && isBalance(node.right);
// we are cheking height at each node and also height for subtree aslo
    }


    public void display()
    {
        display(root,"Root Node : ");
    }
    public void display(Node node,String details)
    {
        if(node==null)
        {
            return;
        }

        System.out.println(details + node.value);
        display(node.left,"left child of " +node.value + " : ");
        display(node.right,"right chiild of " + node.value+" : ");
    }


    // display method 2 another method to display like tree which is usde in Binarytree

    public void display2()
    {

        display2(root,"");
    }

    public void display2(Node node, String indent)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }




    // traversal methods


    private void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    public void postOrder(Node node)
    {
        if(node==null)
        {

            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");
    }


    public void inOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        preOrder(node.left);
        System.out.println(node.value + " ");
        preOrder(node.right);
    }
    // main method
    public static void main(String[] args)
    {
        BinarySearchTreeBST tree=new BinarySearchTreeBST();
        tree.insert(100);
        tree.insert(10);
        tree.insert(200);
        tree.insert(110);
        tree.insert(80);
        tree.insert(60);
        tree.insert(180);
        tree.insert(800);
        tree.display();

        System.out.println(tree.height(tree.root));





       /* int[] arr={7,6,3,55,12,99,6};
        tree.populate(arr);// this is to give an array and to insert all the elements method
        tree.display(); */
    }





}
