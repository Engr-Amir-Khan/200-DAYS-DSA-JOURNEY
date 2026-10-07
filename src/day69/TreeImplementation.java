package day69;


class Node{
    int value;
    Node left;
    Node right;

    Node(int value){

        this.value = value;

    }
}



public class TreeImplementation {
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
        display(a);
        System.out.println();
        System.out.println(size(a));





    }

    public static void display(Node root){

        //base case
        if(root==null)return;
        System.out.print(root.value + " ");
        display(root.left);
        display(root.right);
    }

    public static int size(Node root){

        //base case;
        if(root==null)return 0;
        int leftSize = size(root.left);
        int rightSize = size(root.right);

        int totalSize = leftSize + rightSize;
        return 1+ totalSize;
    }
}
