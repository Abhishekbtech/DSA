package Array;

import java.util.Scanner;

class Arr2d {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the row:");
            int row = scanner.nextInt();
            System.out.println("Enter the size of the col:");
            int col = scanner.nextInt();
            int[][] array = new int[row][col];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            // System.out.println("The elements of the array are:");
            // for (int i = 0; i < row; i++) {
            // for (int j = 0; j < col; j++) {
            // System.out.print(array[i][j] + " ");
            // }
            // System.out.println();
            // }

            // we can use this as well for print the array
            for (int[] n : array) {
                for (int m : n) {
                    System.out.print(m + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error in input!");
        }
    }
}
