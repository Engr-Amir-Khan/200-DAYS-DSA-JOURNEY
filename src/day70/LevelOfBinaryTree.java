package day70;


class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
    }

}








public class LevelOfBinaryTree {
    static void main(String[] args) {
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(10);
        Node f = new Node(11);
        Node g = new Node(50);
        Node h = new Node(5);
        Node i = new Node(9);
        Node j = new Node(-1);

        root.left = b; b.left = c; c.left = d; c.right = g; d.left = e; d.right = f; //left subtree connection

        root.right = h; h.right = i; i.right = j; // right sub tree;



        int finalResult = level(root);
        System.out.println(finalResult);
    }


    public static int level(Node root){
        if(root == null) return 0;
        int leftSubTree = level(root.left);
        int rightSubTree = level(root.right);
        int level = 1+  Math.max(leftSubTree, rightSubTree);
        return  level;
    }
}
