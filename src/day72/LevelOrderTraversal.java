package day72;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}


public class LevelOrderTraversal {
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

//        display(root);

        levelTraversal(root);

    }

    public static void display(Node root){

        if(root == null)return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static void levelTraversal(Node root){
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (q.size()>0){

            Node front = q.remove();

            System.out.print(front.val + " ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);

        }

    }



}
