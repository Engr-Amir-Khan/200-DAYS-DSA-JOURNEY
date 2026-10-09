package day70;

public class PostOrderTraversal {
    static void main(String[] args) {
            Node root = new Node(1);
            Node a = new Node(2);
            Node b = new Node(3);
            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(6);
            Node f = new Node(7);

            root.left = a; a.left = c; a.right = d;
            root.right = b; b.left = e; b.right = f;

            postOrder(root);



    }
    public static void postOrder(Node root) {

        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }
}
