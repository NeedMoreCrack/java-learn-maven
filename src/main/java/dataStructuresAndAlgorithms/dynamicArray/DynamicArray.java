package dataStructuresAndAlgorithms.dynamicArray;

public class DynamicArray {
    public static void main(String[] args) {
        int[] source = {1, 2, 3};
        int[] target = new int[source.length];
        System.arraycopy(source, 0, target, 0, source.length);
    }
}
