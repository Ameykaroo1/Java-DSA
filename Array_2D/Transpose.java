
public class Transpose {

    public static void printMatrix(int arr[][]) {
        System.out.println("The matrix is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int col = 3, row = 2;

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        printMatrix(arr);

        int transpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        printMatrix(transpose); // Fixed line
    }
}
