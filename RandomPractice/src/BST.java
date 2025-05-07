class Node {
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data = data;
    }
}
public class BST {
    static Node insert(Node root,int data)
    {
        if(root == null)
            return new Node(data);
        if(data < root.data)
            root.left = insert(root.left,data);
        else
            root.right = insert(root.right,data);
        return root;
    }

    static Node insert_(Node root,int data)
    {
        Node temp = new Node(data);
        if(root == null)
            return temp;
        Node parent = null;
        Node current = root;
        while (current!=null)
        {
            parent = current;
            if(data < current.data)
                current=current.left;
            else
                current=current.right;
        }
        if(parent.data<data)
            parent.right = temp;
        else
            parent.left = temp;
        return root;
    }

    static Node search(Node root, int data)
    {
        if(root == null || root.data == data)
            return root;
        if(data>root.data)
            return search(root.right,data);
        return search(root.left,data);
    }

    static void inorder(Node root)
    {
        if(root==null) {
            return;
        }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
    }

    static void preorder(Node root)
    {
        if(root==null) {
            return;
        }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
    }

    static void postorder(Node root)
    {
        if(root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }

    static int getMin(Node root)
    {
        if(root == null)
            return -1;
        while(root.left!=null)
        {
            root = root.left;
        }
        return root.data;
    }

    static int getMax(Node root)
    {
        if(root == null)
            return -1;
        while(root.right!=null)
        {
            root = root.right;
        }
        return root.data;
    }

    static Node getLeftMost(Node root)
    {
        Node current = root;
        while(current.left!=null)
        {
            current = current.left;
        }
        return current;
    }

    static int getInOrderSuccessor(Node root,int data)
    {
        if(root == null)
            return -1;
        if(data == root.data && root.right!=null)
            return getLeftMost(root.right).data;
        int successor = -1;
        while(root!=null)
        {
            if(data<root.data)
            {
                successor = root.data;
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return successor;
    }

    static Node getRightMost(Node root)
    {
        while(root.right!=null)
        {
            root=root.right;
        }
        return root;
    }

    static int getInOrderPredecessor(Node root, int data)
    {
        if(root == null)
            return -1;
        if(root.data == data && root.left!=null)
            return getRightMost(root.left).data;
        int predecessor = -1;
        while(root!=null)
        {
            if(root.data < data)
            {
                predecessor = root.data;
                root = root.right;
            }
            else
            {
                root = root.left;
            }
        }
        return predecessor;
    }

    static Node deleteNode(Node root, int data)
    {
        if(root == null)
            return null;
        else
        {
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;

            if(data < root.data)
                root.left = deleteNode(root.left,data);
            else if(data > root.data)
                root.right = deleteNode(root.right,data);
            else
            {

                Node succ = getLeftMost(root.right);
                System.out.println("Successor check: "+succ.data);
                root.data = succ.data;
                root.right = deleteNode(root.right,succ.data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert_(root, 100);
        root = insert_(root, 20);
        root = insert_(root, 10);
        root = insert_(root, 30);
        root = insert_(root, 200);
        root = insert_(root, 150);
        root = insert_(root, 300);
        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder : ");
        postorder(root);
        System.out.println();

        System.out.println(search(root,40)!=null? "Found" : "Not Found");
        System.out.println(search(root,100)!=null? "Found" : "Not Found");

        System.out.println(getMin(root));
        System.out.println(getMax(root));

        System.out.println("InOrder Successor of (30): "+ getInOrderSuccessor(root,30));

        System.out.println("InOrder Predecessor of (30): "+ getInOrderPredecessor(root,30));

        deleteNode(root,30);
        inorder(root);
        System.out.println();
        deleteNode(root,100);
        inorder(root);
    }
}
