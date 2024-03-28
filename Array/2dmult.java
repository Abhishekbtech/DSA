package Array;

// class Arrmult {
//     public static void main(String[] args) {
//         int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
//         int[][] matrix2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

//         int[][] result = multiplyMatrices(matrix1, matrix2);

//         for (int i = 0; i < result.length; i++) {
//             for (int j = 0; j < result[0].length; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
//         if (matrix1[0].length != matrix2.length) {
//             throw new IllegalArgumentException(
//                     "The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
//         }

//         int[][] result = new int[matrix1.length][matrix2[0].length];

//         for (int i = 0; i < matrix1.length; i++) {
//             for (int j = 0; j < matrix2[0].length; j++) {
//                 for (int k = 0; k < matrix2.length; k++) {
//                     result[i][j] += matrix1[i][k] * matrix2[k][j];
//                 }
//             }
//         }
//         return result;
//     }
// }

class Arrmult {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrix2 = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Result Matrix:");
        for (int[] n : result) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible.");
            return null;
        }

        int[][] result = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
