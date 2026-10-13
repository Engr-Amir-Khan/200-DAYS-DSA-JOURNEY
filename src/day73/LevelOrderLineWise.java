package day73;

import java.util.ArrayList;
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
class Pair{
    Node node;
    int level;

    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

public class LevelOrderLineWise {
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
                levelOrderTraversalLineWise(root);

    }

    public static void levelOrderTraversalLineWise(Node root){
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();


        Queue<Pair> q = new LinkedList<>();
        int currentLevel = 0;
        q.add(new Pair(root,currentLevel));
        ans.add(s);
        boolean leftToRight = true;
        while(q.size()>0){

            Pair front = q.remove();

            Node node = front.node;
            int level = front.level;



            if(front.level!=currentLevel){
                s = new ArrayList<>();
                currentLevel = front.level;
                ans.add(s);
                System.out.println();
                leftToRight = !leftToRight;
            }


            if(leftToRight){
                s.add(node.val);
            }else{
                s.add(0, node.val);
            }



            if(node.left!=null)q.add(new Pair(node.left , currentLevel+1));
            if(node.right!=null)q.add(new Pair(node.right , currentLevel+1));




        }
        System.out.println(ans);




    }

}
