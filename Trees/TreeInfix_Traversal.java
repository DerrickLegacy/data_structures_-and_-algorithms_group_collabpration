class TreeNode {
    char data;
    TreeNode left, right;

    public TreeNode(char item) {
        data = item;
        left = right = null;
    }

    public TreeNode(int i) {
    }
}

public class TreeInfix_Traversal {
    private TreeNode root;

    public  TreeInfix_Traversal() {
        root = null;
    }

    // Infix traversal
    private void infixTraversal(TreeNode node) {
        if (node != null) {
            infixTraversal(node.left);
            System.out.print(node.data + " ");
            infixTraversal(node.right);
        }
    }

    public void infixTraversal() {
        infixTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        TreeInfix_Traversal tree = new  TreeInfix_Traversal();

        // Build the expression tree
        tree.root = new TreeNode('*');
        tree.root.left = new TreeNode('+');
        tree.root.right = new TreeNode('5');
        tree.root.left.left = new TreeNode('2');
        tree.root.left.right = new TreeNode('3');

        // Perform infix traversal and print the result
        System.out.println("Infix Traversal:");
        tree.infixTraversal();
    }
}
