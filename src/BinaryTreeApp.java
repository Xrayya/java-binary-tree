public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<>();

        bt.root = new Node<String>("/");
        bt.root.left = new Node<String>("*");
        bt.root.right = new Node<String>("+");
        bt.root.left.left = new Node<String>("+");
        bt.root.left.right = new Node<String>("-");
        bt.root.left.left.left = new Node<String>("a");
        bt.root.left.left.right = new Node<String>("b");
        bt.root.left.right.left = new Node<String>("c");
        bt.root.left.right.right = new Node<String>("d");
        bt.root.right.left = new Node<String>("e");
        bt.root.right.right = new Node<String>("f");
        bt.inOrder(bt.root);

        System.out.println();

        bt.preOrder(bt.root);
        System.out.println();

        bt.postOrder(bt.root);
        System.out.println();

        bt.levelOrder(bt.root);
    }
}
