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


        System.out.println("BST Contains 27:");
        System.out.println(myBST.rContains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.rContains(17));


        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */

    }

}
