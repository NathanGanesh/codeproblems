package alertservice;

class Node {
    private Node leftChild, rightChild;

    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        int leftHeight = 0;
        int rightHeight = 0;
        if (this.leftChild != null) {
            leftHeight = getLeftChild().height();
        }
        if (this.rightChild != null) {
            rightHeight = getRightChild().height();
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }


    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}