public class first {
    public static int solve(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0 && arr[0] > max && arr[1] != 0) {
                max = arr[i];
            } else if (arr[i] > max && arr[i + 1] != 0 && arr[i - 1] != 0) {
                max = arr[i];
            }
        }
        if(arr.length> 1 && arr[arr.length-1] > max && arr[arr.length-2] != 0) {
            max = arr[arr.length-1];
        }
        return arr.length == 1 ? arr[0] : max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6};
        int[] arr2 = { 0, 1, 2, 3 };
        int[] arr3 = { 1, 3, 7, 0, 5, 4 };
        int[] arr4 = {1};
        int[] arr5 = { 26, 17, 12, 0, 0, 0, 0, 0, 5, 4, 7, 12, 0, 7, 29, 10, 0, 8, 20, 28, 27, 0, 19, 10, 11, 12, 24, 5, 6, 24, 21, 13, 6, 6, 9, 3, 15, 22, 28, 7, 25, 27, 15, 0, 26, 2, 9, 2, 0, 8, 0, 1, 15, 11, 12, 11, 8, 30, 0, 14, 29, 9, 0, 2, 0, 3, 0, 17, 27, 0, 28, 1, 0, 28, 0, 19, 13, 0, 7, 0, 16, 29, 0, 16, 15, 3, 0, 4, 16, 0, 0, 15, 23, 7, 21, 28, 6, 0, 23, 25 };
        System.out.println(solve(arr));
        System.out.println(solve(arr2));
        System.out.println(solve(arr3));
        System.out.println(solve(arr4));
        System.out.println(solve(arr5));
    }
}
