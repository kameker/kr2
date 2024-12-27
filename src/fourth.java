import java.util.Arrays;

public class fourth {
    public static int[][] solve(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = i + j;
            }
        }
        return arr;
    }
    public static void printArr2(int[][] matrix){
        System.out.print("{");
        for(int i = 0; i < matrix.length; i++){
            if (i == matrix.length - 1){
                System.out.print(Arrays.toString(matrix[i]));
            }
            else {System.out.print(Arrays.toString(matrix[i]) + ", \n");}
        }
        System.out.print("}\n");
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = solve(4, 6);
        int[][] arr2 = solve(2, 2);
        int[][] arr3 = solve(10, 5);
        int[][] arr4 = solve(10, 10);

        printArr2(arr);
        printArr2(arr2);
        printArr2(arr3);
        printArr2(arr4);
    }
}
