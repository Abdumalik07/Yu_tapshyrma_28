package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз. */

        Random random = new Random();
        Integer[] arr =new Integer[20];
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,50);
            System.out.print(arr[i]+", ");
        }
        System.out.println();

        System.out.print("Square of even numbers in array: ");
        Arrays.stream(arr).filter(x -> x % 2 == 0).map(x -> x * x).forEach(x -> System.out.print(x+", "));

        System.out.println();

        System.out.print("The max number of squares: ");
        Integer var = Arrays.stream(arr).filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).get();
        System.out.println(var);


    }
}
