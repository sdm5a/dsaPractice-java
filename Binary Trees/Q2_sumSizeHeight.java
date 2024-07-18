public class Q2_sumSizeHeight {

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

    public static int sum(TreeNode root,int ans){
        if(root==null) return 0;
        
        ans=ans+root.val;
        if(root.left!=null) ans=sum(root.left, ans);
        if(root.right!=null) ans=sum(root.right, ans);
        return ans;
    }

    public static int size(TreeNode root, int count){
        if(root==null) return 0;

        count++;
        if(root.left!=null) count=size(root.left, count);

        
        if(root.right!=null) count=size(root.right, count);

        return count;
    }

    public static int height(TreeNode root,int h){
        if(root==null) return 0;
        h=Math.max(height(root.left,h),height(root.right, h));
        if(root.left!=null || root.right!=null) h=h+1;
        return h;
    }
    public static void main(String[] args) {
        //Find the sum of all nodes, size of tree, and height of binary tree.

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
        System.out.print("TREE : ");
        display(a);
        System.out.println();

        // function to find sum of all node element
        int ans=0;
        System.out.println("Sum : "+sum(a,ans));

        // size of tree
        System.out.println("Size of tree : "+size(a,0));

        // heigth of binary tree
        System.out.println("Height of Binary Tree : "+height(a,0));
    }
}