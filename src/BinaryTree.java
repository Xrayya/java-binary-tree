import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
    Node<T> root;

    public void inOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        this.inOrder(node.left);
        System.out.printf("%s  ", node.data);
        this.inOrder(node.right);
    }

    public void preOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s  ", node.data);
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    public void postOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.printf("%s  ", node.data);
    }

    public void levelOrder(Node<T> node) {
        if (node == null) {
            return;
        }

        Queue<Node<T>> q = new LinkedList<>();
        q.add(node);
        while (q.peek() != null) {
            Node<T> n = q.poll();
            System.out.printf("%s  ", n.data);
            if (n.left != null) {
                q.add(n.left);
            }

            if (n.right != null) {
                q.add(n.right);
            }
        }
    }
}
