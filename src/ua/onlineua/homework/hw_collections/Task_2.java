package ua.onlineua.homework.hw_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Task_2 {

    public static void main(String[] args) {
        //initialization input array
        ArrayList<Integer> inputArray = new ArrayListAdvanced<>();

        //add and print elements into array
        System.out.println("Input Array is: ");
        for (int i = 0; i < 10; i++) {
            inputArray.add((int) (Math.random() * 10));
            System.out.print(inputArray.get(i) + ", ");
        }
        System.out.println();

        // try to clear
        try {
            inputArray.clear();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        //try to remove elements with index 0
        try {
            inputArray.remove(0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}

class ArrayListAdvanced<E> extends ArrayList<E> {

    @Override
    public void clear() throws RuntimeException {
        throw new RuntimeException("Collection cannot be cleared!");
    }

    @Override
    public E set(int index, E element) {
        throw new RuntimeException("Element cannot be replaced in this ArrayList!");
    }

    @Override
    public E remove(int index) {
        throw new RuntimeException("Element cannot be removed from this ArrayList!");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("Element cannot be removed from this ArrayList!");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new RuntimeException("Collection cannot be removed from this ArrayList!");
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        throw new RuntimeException("Collection cannot be cleaned according to filter!");
    }

    @Override
    public void removeRange(int fromIndex, int toIndex) {
        throw new RuntimeException("Elements cannot be removed!");
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new RuntimeException("Elements cannot be replaced!");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new RuntimeException("Collection cannot be cleared!");
    }

}
