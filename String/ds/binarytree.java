import java.util.*;
class binarytree{
    static Scanner sc = null;

    static Node creatTree()
    {
        Node root = null;
        System.out.println("Enter data");
        int data = sc.nextInt();

        if(data==-1) return null;

        root = new Node(data);

        System.out.println("Enter left for "+ data);
        root.left = creatTree();

        System.out.println("Enter right for "+ data);
        root.right = creatTree();
        return root;
    } 
    static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null) return;

        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");

    }
    public static void main(String args[])
    {
        sc = new Scanner(System.in);
        Node root = creatTree();
        inOrder(root);
        preOrder(root);
        postOrder(root);

    }
}
class Node{
        Node left,right;
        int data;

        public Node(int data)
        {
            this.data =data;
        }

    }