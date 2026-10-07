package day69;


public class SumOfBinaryTree {
    static void main(String[] args) {
        Node a = new Node(3); //root node
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);


        a.left = b;a.right=c;
        b.left = d; b.right = e;
        c.left =f; c.right=g;
        System.out.println(sum(a));
        System.out.println(product(a));

    }

    public static  int sum(Node root){

        if(root==null)return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        int totalSum = root.value + left + right;
        return totalSum;
    }

    public static  int product(Node root) {

        if (root == null) return 1;
        int left = sum(root.left);
        int right = sum(root.right);
        return root.value * left * right;
    }
}
