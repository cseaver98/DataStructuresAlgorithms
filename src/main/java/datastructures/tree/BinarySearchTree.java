package datastructures.tree;

public class BinarySearchTree {

    Node root;
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == newNode.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);

        if (currentNode.value > value) {
            currentNode.left = rInsert(currentNode.left, value);
        }
        else {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value == value) return true;
            if (value < temp.value) {
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        return false;
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;

        if (currentNode.value > value) {
            return rContains(currentNode.left, value);
        }
        else {
            return rContains(currentNode.right, value);
        }
    }
    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;
        if (currentNode.value > value) {
            currentNode.left = deleteNode(currentNode.left, value);
        }
        else if (currentNode.value < value) {
            currentNode.right = deleteNode(currentNode.right, value);
        }
        else {
            if (currentNode.left == null && currentNode.right == null) { //is leaf node?
                return null;
            }
            else if (currentNode.left == null) { //node has child on right
                currentNode = currentNode.right;
            }
            else if (currentNode.right == null) { //node has child on left
                currentNode = currentNode.left;
            }
            else { //node has child on left and right
                int subTreeMin = findMinValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;

    }

    private int findMinValue(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }
}
