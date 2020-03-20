package array_tree;

public class ArrayTree {
    String[] array;
    public ArrayTree(int size) {
        array = new String[size];
    }
    public void root(String key) {
        array[0] = key;
    }
    public void ParentNode(String value, int index) {
        if (index > array.length) {
            System.out.println("invalid index number");
        }
        else if(index==0){
            System.out.println("can't inserted, reserved by root value ");
        }
        else {
            array[(index - 1) / 2] = value;
            System.out.println("parent node inserted");
        }
    }
}
