public class Q1_generalImplimentation {

    // Tree node class
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

    public static void main(String[] args) {
        // General implementation of binary tree and write
        // display function to print in preorder using recursion.

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
        System.out.println("TREE:::");
        display(a);

    }
}