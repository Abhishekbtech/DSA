package Array;

import java.util.Scanner;

class Arr {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("The elements of the array are:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            // we can use this as well for print the array
            for (int n : array) {
                System.out.print(n + " ");
            }
        }
    }
}