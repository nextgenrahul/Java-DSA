package Post43.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        // Do something

        System.out.println("hello");
        // Here you can only pass number type
    }
    public void add(T num) {
        if (isFull()) {
            resize();

        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // Copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) (data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList { " + "data " + Arrays.toString(data) + ", size = " + size + " } ";
    }

    public static void main(String[] args) {

        // CustomArrayList list = new CustomArrayList();
        // list.add(3);
        // list.add(4);
        // list.add(8);
        // for (int i = 0; i < 13; i++) {
        // list.add(2 * i);
        // }
        // System.out.println(list);

        // ArrayList<String> list3 = new ArrayList<>();
        // list3.add("Hello");

        // ArrayList list = new ArrayList();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1, 3434);
        // list.size();
        // list.isEmpty();

        CustomGenArrayList<Integer> lists = new CustomGenArrayList<>();
        for (int i = 0; i < 13; i++) {
            lists.add(2 * i);
        }

        System.out.println(lists);
    }

}
