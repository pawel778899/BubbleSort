package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        BubbleSort bubbleSort = new BubbleSort();
        Random random = new Random();
        int[] array = new int[10];

            for(int i=0;i<10;i++) {
                array[i]=random.nextInt(100);
                System.out.println(array[i]);
            }

        bubbleSort.bubbleSortMethod(array);
        
        System.out.println("Sorted array");
        bubbleSort.printArray(array);
    }
}
