public class LeftTriangleMatrix {
    public static void main(String[] args) {
        int n = 3; // Size of the matrix (can be adjusted)
        int[][] matrix = new int[n][n];

        // Populate the left triangular matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = 1; // You can set any value here, I'm using 1 for simplicity
            }
        }

        // Display the left triangular matrix
        System.out.println("Left Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
