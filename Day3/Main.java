package Day3;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(60);
        bst.insert(50);
        bst.insert(40);
        bst.insert(30);
        bst.insert(20);
        bst.insert(10);
        bst.insert(34);
        bst.postOrder(bst.root);
   
    }
}
