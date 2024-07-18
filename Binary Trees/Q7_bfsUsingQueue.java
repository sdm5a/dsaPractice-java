import java.util.LinkedList;
import java.util.Queue;

public class Q7_bfsUsingQueue {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }
        
    }

    public static void display(TreeNode root){
        if(root==null) return;

        System.out.print(root.val+" ");
        if(root.left!=null) display(root.left);
        if(root.right!=null) display(root.right);
    }

    public static void bfsQ(TreeNode root, Queue<TreeNode> q){
        if(root==null) return;

        q.add(root);
        while(!q.isEmpty()){
            TreeNode n=q.remove();
            System.out.print(n.val+" ");
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);
            
        }
    }
    public static void main(String[] args) {
        // BFS using Queue data structure

         // creating nodes
         TreeNode a=new TreeNode(1);
         TreeNode b=new TreeNode(2);
         TreeNode c=new TreeNode(3);
         TreeNode d=new TreeNode(4);
         TreeNode e=new TreeNode(5);
         TreeNode f=new TreeNode(6);
         TreeNode g=new TreeNode(7);
 
         // making conection
         a.left=b;
         a.right=c;
 
         b.left=d;
         b.right=e;
 
         c.left=f;
         c.right=g;
 
         // display function
         System.out.print("Tree --> ");
         display(a);
         System.out.println();

        //  bfs using queue
        Queue<TreeNode> q=new LinkedList<>();
        bfsQ(a,q);
    }
}
