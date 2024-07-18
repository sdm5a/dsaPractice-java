public class Q4_maxMinProduct {

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
        display(root.left);
        display(root.right);
    }

    public static int max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int min(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    public static int product(TreeNode root,int h){
        if(root==null) return 1;
        
        h=h*root.val;
        if(root.left!=null) h=product(root.left, h);
        if(root.right!=null) h=product(root.right, h);
        return h;
    }
    public static void main(String[] args) {
        // Find maximum , minimum and product of all node value.

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

        // maximum
        System.out.println("Maximum: "+max(a));

        // minimum
        System.out.println("Minimum: "+min(a));

        // product
        System.out.println("Product: "+product(a,1));
    }
}
