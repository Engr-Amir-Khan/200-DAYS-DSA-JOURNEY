package day73;

public class KthLevel {
    static void main(String[] args) {
        Node root = new Node(3);
        Node a = new Node(4);
        Node b = new Node(-1);
        Node c = new Node(1);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(2);
        Node g = new Node(9);

        root.left = a; a.left = b; a.right = c; c.left = d;
        root.right = f; f.left = e; f.right = g;
        kthLvl(root, 0, 4);
    }

    public static void kthLvl(Node root, int level, int k){
        if(root==null)return;
        if (level==k){
            System.out.print(root.val + " ");
        }

        kthLvl(root.left,level+1, k);
        kthLvl(root.right,level+1, k);


    }
}
