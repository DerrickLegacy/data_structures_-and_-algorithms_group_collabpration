
//This program implements the preorder taversal of a binary tree

//step1: Create a tree node class to give a blueprint of the nodes in the binary tree
class TreeNode{
    String data;
    TreeNode left_child, right_child;

    //class constructor
    public TreeNode(String node){
        data = node;
        left_child = right_child = null;
    }
}
//step2: Create a class where all the magic/logic happens
public class Pre_order {

    //this is the method that handles the traversing among nodes using recursion
    public static void preOrderMethod(TreeNode nnode){
        if (nnode != null){
            System.out.print(nnode.data); // process the current node
            preOrderMethod(nnode.left_child); //Recursively traverse the left subtree
            preOrderMethod(nnode.right_child); //Recursively traverse the right subtree
        }
    }
    public static void main(String[] args) {

        //step3: Create a sample binary tree
        TreeNode root = new TreeNode("A");
        root.left_child = new TreeNode("B");
        root.right_child = new TreeNode("E");
        root.left_child.left_child = new TreeNode("C");
        root.left_child.right_child = new TreeNode("D");
        root.right_child.right_child = new TreeNode("F");

        //call the preorder method to traverse and print the order in which the nodes are traversed
        System.out.println("Preorder Traversal:");
        preOrderMethod(root);
    }
}
