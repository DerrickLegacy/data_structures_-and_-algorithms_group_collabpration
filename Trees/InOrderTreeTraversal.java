package Trees;

public class InOrderTreeTraversal {
    Node root;

    InOrderTreeTraversal() {
        root = null;
    }

    void InOrderTransversal(Node node) {
        if (node == null) {
            return;
        } else {
            // using divide and conquer to traverse
            InOrderTransversal(node.left);
            System.out.print(node.key + " ");
            InOrderTransversal(node.right);
        }
    }

    // Driver code
    public static void main(String[] args) {
        InOrderTreeTraversal tree = new InOrderTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(5);

        // Function call
        System.out.println("Inorder tree traversal of the binary tree: ");
        tree.InOrderTransversal(tree.root);
    }
}
