package practice9_collection;


public class TestTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(15,1.0);
        tree.insert(20,1.0);
        tree.insert(10,1.0);
        tree.insert(17,1.0);
        tree.insert(25,1.0);
        tree.insert(5,1.0);
        tree.insert(1,1.0);
        tree.insert(7,1.0);
        tree.insert(8,1.0);
        tree.display(tree.getRootNode());

        Node node = tree.find(25);
        System.out.println("\n");
        System.out.println(tree.findInOrderSuccessor(node));
    }

}
