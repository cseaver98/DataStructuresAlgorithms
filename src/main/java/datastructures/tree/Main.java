package datastructures.tree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(47);
        myBST.rInsert(21);
        myBST.rInsert(76);
        myBST.rInsert(18);
        myBST.rInsert(27);
        myBST.rInsert(52);
        myBST.rInsert(82);

        System.out.println(myBST.BFS());
        System.out.println(myBST.DFSInOrder());

    }

}
