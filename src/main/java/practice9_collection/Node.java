package practice9_collection;

class Node {
    public int key;
    public double data;
    public Node parent;
    public Node leftChild;
    public Node rightChild;

    public Node(int key, double data) {
        this.key = key;
        this.data = data;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        return "{ "+ key + ": " + data + "}";
    }
}

