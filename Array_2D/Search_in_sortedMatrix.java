public class Search_in_sortedMatrix {
    public static boolean search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println(
                    "Found key at (" + row + "," + col + ")"
                );
                return true;
            } 
            else if (key < matrix[row][col]) {
                col--; // Move left
            } 
            else {
                row++; // Move down
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {32, 33, 39, 50}
        };
        int key = 33;
        search(matrix, key);
    }
}
