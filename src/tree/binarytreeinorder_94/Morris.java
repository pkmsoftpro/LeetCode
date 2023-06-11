package tree.binarytreeinorder_94;

public class Morris {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left=new TreeNode(2);
    root.left.left=new TreeNode(4);
    root.left.right=new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    System.out.println(new Morris().postOrder(root));
}

  private String inorderTraversal(TreeNode root) {
    TreeNode current = root;
    while(current!=null) {
      if(current.left==null) {
        System.out.println(current.val);
        current = current.right;
      } else {
        TreeNode predecessor = current.left;
        while(predecessor.right!=null && predecessor.right!=current) {
          predecessor = predecessor.right;
        }
        if(predecessor.right==null) {
          predecessor.right = current;
          current = current.left;
        } else {
          predecessor.right = null;
          System.out.println(current.val);
          current = current.right;
        }
      }
    }
    return "*";
  }
  
  private String postOrder(TreeNode root) {
    TreeNode current = root;
    while(current!=null) {
      if(current.right==null) {
        System.out.println(current.val);
        current = current.left;
      } else {
        TreeNode predecessor = current.right;
        while(predecessor.left!=null && predecessor.left!=current) {
          predecessor = predecessor.left;
        }
        if(predecessor.left==null) {
          predecessor.left = current;
          System.out.println(current.val);
          current = current.right;
        } else {
          predecessor.left = null;
          current = current.left;
        }
      }
    }
    return "*";
  }
}
