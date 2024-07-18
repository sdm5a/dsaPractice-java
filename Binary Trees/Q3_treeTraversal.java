public class Q3_treeTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }  
    }

    public static void preorder(TreeNode root){
        if(root==null) return;

        System.out.print(root.val+" ");
        if(root.left!=null) preorder(root.left);
        if(root.right!=null) preorder(root.right);
        
    }
    public static void inorder(TreeNode root){
        if(root==null) return;

        if(root.left!=null) inorder(root.left);
        System.out.print(root.val+" ");
        if(root.right!=null) inorder(root.right);
        
    }
    public static void postorder(TreeNode root){
        if(root==null) return;

        if(root.left!=null) postorder(root.left);
        if(root.right!=null) postorder(root.right);
        System.out.print(root.val+" ");
        
    }
    public static void main(String[] args) {
        // tree traversal inorder, preorder and postorder

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
        System.out.print("Preorder Traversal : ");
        preorder(a);
        System.out.println();

        System.out.print("Inorder Traversal : ");
        inorder(a);
        System.out.println();

        System.out.print("Postorder Traversal : ");
        postorder(a);
    }
}
