package Trees;

public class PostOrderTraversal {
    Node root;

    // Constructor to initialize the root as null
    PostOrderTraversal() {
        root = null;
    }

    // Post-order traversal function
    void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        } else {
            // using divide and conquer to traverse
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        // Creating an instance of the PostOrderTraversal class
        PostOrderTraversal tree = new PostOrderTraversal();

        // Creating a binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Function call to print post-order traversal
        System.out.println("Postorder traversal of binary tree is ");
        tree.postOrderTraversal(tree.root);
    }
}
