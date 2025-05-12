import javax.crypto.spec.PSource;
import java.util.*;

public class BinaryTree {
    static class Node {
        int data;
        Node left,right;
        Node(int dat)
        {
            data = dat;
            left = right = null;
        }
    }

    static void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void BFS (Node root)
    {
        if(root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
    }

    static List<List<Integer>> LevelOrderTraverse(Node root)
    {
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null)
            return result;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> sublist= new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node node = queue.poll();
                sublist.add(node.data);
                if(node.left != null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            result.add(sublist);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);


        System.out.println("InOrder Traversal: ");
        inOrder(root);

        System.out.println();
        System.out.print("BFS: ");
        BFS(root);

        System.out.println();
        System.out.println("Level Order Traversal: ");
        System.out.println(LevelOrderTraverse(root));;
    }
}
