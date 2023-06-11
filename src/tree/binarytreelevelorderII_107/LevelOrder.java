package tree.binarytreelevelorderII_107;

import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
    addLevel(list, 0, root);
    return list;
}

private void addLevel(LinkedList<List<Integer>> list, int level,
        TreeNode node) {
    if (node == null)
        return;
    if (list.size() - 1 < level)
        list.addFirst(new LinkedList<Integer>());
    list.get(list.size() - 1 - level).add(node.val);
    addLevel(list, level + 1, node.left);
    addLevel(list, level + 1, node.right);
}

public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.right = new TreeNode(20);
    root.right.right = new TreeNode(7);
    root.right.left = new TreeNode(15);
    /* root.right.right.right.right = new TreeNode_old(2); */

    root.left = new TreeNode(9);
    root.left.left = null;
    root.left.right = null;
    /* root.left.left.left.left = new TreeNode_old(2); */

    System.out.println(new LevelOrder().levelOrderBottom(root));
}
}
