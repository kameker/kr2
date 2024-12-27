public class second {
    public static void solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int max = arr[maxIndex];
        int min = arr[minIndex];
        arr[minIndex] = max;
        arr[maxIndex] = min;
    }
    public static void printArr(int[] matrix){
        System.out.print("{");
        for(int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i] + ", ");
        }
        System.out.print("}\n");
    }
    public static void main(String[] args) {
        int[] arr = { 1, 7, 4, 7, 3, 1, 7, 7, 1, 3, 7, 3 };
        int[] arr2 = { 1, 3, 1, 5, 5 };
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = {};
        int[] arr5 = { 8, 0, 19, 27, 0, 0, 16, 8, 3, 28, 0, 21, 22, 0, 29, 18, 20, 0, 27, 21, 3, 22, 0, 18, 0, 0, 0, 0, 29, 0, 13, 5, 27, 13, 22, 28, 23, 28, 25, 18, 17, 0, 30, 13, 9, 0, 21, 13, 30, 30, 0, 19, 7, 0, 0, 9, 17, 26, 7, 12, 0, 11, 21, 0, 13, 21, 8, 6, 10, 2, 8, 25, 30, 0, 0, 12, 21, 25, 22, 27, 28, 4, 6, 15, 6, 19, 25, 15, 26, 0, 6, 0, 0, 0, 7, 0, 21, 9, 4, 20 };

        solve(arr);
        printArr(arr);

        solve(arr2);
        printArr(arr2);

        solve(arr3);
        printArr(arr3);

        solve(arr4);
        printArr(arr4);
        solve(arr5);
        printArr(arr5);
    }
}
