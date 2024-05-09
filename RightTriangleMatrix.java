public class RightTriangleMatrix {
    public static void main(String[] args) {
        int n = 3; // Change the value of n for different triangle sizes
        int[][] triangleMatrix = new int[n][n];

        // Fill the matrix with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                triangleMatrix[i][j] = 0;
            }
        }

        // Fill the upper right triangle with values
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                triangleMatrix[i][j] = 1;
            }
        }

        // Print the triangle matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(triangleMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
