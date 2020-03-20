package array_tree;

public class ArrayTree {
    String[] array;
    public ArrayTree(int size) {
        array = new String[size];
    }
    public void root(String key) {
        array[0] = key;
    }
}
