package practice9_collection;

class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }
    public Node getRootNode(){
        return root;
    }

    public void insert(int key, double data){
        Node newNode = new Node(key, data);
        if(root==null)
            root = newNode;
        else {
            Node current = root; // 15
            Node parent;//         null
            while(true){
                parent = current; //  15
                if(key < current.key){
                    current = current.leftChild; // null
                    if(current == null){
                        parent.leftChild = newNode;
                        parent.leftChild.parent = parent;
                        return;
                    }
                }
                else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        parent.rightChild.parent = parent;
                        return;
                    }
                }
            }
        }
    }

    public Node findInOrderSuccessor(Node x){

        if(x.rightChild != null){
            return leftMostNode(x.rightChild);
        }
        Node parent = x.parent;
        while( parent != null && x == parent.rightChild){
            x = parent;
            parent = parent.parent;
        }
        return parent;
    }
    
    public Node leftMostNode(Node x){
        while(x.leftChild != null){
            x = x.leftChild;
        }
        return x;
    }

    public Node find(int param){
        Node current = root;
        while(current.key != param){
            if(param < current.key)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
        }
        return current;
    }

    public void display(Node root){
        if(root!= null){
            display(root.leftChild);
            System.out.print(" " + root);
            display(root.rightChild);
        }
    }


}
