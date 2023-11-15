package Trees;

public class InOrderTransversal {
    Node root;

    InOrderTransversal() {
        root = null;
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        } else {
            // using divide and conquer to traverse
            printInorder(node.left);
            System.out.print(node.key + " ");
            printInorder(node.right);
        }
    }

    // Driver code
    public static void main(String[] args) {
        InOrderTransversal tree = new InOrderTransversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(5);

        // Function call
        System.out.println(
                "Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);
    }
}
