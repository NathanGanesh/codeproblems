package binarysearchtree;


class TreeNode {
    public int value;
    public TreeNode left, right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {

    }
}

public class BinarySearchTree {
    public static boolean contains(TreeNode root, int value) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static int maxDepth(TreeNode root) {
        if ((root == null)) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static boolean isValidBst(TreeNode treeNode) {
        if (treeNode == null) {
            return false;
        }

        return  treeNode.left.value> treeNode.value || treeNode.right.value < treeNode.value;

    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.value >= maxVal || root.value <= minVal) return false;
        return isValidBST(root.left, minVal, root.value) && isValidBST(root.right, root.value, maxVal);
    }


//    public boolean isValidBST(TreeNode root) {
//        return helper(root, null, null);
//    }

//    boolean helper(TreeNode root, Integer min, Integer max) {
//        if (root == null)
//            return true;
//
//        if ((min != null && root.val <= min) || (max != null && root.val >= max))
//            return false;
//
//        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
//    }


    public static void main(String[] args) {
//        TreeNode n1 = new TreeNode(1, null, null);
//        TreeNode n3 = new TreeNode(3, null, null);
//        TreeNode n2 = new TreeNode(2, n1, n3);
//
//
//        TreeNode nOK3 = new TreeNode(15, null, null);
//        TreeNode nOK4 = new TreeNode(7, null, null);
//        TreeNode nOK2 = new TreeNode(20, nOK3, nOK4);
//        TreeNode nOk6 = new TreeNode(9,null,null);
//        TreeNode nOK1 = new TreeNode(3, nOk6, nOK2);

        TreeNode empty = new TreeNode();

        TreeNode onlyValue = new TreeNode(0, null, null);

        TreeNode onlyThreeNods2 = new TreeNode(2, null, null);
        TreeNode onlyThreeNods1 = new TreeNode(1, null, onlyThreeNods2);


        TreeNode trekNode2 = new TreeNode(1, null, null);
        TreeNode trekNode3 = new TreeNode(3, null, null);
        TreeNode trekNode = new TreeNode(2, trekNode2, trekNode3);

        System.out.println(isValidBst(trekNode));
//
//        System.out.println(contains(n2, 3));
    }
}
