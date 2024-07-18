public class Q6_bfs {
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

    public static int height(TreeNode root,int h){
        if(root==null) return 0;
        h=Math.max(height(root.left,h),height(root.right, h));
        if(root.left!=null || root.right!=null) h=h+1;
        return h;
    }

    public static void bfs(TreeNode root,int n){
        if(root==null) return;

        if(n==0) System.out.print(root.val+" ");
        bfs(root.left, n-1);
        bfs(root.right, n-1);
    }
    public static void main(String[] args) {
        // print nth level of binary element

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

        // bfs traversal
        for(int i=0;i<=height(a,0);i++){
            bfs(a, i);
            System.out.println();
        }
    }
}
