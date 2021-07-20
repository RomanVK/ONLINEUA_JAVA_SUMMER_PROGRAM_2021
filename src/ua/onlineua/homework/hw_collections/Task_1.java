package ua.onlineua.homework.hw_collections;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        //initialization input array
        ArrayList<Integer> inputArray = new ArrayList<>();

        //initialization output map
        Map<Integer, Integer> outputMap = new Hashtable<>();

        //add and print elements into array
        System.out.println("Input Array is: ");
        for (int i = 0; i < 10; i++) {
            inputArray.add((int) (Math.random()*10));
            System.out.print(inputArray.get(i) +", ");
        }
        System.out.println();

        //calculate count of repeating each element
        System.out.println("Count of repeating each element is: ");
        for (Integer number:inputArray
             ) {
            if (outputMap.containsKey(number)) {
                outputMap.put(number,outputMap.get(number) + 1);
            } else {
                outputMap.put(number, 1);
            }
        }

        //print output Map
        System.out.println(outputMap);

    }

}
