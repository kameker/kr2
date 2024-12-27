public class third {
    public static boolean haveEvenAndOdd(int[] arr) {
        boolean even = false;
        boolean odd = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even = true;
            }
            else {
                odd = true;
            }
            if (even && odd) {
                return true;
            }
        }
        return false;
    }
    public static int solve(int[][] arr){
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (haveEvenAndOdd(arr[i])) {
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1},
                {1, 8},
                {2, 4},
                {3, 4}
        };
        int[][] arr2 = {
                {1},
                {2},
                {1}
        };
        int[][] arr3 = {
                {1, 1, 1, 3},
                {2, 1, 5, 6}
        };
        int[][] arr4 = {
                { 100, 100, 100, 100, 101, 100 },
                { 102, 101, 102, 100, 102, 101 },
                { 100, 102, 101, 101, 101, 101 },
                { 101, 101, 100, 100, 101, 101 },
                { 100, 100, 101, 102, 102, 102 },
                { 102, 101, 101, 100, 100, 102 },
                { 102, 101, 101, 100, 101, 100 },
                { 100, 102, 100, 100, 102, 101 },
                { 101, 100, 100, 102, 102, 101 },
                { 101, 101, 101, 100, 100, 100 },
                { 101, 102, 101, 100, 100, 101 },
                { 100, 102, 101, 102, 100, 102 },
                { 102, 102, 102, 102, 101, 102 },
                { 102, 101, 102, 101, 100, 100 },
                { 101, 101, 101, 100, 101, 101 },
                { 100, 100, 100, 100, 101, 100 },
                { 101, 101, 102, 101, 102, 101 },
                { 102, 102, 101, 102, 101, 102 },
                { 102, 100, 100, 102, 101, 101 },
                { 102, 100, 102, 102, 101, 100 }
        };

        System.out.println(solve(arr));
        System.out.println(solve(arr2));
        System.out.println(solve(arr3));
        System.out.println(solve(arr4));
    }
}
