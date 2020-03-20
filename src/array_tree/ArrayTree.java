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
    public void LeftChildNode(String left_value, int index) {
        if (array[index] == null) {
            System.out.println("can't be inserted,no parent node found");
        }
        else if(index==0){
            System.out.println("can't inserted, reserved by root value ");
        }
        else {
            array[(2 * index) + 1] = left_value;
            System.out.println("left child node inserted");
        }
    }
    public void RightChildNode(String right_value, int index) {
        if (array[index] == null) {
            System.out.println("can't be inserted,no parent node found");
        }
        else if(index==0){
            System.out.println("can't inserted, reserved by root value ");
        }
        else {
            array[(2 * index) + 2] = right_value;
            System.out.println("right child node inserted");
        }
    }
    public void ViewArray() {
        System.out.println("THE TREE IS:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.print(" _ ");
            } else {
                System.out.print(" "+array[i] +" ");
            }
        }
        System.out.println("");


}
