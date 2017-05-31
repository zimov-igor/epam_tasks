/*














































































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
        Node newNode = new Node(key, data); // Создание нового узла
        if(root==null) // Корневой узел не существует
            root = newNode;
        else  // Корневой узел занят
        {
            Node current = root; // 15   Начать с корневого узла
            Node parent;//         null
            while(true) //                      (внутренний выход из цикла)
            {
                parent = current; //  15
                if(key < current.key)          // Двигаться налево?
                {
                    current = current.leftChild; // null
                    if(current == null)              // Если достигнут конец цепочки,
                    { // вставить слева
                        parent.leftChild = newNode;
                        parent.leftChild.parent = parent;
                        return;
                    }
                }
                else // Или направо?
                {
                    current = current.rightChild;
                    if(current == null) // Если достигнут конец цепочки,
                    { // вставить справа
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
        while( parent!= null && x == parent.rightChild){
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

    public Node find(int param) // Поиск узла с заданным ключом
    { // (предполагается, что дерево не пустое)
        Node current = root; // Начать с корневого узла
        while(current.key != param) // Пока не найдено совпадение
        {
            if(param < current.key) // Двигаться налево?
                current = current.leftChild;
            else // Или направо?
                current = current.rightChild;
            if(current == null) // Если потомка нет,
                return null; // поиск завершился неудачей
        }
        return current; // Элемент найден
    }

    public void display(Node root){
        if(root!=null){
            display(root.leftChild);
            System.out.print(" " + root);
            display(root.rightChild);
        }
    }


}
*/
