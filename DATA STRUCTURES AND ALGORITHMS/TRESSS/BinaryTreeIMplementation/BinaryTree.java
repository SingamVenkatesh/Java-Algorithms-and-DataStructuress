package RecursionLearning.TRESSS.BinaryTreeIMplementation;

import java.util.Scanner;
public class BinaryTree
{
    BinaryTree()
    {

    }
    public static class Node
    {
        int value;
        Node left;
        Node right;
        Node(int value)
        {
            this.value=value;
        }
    }

    private Node root;
    public void populate(Scanner scanner)
    {

        // here we will set the root node
        System.out.println("Enter root node : ");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);

    }


    private void populate(Scanner scanner,Node node)
    {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left=scanner.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value  of the left of " +  node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right=scanner.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value  of the right of " +  node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display()
    {
        display(root,"");
    }
    public void display(Node node,String indent)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }


    //  Tree order traversals



    private void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print("this is preorder traversal "   + root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }



    private void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.print("this is postorder traversal "  + root.value + " ");
    }




    private void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        preOrder(root.left);
        System.out.print("This is Inorder traversal " + root.value + " ");
        preOrder(root.right);

    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();

        tree.populate(sc);
        tree.display();


        //tree.preOrder(tree.root);

    }






}

